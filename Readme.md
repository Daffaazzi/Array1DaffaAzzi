> Percobaan 1
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array. 
3. Ubah statement pada langkah No 4 menjadi seperti berikut Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian? 

> jawaban
1. 5.0 dan 7.5 akan terjadi eror dikarenakan variable tersebut termasuk dalam double dan bukan integrar.
2. 
3. Jawaban: Program menampilkan semua isi array bil.
   Penjelasan: Karena i berjalan dari 0 sampai 3, maka setiap elemen array ditampilkan satu per satu.
4. Jawaban: Program error.
   Penjelasan: Karena saat i = 4, program mencoba mengakses bil[4] yang tidak ada.

> Percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: Jalankan program. Apakah terjadi perubahan? Mengapa demikian? 
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?  
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): Jalankan program dan jelaskan alur program! 
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,seperti ilustrasi output berikut:

> jawaban
1. Tidak terjadi perubahan apa pun karena Kondisi i < nilaiAkhir.length tetap sama seperti sebelumnya, sehingga jumlah perulangan dan proses input tidak berubah. Program tetap meminta input nilai akhir sebanyak jumlah elemen array.
2. Kondisi tersebut berarti perulangan dilakukan selama nilai i lebih kecil dari jumlah elemen array. karena Hal ini memastikan perulangan berhenti tepat setelah semua elemen array diisi, agar tidak terjadi error akses indeks di luar batas array.
3. Perulangan memeriksa setiap elemen array. Jika nilaiAkhir[i] > 70, maka ditampilkan pesan “Mahasiswa ke-i lulus!”; jika tidak, data tersebut dilewati.
4. sudah

> Percobaan 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) 
agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa 
yang memiliki lebih besar dari 70 (>70). 
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga 
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan 
output seperti berikut ini:

> jawaban
1. Sudah ada di commitan
2. Sudah ada di commitan 

> Percobaan 4 
1.  Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di 
atas. 
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program:
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut:

> jawaban
1. digunakan untuk menghentikan perulangan (loop) secara langsung, meskipun kondisi perulangannya belum selesai.Tanpa break program akan tetap melanjutkan pencarian ke seluruh elemen meskipun hasil sudah di temukan.
2. sudah 
3. sudah 