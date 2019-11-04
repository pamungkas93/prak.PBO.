# Laporan #9 - Pengantar Konsep PBO

# Abstract Class & Interface

## Kompetensi

	Setelah melakukan percobaan pada jobsheet ini, diharapkan mahasiswa mampu: 
	a. Memahami konsep dan bentuk dasar polimorfisme
	b. Memahami konsep virtual method invication 
	c. Menerapkan polimorfisme pada pembuatan heterogeneous collection 
	d. Menerapkan polimorfisme pada parameter/argument method 
	e. Menerapkan object casting untuk meng-ubah bentuk objek
  

## Ringkasan Materi

### Polimorfisme
Polimorfisme merupakan kemampuan suatu objek untuk memiliki banyak bentuk. Penggunaan polimorfisme yang paling umum dalam OOP terjadi ketika ada referensi super class yang digunakan untuk merujuk ke objek dari sub class. Dengan kata lain, ketika ada suatu objek yang dideklarasikan dari super class, maka objek tersebut bisa diinstansiasi sebagai objek dari sub class.

### Virtual method Invocation
Virtual method invocation terjadi ketika ada pemanggilan overriding method dari suatu objek polimorfisme. Disebut virtual karena antara method yang dikenali oleh compiler dan method yang dijalankan oleh JVM berbeda.

### Heterogeneous Collection 
Dengan adanya konsep polimorfisme, maka variabel array bisa dibuat heterogen. Artinya di dalam array tersebut bisa berisi berbagai macam objek yang berbeda.

### Polymorphic Argument 
Polimorfisme juga bisa diterapkan pada argument suatu method. Tujuannya agar method tersebut bisa menerima nilai argument dari berbagai bentuk objek.

### Operator instanceof
Operator instanceof bisa digunakan untuk mengecek apakah suatu objek merupakan hasil instansiasi dari suatu class tertentu. Hasil dari instanceof berupa nilai boolean. 

### Object Casting 
Casting objek digunakan untuk mengubah tipe dari suatu objek. Jika ada suatu objek dari subclass kemudian tipenya diubah ke superclass, maka hal ini termasuk ke upcasting. Proses downcasting sering disebut juga sebagai explicit casting, karena bentuk tujuan dari casting harus dituliskan dalam tanda kurung, di depan objek yang akan di-casting.

## Studi Kasus

### Percobaan 1 (Bentuk dasar polimorfisme)

Employes

![screenshot Employes](img/Hewan.PNG)

IPayable

![screenshot IPayable](img/kucing.PNG)

IntershipEmployes

![screenshot IntershipEmployes](img/ikan.PNG)

PermanentEmployes

![screenshot PermanentEmployes](img/orang.PNG)

ElectricityBill

![screenshot ElectricityBill](img/program.PNG)

Tester1

![screenshot Tester1](img/program.PNG)

## Pertanyaan

	1. Class apa sajakah yang merupakan turunan dari class Employee?
	Jawab:
	2. Class apa sajakah yang implements ke interface Payable?
	Jawab:
	3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye)?
	Jawab:
	4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill)?
	Jawab:
	5. Coba tambahkan sintaks: 
	p = iEmp;      
	e = eBill;
	pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?
	Jawab:
	6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
	Jawab:

link Employes : [ini  link ke kode program](../../src/10_Polimorpism/Hewan1941723014Dhuta.java)<br>
link IPayable : [ini  link ke kode program](../../src/10_Polimorpism/Kucing1941723014Dhuta.java)<br>
link IntershipEmployes : [ini  link ke kode program](../../src/10_Polimorpism/Ikan1941723014Dhuta.java)<br>
link PermanentEmployes : [ini  link ke kode program](../../src/10_Polimorpism/Orang1941723014Dhuta.java)<br>
link ElectricityBill : [ini  link ke kode program](../../src/10_Polimorpism/Program1941723014Dhuta.java)<br>
link Tester1 : [ini  link ke kode program](../../src/10_Polimorpism/Program1941723014Dhuta.java)

### Percobaan 2 (Virtual method invocation)

Tester2

![screenshot Tester2](img/ICumlaude.PNG)

## Pertanyaan

	1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
	Jawab:
	2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak? 
	Jawab:
	3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual? 
	Jawab:

	
	
link Tester2: [ini  link ke kode program](../../src/10_Polimorpism/ICumlaudejobsheet91941723014Dhuta.java)

### Percobaan 3 (Heterogenous Collection)

Tester3

![screenshot Tester3](img/IBerprestasi.PNG)

## Pertanyaan

	1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee)?
	Jawab:
	2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?
	Jawab:
	3. Perhatikan baris ke-10, mengapa terjadi error?
	Jawab:

link Tester3: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)

### Percobaan 4 (Argumen polimorfisme, instanceod dan casting objek)

Owner

![screenshot Owner](img/IBerprestasi.PNG)

Tester4

![screenshot Tester4](img/IBerprestasi.PNG)

## Pertanyaan
	1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable? Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
	Jawab:
	2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?
	Jawab:
	3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp);
![screenshot Tester4error](img/IBerprestasi.PNG)
	Mengapa terjadi error? 		
	Jawab:
	4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?
	Jawab:
	5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?
	Jawab:

link Owner: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link Tester4: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)

### Tugas

Zombie

![screenshot Zombie](img/IBerprestasi.PNG)

Destroyable

![screenshot Destroyable](img/IBerprestasi.PNG)

Barrier

![screenshot Barrier](img/IBerprestasi.PNG)

Plan

![screenshot Plan](img/IBerprestasi.PNG)

WalkingZombie

![screenshot WalkingZombie](img/IBerprestasi.PNG)

JumpingZombie

![screenshot JumpingZombie](img/IBerprestasi.PNG)

Tester

![screenshot Tester](img/IBerprestasi.PNG)

link Zombie: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link Destroyable: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link Barrier: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link Plan: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link WalkingZombie: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link JumpingZombie: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)<br>
link Tester: [ini  link ke kode program](../../src/10_Polimorpism/IBerprestasi1941723014Dhuta.java)

## Kesimpulan

Polimorpism adalah objek yang kita gunakan ini bisa berubah dengan kondisi yang terjadi. Jadi kita tidak perlu menulis kode program yang panjang

## Pernyataan Diri

	Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

	Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Dhuta Pamungkas Ibnusiqin)***