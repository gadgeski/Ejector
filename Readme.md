# Ejector ⏏️

> **Easily complete your Daily Quest.**
> 『その一瞬のラグを、飛び越えろ。』

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-purple) ![API](https://img.shields.io/badge/API-34%2B-green)

## ⚡ Overview

**『日課（Daily Quest）を手軽に駆け抜けよう』**

ゲームの日課を終え、次のアプリへ移動したい時。
没入モードの全画面表示から、いちいち画面端をスワイプしてナビゲーションバーを出し、ホームボタンを探す……その「コンマ数秒のラグ」に苛立ちを感じたことはありませんか？

## **Ejector** はその悩みを解決します。

クイック設定パネルからボタン一つで、Androidシステムへ「緊急脱出（Emergency Eject）」シグナルを送信。
ただ戻るだけではない。**重厚なハプティックフィードバック（衝撃）** と共に、指先に残る確かな「脱出」の感触をお楽しみください。

さぁ、様々なゲームの日課（Daily Quest）を手軽に駆け抜けよう！

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
