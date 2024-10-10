public class Jagoan {
    private String nama;
    private int baseKesehatan;
    private int baseSerangan;
    private int incrementKesehatan;
    private int incrementSerangan;
    private int level;
    private int totalKerusakan;

    private Jubah jubah;
    private Senjata senjata;

    public Jagoan (String nama) {
        this.nama = nama;
        this.baseKesehatan = 100;
        this.baseSerangan = 100;
        this.level = 1;
        this.incrementKesehatan = 20;
        this.incrementSerangan = 20;
    }

    public String getNama() {
        return this.nama;
    }

    public int getKesehatan(){
        return this.maxKesehatan() - this.totalKerusakan;
    }

    public void tampilkan() {
        System.out.println("Jagoan\t\t: " + this.nama);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Max Kesehatan\t: " + this.getKesehatan() + "/" + this.maxKesehatan());
        System.out.println("Serangan\t: " + this.getSeranganPower());
        System.out.println("Jubah\t\t: " + this.jubah.getNama());
        System.out.println("Senjata\t\t: " + this.senjata.getNama() + "\n");
    }

    public void serang(Jagoan lawan) {
        int kerusakan = this.getSeranganPower();
        System.out.println(this.nama + " menyerang " + lawan.getNama() + " dengan " + kerusakan);
        lawan.defense(kerusakan);
        this.levelUp();
    }

    public void defense(int kerusakan) {
        int defensePower = this.jubah.getdefensePower();
        int deltaKerusakan;

        System.out.println(this.nama + " daya pertahanan = " + defensePower);
        deltaKerusakan = kerusakan - defensePower;
        if (deltaKerusakan < 0) {
            deltaKerusakan = 0;
        }
        System.out.println("Kerusakan yang diterima = " + deltaKerusakan + "\n");

        this.totalKerusakan += deltaKerusakan;
    }

    private int getSeranganPower() {
        return this.baseSerangan + this.level * this.incrementSerangan + this.senjata.getSeranganPower();
    }

    private void levelUp() {
        this.level++;
    }

    public void setJubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int maxKesehatan() {
        return this.baseKesehatan + this.level * this.incrementKesehatan + this.jubah.getaddKesehatan();
    }
}
