public class BukuMain14 {
    public static void main(String[] args) {
        Buku14 bk1 = new Buku14();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku14 bk2 = new Buku14("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku14 BukuAfifah = new Buku14("Kudasai", "idk", 200, 12, 140000);
        BukuAfifah.tampilInformasi();
        BukuAfifah.terjual(5);
        BukuAfifah.hargaSetelahDiskon();
        


    }
}
