# Praktikum #9 - Pengantar Konsep PBO

# Abstract Class dan Interface

## Kompetensi

	Setelah menyelesaikan lembar kerja ini mahasiswa diarapkan mampu: 
	1. Menjelaskan maksud dan tujuan penggunaan Abstract Class.
	2. Menjelaskan maksud dan tujuan penggunaan Interface.
	3. Menggunakan Abstract Class dan Interface di dalam pembuatan program.
  

## Ringkasan Materi

### Abstract Class
Abstract Class adalah Class yang tidak dapat diinstansiasi namun dapat di-extend. Abstract class baru dapat dimanfaatkan ketia ia di-extend.

Karakteristik:
- Dapat memiliki properties dan methods seperti class biasa. 
- Selalu memiliki methods yang tidak memiliki tubuh (hanya deklarasinya saja), disebut juga abstract method. 
- Selalu dideklarasikan dengan menggunakan keyword ‘abstract class’. 

Kegunaan:<br>
Menggambarkan sesuatu yang bersifat umum, yang hanya bisa berfungsi setelah ia dideskripsikan kedalam bentuk yang lebih spesifik. 

### Interface
Interface adalah Struktur data yang hanya berisi abstract methods. Tidak ada apaapa selain method abstract pada interface, termasuk atribute getter dan setter.

Karakteristik:<br>
- Tidak ada apa-apa di dalamnya selain abstract methods. 
- Di konvensi bahasa pemrograman Java, namanya dianjurkan untuk selalu diawali dengan huruf kapital ‘I’. 
- Selalu dideklarasikan dengan menggunakan keyword ‘interface’. 
- Diimplementasikan dengan menggunakan keyword ‘implements’. 

Kegunaan:<br>
Bertindak seperti semacam kontrak/syarat yang HARUS dipenuhi bagi suatu class agar class tersebut dapat dianggap sebagai ‘sesuatu yang lain’.

## Percobaan

### Percobaan 1 (Abstract Class)

Hewan

![screenshot Hewan](img/Hewan.PNG)

Kucing

![screenshot Kucing](img/kucing.PNG)

Ikan

![screenshot Ikan](img/ikan.PNG)

Orang

![screenshot Orang](img/orang.PNG)

Program

![screenshot Program](img/program.PNG)

## Pertanyaan

	Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!”
	Jawab:
	Jika suatu class meng-extend suatu abstract class maka akan terjadi error, karena subclass dari class abstrak harus mengimplementasi method abstrak

link Hewan : [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Hewan1941723014Dhuta.java)<br>
link Kucing : [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Kucing1941723014Dhuta.java)<br>
link Ikan : [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Ikan1941723014Dhuta.java)<br>
link Orang : [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Orang1941723014Dhuta.java)<br>
link Program : [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Program1941723014Dhuta.java)

### Percobaan 2 (Interface)

ICumlaude

![screenshot ICumlaude](img/ICumlaude.PNG)

Mahasiswa

![screenshot Mahasiswa](img/mahasiswa.PNG)

Sarjana

![screenshot Sarjana](img/sarjana.PNG)

Pasca Sarjana

![screenshot PascaSarjana](img/pascaSarjana.PNG)

Rektor

![screenshot Rektor](img/rektor.PNG)

Program

![screenshot Program](img/program2.PNG)

## Pertanyaan

	1.  Mengapa pada langkah nomor 9 terjadi error? Jelaskan!
	Jawab:
	Error, karena pada class Mahasiswa tidak diimplementasikan method abstract yang ada pada class interface yaitu class ICumlaude sehingga pada saat pemanggilan di class Rektor terjadi error

	2. 	Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian?
	Jawab:
	Jika kita menambahkan method abstract kuliahDiKampus() pada class interface Icumlaude maka tidak akan terjadi error

	3.	Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
	Jawab:
	Class Rektor memanggil method abstract pada ICumlaude melalui class Mahasiswa sehingga tinggal menambahkan method dibawah pada class Rektor

	4.	Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut
	Jawab:

![screenshot Program](img/rektorHasil.PNG)	
	
link ICumlaude: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/ICumlaudejobsheet91941723014Dhuta.java)<br>
link Mahasiswa: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Mahasiswajobsheet91941723014Dhuta.java)<br>
link Sarjana: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Sarjanajobsheet91941723014Dhuta.java)<br>
link Pasca Sarjana: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/PascaSarjanajobsheet91941723014Dhuta.java)<br>
link Rektor: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Rektorjobsheet91941723014Dhuta.java)<br>
link Program: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/Programjobsheet91941723014Dhuta.java)

### Percobaan 3 (Multiple Interfaces Implementation)

IBerprestasi

![screenshot IBerprestasi](img/IBerprestasi.PNG)

ICumlaude

![screenshot ICumlaude](img/ICumlaude3.PNG)

Mahasiswa

![screenshot Mahasiswa](img/mahasiswa3.PNG)

Rektor

![screenshot Rektor](img/rektor3.PNG)

Pasca Sarjana

![screenshot PascaSarjana](img/pascaSarjana3.PNG)

Sarjana

![screenshot Sarjana](img/sarjana3.PNG)

## Pertanyaan

	Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude.
	Jawab:

![screenshot Jawaban](img/jwbnSoalNo4.PNG)	

link IBerprestasi: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/src3/IBerprestasi1941723014Dhuta.java)<br>
link ICumlaude: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/src3/ICumlaudejobsheet91941723014Dhuta.java)<br>
link Mahasiswa: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/src3/Mahasiswa1941723014Dhuta.java)<br>
link Rektor: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/src3/Rektorjobsheet91941723014Dhuta.java)<br>
link Pasca Sarjana: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/src3/PascaSarjanajobsheet91941723014Dhuta.java)<br>
link Sarjana: [ini  link ke kode program](../../src/9_Abstract_Class_Interface/src3/Sarjanajobsheet91941723014Dhuta.java)

## Kesimpulan

Kesimpulannya adalah penggunaan method abstract pada class parent dan dieimplementasikan pada subclass sehingga tinggal mengubah isi dari method abstract tersebut. Penggunaan abstract class digunakan untuk mengurangi method yang banyak namun memiliki fungsi sama.

## Pernyataan Diri

	Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

	Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Dhuta Pamungkas Ibnusiqin)***