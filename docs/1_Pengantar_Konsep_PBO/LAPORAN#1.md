# Laporan Praktikum #1 - Pengantar Konsep PBO

## Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:<br>
1. Perbedaan paradigma berorientasi objek dengan paradigma struktural<br>
2. Konsep dasar PBO

## Ringkasan Materi

Bagaimana cara cucu bisa memanggil kakeknya

## Percobaan

### Percobaan 1

Sepeda.java itu adalah sebuah class sedangkan SepedaDemo.java adalah main class

![screenshot sepeda.java](img/sepeda.png)
![screenshot sepedademo.java](img/sepedademo.png)

Link Sepeda : [Link ke kode program](../../src/1_Pengantar_Konsep_PBO/Sepeda.java)<br>
Link SepedaDemo : [Link ke kode program](../../src/1_Pengantar_Konsep_PBO/SepedaDemo.java)

### Percobaan 2

SepedaGunung.java merupakan sebuah turunan dari class Sepeda.java

![screenshot sepedagunung.java](img/sepedagunung.png)

Link code SepedaGunung : [Link ke kode program](../../src/1_Pengantar_Konsep_PBO/SepedaGunung.java)

## Pertanyaan

Jawaban
1.   Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek!
- Kelas kumpulan atas definisi data dan fungsi-fungsi dalam suatu unit untuk suatu tujuan tertentu. Sebagai contoh 'class of dog'   adalah suatu unit yang terdiri atas definisi-definisi data dan fungsi - fungsi yang menunjuk pada berbagai macam perilaku/turunan dari anjing. Sebuah class adalah dasar dari modularitas dan struktur dalam pemrograman berorientasi object.

- Objek membungkus data dan fungsi bersama menjadi suatu unit dalam sebuah program komputer; objek merupakan dasar dari modularitas dan struktur dalam sebuah program komputer berorientasi objek.
- Abstraksi Kemampuan sebuah program untuk melewati aspek informasi yang diproses olehnya, yaitu kemampuan untuk memfokus pada inti.      Setiap objek dalam sistem melayani sebagai model dari "pelaku" abstrak yang dapat melakukan kerja, laporan dan perubahan                keadaannya, dan berkomunikasi dengan objek lainnya dalam sistem, tanpa mengungkapkan bagaimana kelebihan diterapkan.
- Enkapsulasi Memastikan pengguna sebuah objek tidak dapat mengganti keadaan dalam dari sebuah objek dengan cara yang tidak layak;        hanya metode dalam objek tersebut yang diberi izin untuk mengakses keadaannya.
- Pholimorpisme melalui pengiriman pesan. Tidak bergantung kepada pemanggilan subrutin, bahasa orientasi objek dapat mengirim pesan;      metode tertentu yang berhubungan dengan sebuah pengiriman pesan tergantung kepada objek tertentu di mana pesa tersebut dikirim.          Contohnya, bila sebuah burung menerima pesan "gerak cepat", dia akan menggerakan sayapnya dan terbang.
2.  Apa yang dimaksud dengan object dan apa bedanya dengan class?
    Class adalah sebuah rancangan sedangkan objek adalah sebuah hasil dari rancangan class.
3.  Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural!
    Meningkatkan produktivitas. Class dan Object pada PBO yang dibuat untuk suatu problem masih dapat dipakai lagi untuk problem lainnya     yang menggunakan objek tersebut (reusable).
4.  Pada class Sepeda, terdapat state/atribut apa saja?
    Merek, kecepatan, gear, dan warna.
5.  Tambahkan atribut warna pada class Sepeda.
    ![screenshot warna pada class](img/warna.png)
6.  Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol?
    Karena sepeda gunung adalah turunan dari class sepeda.


## Tugas

![screenshot motor.java](img/motor.png)<br>
![screenshot MotorTrail.java](img/motortrail.png)<br>
![screenshot SepedaMotor.java](img/sepedamotor.png)

Link Motor : [Link ke kode program](../../src/1_Pengantar_Konsep_PBO/Motor.java)<br>
Link MotorTrail : [Link ke kode program](../../src/1_Pengantar_Konsep_PBO/MotorTrail.java)<br>
Link SepedaMotor : [Link ke kode program](../../src/1_Pengantar_Konsep_PBO/SepedaMotor.java)



## Kesimpulan

Jadi, Class itu adalah sebuah rancangan untuk mendapatkan hasil dari main class dengan adanya extends class main class dapat lebih terperinci hasilnya

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Dhuta Pamungkas Ibnusiqin)***
