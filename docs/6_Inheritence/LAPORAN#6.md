# Laporan #6 - Pengantar Konsep PBO

# Inheritance

## Kompetensi

	1. Memahami konsep dasar inheritance atau pewarisan.	
 	2. Mampu membuat suatu subclass dari suatu superclass tertentu.
 	3. Mampu mengimplementasikan konsep	single dan multilevel inheritance.	
 	4. Mampu membuat objek dari suatu subclass dan melakukan pengaksesan terhadap atribut dan method baik yang dimiliki sendiri atau turunan dari superclass nya.
  

## Ringkasan Materi

Inheritance atau perwakilan sifat merupakan suatu cara untuk menurunkan suatu class yang lebih umum menjadi suatu class yang lebih spesifik. Inheritance adalah salah satu ciri utama suatu bahasa program yang berorientasi objek.

1.	Single Inheritance<br>
Single Inheritance adalah suatu class yang hanya mempunyai suatu class parent.
2.	Multilevel Inheritance<br>
Multilevel Inheritance adalah suatu subclass bisa menjadi superclass bagi class yang lain.


## Percobaan

### Percobaan 1 (extends)

ClassA

![screenshot ClassA](img/Laptop.PNG)

ClassB

![screenshot ClassB](img/Processor.PNG)

Percobaan1

![screenshot Percobaan1](img/Processor.PNG)

## Pertanyaan

	1.	Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! 
	Jawab :
	

	2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!
	Jawab :

link ClassA : [ini  link ke kode program](../../src/4_Relasi_Class/Laptop.java)<br>
link ClassB : [ini  link ke kode program](../../src/4_Relasi_Class/Processor.java)<br>
link Percobaan 1 : [ini  link ke kode program](../../src/4_Relasi_Class/Processor.java)

### Percobaan 2

ClassA

![screenshot ClassA](img/Sopir.PNG)

ClassB

![screenshot ClassB](img/Pelanggan.PNG)

Percobaa 2

![screenshot Percobaan2](img/Mobil.PNG)

## Pertanyaan

	1.	Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
	Jawab :

	2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! 
	Jawab :
	
 link ClassA : [ini  link ke kode program](../../src/4_Relasi_Class/Sopir.java)<br>
 link ClassB : [ini  link ke kode program](../../src/4_Relasi_Class/Pelanggan.java)<br>
 link Percobaan 2 : [ini  link ke kode program](../../src/4_Relasi_Class/Mobil.java)

### Percobaan 3

Bangun

![screenshot Bangun](img/pegawai.PNG)

Tabung

![screenshot Tabung](img/keretaApi.PNG)

Percobaan 3

![screenshot Percobaan3](img/keretaApi.PNG)

## Pertanyaan

	1.	Jelaskan fungsi "super" pada potongan program berikut di class Tabung!
	Jawab :

	2.	Jelaskan fungsi "super" dan "this" pada potongan program berikut di class Tabung
	Jawab :

	3.	Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut!
	Jawab :


 link Bangun : [ini  link ke kode program](../../src/4_Relasi_Class/pegawai.java)<br>
 link Tabung : [ini  link ke kode program](../../src/2_Class_dan_Object/keretaApi.java)<br>
 link Percobaan 3 : [ini  link ke kode program](../../src/2_Class_dan_Object/keretaApi.java)

### Percobaan 4

ClassA

![screenshot ClassA](img/penumpang.png)

ClassB

![screenshot ClassB](img/kursi.png)

ClassC

![screenshot ClassC](img/gerbong.png)

Percobaan4

![screenshot Percobaan4](img/gerbong.png)

## Pertanyaan

	1.	Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasanya!
	Jawab :

	2.	Ubahlah isi konstruktor default ClasC seperti berikut:
	Tambahkan kata super() dibaris Pertama dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan 4 dan terlihat tidak ada perbedaan dari hasil outputnya!
	Jawab :

	3.	Ubahlah defaultnya ClassC seperti berikut:
	Ketika mengubah posisi super() dibaris kedua dalam konstruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.
	Perhatikan keluaran ketika class percobaan 4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC.
	Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!
	Jawab :

	4.	Apakah fungi super() pada potongan program dibawah ini di ClassC!
	Jawab:	

 link ClassA : [ini  link ke kode program](../../src/4_Relasi_Class/penumpang.java)

 link ClassB : [ini  link ke kode program](../../src/4_Relasi_Class/kursi.java)

 link ClassC : [ini  link ke kode program](../../src/4_Relasi_Class/Gerbong.java)

link Percobaan4 : [ini  link ke kode program](../../src/4_Relasi_Class/Gerbong.java)

## Percobaan 5

Karyawan

![screenshot Karyawan](img/RelasiRestouran.PNG)

Manager

![screenshot Manager](img/Pembeli.PNG)

Staff

![screenshot Staff](img/Pelayan.PNG)

Inheritance1

![screenshot Makanan](img/Makanan.PNG)


## Pertanyaan

	1.	Sebutkan class mana yang termasuk superclass dan sub class dari percobaan 1 diatas!
	Jawab:

	2.	Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?
	Jawab:

	3.	perhatikan code program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class karyawan!
	Jawab:

	4.	Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!
	Jawab:

	5.	Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!
	Jawab:

Karyawan

![screenshot Karyawan](img/Makanan.PNG)

Manager

![screenshot Manager](img/Makanan.PNG)

Staff

![screenshot Staff](img/Makanan.PNG)

Inheritance 1

![screenshot Inheritance1](img/Makanan.PNG)

## Percobaan 6

## Pertanyaan

## Pertanyaan

	1.	Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?
	Jawab :

	2.	Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut?
	Jawab :

	3.	Apakah fungsi potongan program berikut pada class StaffHarian
	Jawab :

	4.	Apakah fungsi potongan program berikut pada class StaffHarian
	Jawab:	


## Kesimpulan

	Jadi, Dalam suatu sistem akan ditemukan lebih dari satu class yang saling memiliki keterkaitan antara class satu dengan yang lain. 

## Pernyataan Diri

	Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

	Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Dhuta Pamungkas Ibnusiqin)***
