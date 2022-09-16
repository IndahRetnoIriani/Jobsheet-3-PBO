/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnkapsulasiJ3T4;

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Indah Retno", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMasukkan jumlah pinjaman : ");
        Float a = input.nextFloat();
        donny.pinjam(a);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMasukkan jumlah pinjaman : ");
        Float b = input.nextFloat();
        donny.pinjam(b);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMasukkan jumlah pembayaran angsuran : ");
        Float c = input.nextFloat();
        donny.pinjam(c);
        System.out.println("Jumalah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
