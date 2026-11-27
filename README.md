# 🌐 Data Siswa — Local REST API

**Activity 9 — Pemrograman Aplikasi Mobile**

Aplikasi Android untuk menampilkan dan menambah data siswa melalui **REST API lokal (PHP + MySQL)** menggunakan **Retrofit**, **Jetpack Compose**, dan arsitektur **MVVM**.

---

## 📱 Bukti Pengerjaan

| Tambah Siswa | Daftar Siswa |
|:---:|:---:|
| <img width="250" src="https://github.com/user-attachments/assets/88e57d8e-dc2a-4800-bee3-ea8d062e70e1" /> | <img width="250" src="https://github.com/user-attachments/assets/92c6a5c7-3650-4a02-ba49-486065ab62a7" /> |
| Data dikirim ke `insertTM.php` | Data diambil dari `bacaTeman.php` |

**Data tersimpan di database (HeidiSQL):**

<img width="800" src="https://github.com/user-attachments/assets/f0bcf605-2b1f-4d52-b9ac-0d5e48118ede" />

---

## ✨ Fitur

- 📋 Menampilkan daftar siswa dari API (`GET`)
- ➕ Menambah data siswa ke database (`POST`)
- ⏳ Tampilan loading dan error dengan tombol *Coba Lagi*

---

## 🚀 Cara Menjalankan

1. Jalankan **Laragon** → **Start All**
2. Jalankan `backend/database.sql` di HeidiSQL
3. Salin file PHP di folder `backend/` ke `C:\laragon\www\umyTI\`
4. Jalankan aplikasi di emulator (base URL: `http://10.0.2.2/umyTI/`)
