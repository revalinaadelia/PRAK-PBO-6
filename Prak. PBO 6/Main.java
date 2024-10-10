public class Main {
    public static void main(String[] args) {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jagoan pitung = new Jagoan("Si Pitung");

        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);

        Senjata golok = new Senjata("Golok", 25);
        Senjata toya = new Senjata("Toya", 24);

        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);

        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);

        // Tampilkan informasi awal kedua jagoan
        jakaSembung.tampilkan();
        pitung.tampilkan();

        // Pertarungan
        jakaSembung.serang(pitung);
        jakaSembung.serang(pitung);

        pitung.serang(jakaSembung);

        jakaSembung.serang(pitung);

        pitung.serang(jakaSembung);

        // Tampilkan hasil akhir setelah pertarungan
        System.out.println("Berikut Hasil Akhir dari Pertarungan Antara Kedua Jagoan");
        jakaSembung.tampilkan();
        pitung.tampilkan();
    }
}
