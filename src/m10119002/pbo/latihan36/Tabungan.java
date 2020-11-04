/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan36;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Tabungan
 * 
 * 
 */
public class Tabungan {
    public int saldo;
    public double bungaBulanan;
    
    public void nextBunga() {
        saldo += (saldo*bungaBulanan);
    }
    
    public void printSaldo(int bulanKe) {
        String saldoAkhir = String.format("%,10d%n", saldo);
        saldoAkhir = saldoAkhir.replace(',', '.');
        System.out.print("Saldo di bulan ke-".concat(Integer.
                toString(bulanKe)).concat(" Rp.").concat(saldoAkhir));
    }
    
    public void tampilTargetSaldo(int saldoTarget) {
        int i = 1;
        while (saldo < saldoTarget) {
            nextBunga();
            printSaldo(i);
            i++;
        }
    }
}
