public class Senjata {
    private String nama;
    private int serang;

    public Senjata(String nama, int serang) {
        this.nama = nama;
        this.serang = serang;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSeranganPower() {
        return this.serang;
    }
}