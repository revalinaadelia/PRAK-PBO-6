public class Jubah {
    private String nama;
    private int kekuatan;
    private int kesehatan;

    public Jubah(String nama, int kekuatan, int kesehatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.kesehatan = kesehatan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getaddKesehatan() {
        return this.kekuatan * 10 + this.kesehatan;
    }

    public int getdefensePower() {
        return this.kekuatan * 2;
    }
}