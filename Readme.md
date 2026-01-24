# Ejector ⏏️

> **Instant Home Ejection System with Industrial Haptics.**
> デジタル空間からの「物理的」な脱出体験。

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-purple) ![API](https://img.shields.io/badge/API-34%2B-green)

## ⚡ Overview

**Ejector** は、Androidのクイック設定パネル（Quick Settings Tile）から、ワンタップでホーム画面へ戻るための単機能ユーティリティです。

従来の「ホームボタン」操作とは異なり、このアプリは **"Abbozzo (Cyberpunk)"** の世界観に基づいた設計思想を持っています。システムバイブレーションAPI (`VibrationEffect.Composition`) を駆使した重厚なハプティックフィードバックにより、まるで**緊急脱出レバーを引いたかのような物理的な感触**と共に、現在のアクティビティを強制終了（Collapse）させます。

## 🛠 Tech Stack & Core Competence

本プロジェクトは、Android 14 (API Level 34) 以降の厳格なセキュリティ基準と、Warningを一切許容しないクリーンコード思想に基づいて実装されています。

- **Language:** Kotlin
- **Component:** `TileService` (Quick Settings API)
- **Target SDK:** Android 14 (API 34) Only
- **Security:**
  - `PendingIntent` with `FLAG_IMMUTABLE` (Background Activity Launch対応)
  - Strict Permission Handling (`android.permission.VIBRATE`)
- **UX Engineering:**
  - **Haptic Feedback:** `PRIMITIVE_LOW_TICK` + `PRIMITIVE_THUD` による機械的スイッチ感の再現。
  - **Zero UI:** アクティビティを持たず、バックグラウンドサービスのみで完結。

## 🚀 Installation & Usage

1. アプリをインストールします。
2. ステータスバーを完全に引き下げ、クイック設定パネルを開きます。
3. 編集ボタン（鉛筆アイコン）をタップします。
4. **"Ejector"** タイルをドラッグ＆ドロップで有効な領域に追加します。
5. タイルをタップすると、指先に衝撃が走り、即座にホーム画面へ遷移します。

## 🔧 Development

### Requirements

- Android Studio Iguana or later
- Min SDK: 34 (Android 14)

### Architecture

- **No-XML:** マニフェストとKotlinコードのみで構成される極小設計。
- **Warning-Free:** Lint警告を完全に排除した堅牢な実装。

---

Ejector - Instant Home Ejection System with Industrial Haptics.
