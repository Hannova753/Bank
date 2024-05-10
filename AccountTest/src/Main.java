//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        CheckingBont obligasi = new CheckingBont();
        obligasi.setUang(10000.00);
        obligasi.setBulan(11);
        System.out.println(obligasi.hitungKenaikanBunga());
    }
}