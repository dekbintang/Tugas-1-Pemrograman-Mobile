# 📱 HelloWorldApp

Aplikasi Android sederhana yang menampilkan **Hello World!** dan tombol untuk menampilkan identitas mahasiswa (Nama & NIM), dibuat menggunakan **Kotlin** di Android Studio.

---

## 📸 Screenshot

<p align="center">
  <img src="screenshots/home.png" width="250" alt="Tampilan Awal"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="screenshots/identitas.png" width="250" alt="Setelah Tombol Diklik"/>
</p>

<p align="center">
  <em>Tampilan Awal &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Setelah Tombol Diklik</em>
</p>

---

## 🎯 Fitur

- Menampilkan teks **"Hello World!"** saat aplikasi dibuka
- Tombol **"Tampilkan Identitas"** untuk menampilkan Nama dan NIM
- Tombol berubah menjadi **"Sembunyikan"** setelah diklik
- Identitas dapat disembunyikan kembali dengan menekan tombol yang sama

---

## 🛠️ Teknologi yang Digunakan

| Teknologi | Keterangan |
|---|---|
| Language | Kotlin |
| Min SDK | API 24 (Android 7.0 Nougat) |
| Target SDK | API 35 (Android 15) |
| IDE | Android Studio |
| Build System | Gradle (Kotlin DSL) |

---

## 📁 Struktur Project

```
HelloWorldApp/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/helloworldapp/
│           │   └── MainActivity.kt        ← Logika utama aplikasi
│           ├── res/
│           │   └── layout/
│           │       └── activity_main.xml  ← Desain tampilan UI
│           └── AndroidManifest.xml
├── screenshots/
│   ├── home.png                           ← Screenshot tampilan awal
│   └── identitas.png                      ← Screenshot setelah klik tombol
├── build.gradle.kts
└── README.md
```

---

## ⚙️ Cara Menjalankan Project

### Prasyarat
- [Android Studio](https://developer.android.com/studio) sudah terinstal
- JDK 11 atau lebih baru
- Android SDK terinstal

### Langkah-langkah

**1. Clone repository ini**
```bash
git clone https://github.com/dekbintang/HelloWorldApp.git
```

**2. Buka di Android Studio**
```
File → Open → Pilih folder HelloWorldApp
```

**3. Tunggu Gradle Sync selesai**

**4. Jalankan aplikasi**
- Emulator: klik tombol **Run ▶** atau tekan `Shift + F10`
- Perangkat fisik: hubungkan via USB dengan **USB Debugging** aktif

---

## 📝 Kode Utama

### activity_main.xml
```xml
<LinearLayout
    android:orientation="vertical"
    android:gravity="center"
    android:padding="24dp">

    <TextView
        android:id="@+id/tvHello"
        android:text="Hello World!"
        android:textSize="32sp"
        android:textStyle="bold" />

    <Button
        android:id="@+id/btnTampilkan"
        android:text="Tampilkan Identitas" />

    <TextView
        android:id="@+id/tvIdentitas"
        android:visibility="gone"
        android:textColor="#1976D2" />

</LinearLayout>
```

### MainActivity.kt
```kotlin
class MainActivity : AppCompatActivity() {

    private lateinit var tvHello: TextView
    private lateinit var btnTampilkan: Button
    private lateinit var tvIdentitas: TextView

    private val nama = "I Kadek Bintang Adi Bimantara"
    private val nim  = "2405551049"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello      = findViewById(R.id.tvHello)
        btnTampilkan = findViewById(R.id.btnTampilkan)
        tvIdentitas  = findViewById(R.id.tvIdentitas)

        btnTampilkan.setOnClickListener {
            tvIdentitas.text = "Nama : $nama\nNIM  : $nim"
            tvIdentitas.visibility = View.VISIBLE
            btnTampilkan.text = "Sembunyikan"
        }
    }
}
```

---

## 👤 Identitas Mahasiswa

| | |
|---|---|
| **Nama** | I Kadek Bintang Adi Bimantara |
| **NIM** | 2405551049 |
| **Mata Kuliah** | Pemrograman Mobile |
| **Program Studi** | Teknologi Informasi |
| **Universitas** | Universitas Udayana |

---

## 📄 Lisensi

Project ini dibuat untuk keperluan praktikum mata kuliah Pemrograman Mobile.

---

<p align="center">Dibuat dengan ❤️ menggunakan Kotlin & Android Studio</p>
