package com.gadgeski.ejector

import android.app.PendingIntent
import android.content.Intent
import android.os.VibrationEffect
import android.os.Vibrator
import android.service.quicksettings.TileService

class EjectorTileService : TileService() {

    override fun onClick() {
        super.onClick()

        // 0. Cyberpunk Haptic Feedback
        executeMechanicalHaptics()

        // 1. ホーム画面へ「脱出」するインテント
        val intent = Intent(Intent.ACTION_MAIN).apply {
            addCategory(Intent.CATEGORY_HOME)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }

        // 2. PendingIntentの作成 (API 34 / Immutable)
        val pendingIntent = PendingIntent.getActivity(
            this,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )

        // 3. パネルを閉じてホームへ
        startActivityAndCollapse(pendingIntent)
    }

    /**
     * 重厚な機械的衝撃を指先に伝える (Updated for correctness)
     */
    private fun executeMechanicalHaptics() {
        // Fix: 文字列定数ではなく、クラス型指定でサービスを取得 (警告解消)
        val vibrator = getSystemService(Vibrator::class.java)

        if (vibrator != null && vibrator.hasVibrator()) {

            // Abbozzo Mode: Heavy Industrial Switch
            // Fix: 存在しないHEAVY_CLICKを廃止し、実在する 'PRIMITIVE_THUD' (重い衝撃) を採用
            val composition = VibrationEffect.startComposition()
                .addPrimitive(VibrationEffect.Composition.PRIMITIVE_LOW_TICK, 1.0f)
                .addPrimitive(VibrationEffect.Composition.PRIMITIVE_THUD, 1.0f) // ドスッという重い感触
                .compose()

            vibrator.vibrate(composition)
        }
    }
}