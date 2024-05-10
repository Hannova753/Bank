public class CheckingBont {
    private double uang;
    private int bulan;
    private double bunga = 0.005;

    public CheckingBont() {
        this.uang = 0;
        this.bulan = 0;
    }
    public double hitungKenaikanBunga(){
        double uangSetelahBunga = uang;
        for (int i = 1; i <= bulan; i++) {
            if (i % 12 == 0) { // Check if it's the end of a year
                bunga += 0.005;
            }
            double bungaBulanIni = uangSetelahBunga * bunga; // Calculate interest for this month
            uangSetelahBunga += bungaBulanIni; // Add interest to the balance
        }
        return uangSetelahBunga;
    }
    public void setUang(double uang){
        this.uang = uang;
    }
    public double getUang() {
        return uang;
    }
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }
    public int getBulan() {
        return bulan;
    }
}
