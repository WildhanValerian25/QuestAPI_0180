<div align="center">

# 🌐 Data Siswa — Local REST API

**Praktikum Pemrograman Aplikasi Mobile — Activity 9 (Local Rest API)**

Aplikasi Android yang menampilkan dan menambah data siswa melalui **REST API lokal (PHP + MySQL)**,
menggunakan **Retrofit** dan **Kotlinx Serialization**, dibangun dengan **Kotlin**, **Jetpack Compose**, dan arsitektur **MVVM**.

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Retrofit](https://img.shields.io/badge/Retrofit-48B983?style=for-the-badge&logo=square&logoColor=white)
![PHP](https://img.shields.io/badge/PHP-777BB4?style=for-the-badge&logo=php&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

</div>

---

## 📱 Hasil Running — Semua Operasi

<div align="center">

| Daftar Kosong (GET) | Form Tambah Siswa (POST) | Daftar Siswa (GET) |
|:---:|:---:|:---:|
| <img width="230" alt="Daftar kosong" src="LINK_1" /> | <img width="230" alt="Form tambah" src="LINK_2" /> | <img width="230" alt="Daftar siswa" src="LINK_3" /> |
| Data dari API masih kosong | Input data lalu *Submit* → dikirim ke `insertTM.php` | Data ditampilkan dari `bacaTeman.php` |

| Gagal Terhubung ke Server | Data di Database (phpMyAdmin) |
|:---:|:---:|
| <img width="230" alt="Error" src="LINK_4" /> | <img width="420" alt="phpMyAdmin" src="LINK_5" /> |
| Tampil saat server mati, tekan *Coba Lagi* | Data tersimpan di tabel `teman` |

</div>

---

## ✨ Fitur

| Operasi | Endpoint | Keterangan |
|---|---|---|
| 📋 **Read** | `GET bacaTeman.php` | Menampilkan seluruh data siswa (urut nama) |
| ➕ **Create** | `POST insertTM.php` | Menambah data siswa dengan validasi input |
| ⏳ **Loading** | – | Indikator loading saat mengambil data |
| ⚠️ **Error** | – | Pesan gagal + tombol *Coba Lagi* saat server tidak dapat dihubungi |

---

## 🏗️ Arsitektur

```
View (Compose)  →  ViewModel  →  Repository  →  Retrofit (ServiceApiSiswa)  →  PHP API  →  MySQL
HalamanHome        HomeViewModel  JaringanRepository   GET  bacaTeman.php        koneks.php   TIUMY.teman
HalamanEntry       EntryViewModel DataSiswa             POST insertTM.php
```

---

## 📂 Struktur Project

```
com.example.mydatasiswa
├── apiservice/
│   └── ServiceApiSiswa.kt        # Endpoint Retrofit (GET & POST)
├── modeldata/
│   └── DataSiswa.kt              # Model data @Serializable
├── repositori/
│   ├── ContainerApp.kt           # Retrofit, container & AplikasiDataSiswa
│   └── RepositoryDataSiswa.kt    # Repository jaringan
├── uicontroller/
│   ├── route/                    # DestinasiNavigasi, DestinasiHome, DestinasiEntry
│   └── PetaNavigasi.kt           # NavHost
├── view/
│   ├── HalamanHome.kt            # Daftar siswa + loading/error
│   ├── HalamanEntry.kt           # Form tambah siswa
│   └── SiswaTopAppBar.kt
├── viewmodel/
│   ├── HomeViewModel.kt          # StatusUiSiswa (Loading/Success/Error)
│   ├── EntryViewModel.kt         # Validasi & kirim data
│   └── PenyediaViewModel.kt      # Factory ViewModel
└── MainActivity.kt

backend/                          # File PHP & SQL server lokal
├── koneks.php
├── bacateman.php
├── insertTM.php
└── database.sql
```

---

## 🚀 Cara Menjalankan

1. Jalankan **Apache** dan **MySQL** (XAMPP/Laragon).
2. Import `backend/database.sql` di phpMyAdmin.
3. Salin isi folder `backend/` ke `htdocs/umyTI/` (XAMPP) atau `www/umyTI/` (Laragon).
4. Cek di browser: `http://localhost/umyTI/bacateman.php` → tampil `[]` atau data JSON.
5. Buka project di Android Studio, lalu jalankan di **emulator** (base URL `http://10.0.2.2/umyTI/`).
