#PADA KELAS APP : Berisi method MAIN untuk menjalankan sebuah apk

*CONFIG*
#PADA KELAS Myconfig : Digunakan untuk mengatur koneksi ke database MySQL menggunakan JDBC, isi dari Myconfig ada URL,USER,PAS.

*CONTROL*
#PADA KELAS DbControl : Kelas yang berfungsi sebagai pengontrol akses dan manipulasi database untuk tabel "tb_produk". Didalam kelas DbControl terdapat beberapa method antara lain method getDatabase() dan readDB() untuk mengambil data dari tb_produk dan menampilkannya ke layar. Method insertDB() untuk menyisipkan data baru ke dalam tabel tb_produk, dan method updateNamaDB(), updateHargaDB(), dan updateStokDB() untuk mengupdate data pada tabel berdasarkan ID. Method deletDB() digunakan untuk menghapus data dari tabel berdasarkan nama produk. Method getProdukbyNama() digunakan untuk mendapatkan data produk berdasarkan nama produk.

*LAYOUT*
Pada bagian layout terdapat 5 kelas yaitu :

#PADA KELAS Menu : Didalam kelas menu terdapat 2 method static yaitu showMenu() untuk menampilkan menu utama aplikasi "Divashop". Dan SelectMenu() untuk membaca apa yang pengguna pilih dan memilih tindakan sesuai dengan pilihan menu yang dimasukkan

#PADA KELAS ReadData : Untuk menampilkan data produk dan menu dengan menggunakan Scanner. Pada kelas ini switch untuk menentukan tindakan yang akan dilakukan berdasarkan apa yang di input. Jika menginput nomor 1, program akan memanggil method showMenu() dari kelas Menu. Jika menginput nomor 2, program akan mencetak pesan "SAMPAI JUMPA" dan kemudian keluar dari program menggunakan System.exit(). Jika menginput nomor selain 1 atau 2, program akan mencetak pesan "MAAF MENU YANG DIPILIH TIDAK TERSEDIA" dan kemudian memanggil kembali method showReadData() untuk menampilkan ulang data dan opsi menu.

#PADA KELAS InsertData : Untuk memasukkan data produk ke dalam database. Method showInsertData() menampilkan pesan kepada pengguna dan mengambil input untuk nama produk, harga produk, dan jumlah produk menggunakan objek Scanner. Kemudian disimpan dalam variabel name, harga, dan jumlah. Method DbControl.insertDB() dipanggil untuk memasukkan data produk ke dalam database.

#PADA KELAS UpdateData :  Untuk mengupdate data produk dalam sebuah sistem aplikasi penjualan.Terdapat method showUpdateData(String nama), method ini menampilkan menu untuk memilih produk yang ingin diubah. Setelah pengguna memilih produk, method showEditNama(), showEditHarga(), atau showEditStok() akan dipanggil tergantung apa yang di input. Dan terdapat method showEditNama(String nama) untuk menampilkan informasi produk yang dipilih dan meminta pengguna untuk memasukkan data yang baru. 

#PADA KELAS DeleteData : Untuk menghapus data dari database. Terdapat method statis showDeleteData() yang akan menampilkan opsi penghapusan data. Terdapat pengkondisian if-else yang memeriksa apakah pemanggilan metode deleteDB(nama) dari kelas DbControl berhasil menghapus data dengan nama yang diberikan. 

*models*
#PADA KELAS PRODUK :  Untuk merepresentasikan produk dalam sebuah program. Pada kelas produk terdapat 4 atribut yaitu Id, nama, harga, stok. Dan terdapat Konstruktor ini menerima argumen untuk mengatur nilai id, nama, harga, dan stok produk. Dan terdapat method getter dan setter yaitu getId, setId, getNama, setNama, getHarga, setHarga, getStok, dan setStok yang digunakan untuk mengakses dan mengubah nilai-nilai variabel instance produk. 