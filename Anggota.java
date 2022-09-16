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
public class Anggota {
    private String nik;
    private String nama;
    private float limit;
    private float pinjaman;
    private float persen;
       
    Anggota(String nik, String nama, float limit){
    this.nik = nik;
    this.nama = nama;
    this.limit = limit;
    this.pinjaman = 0;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setlimit(Float limit){
        this.limit = limit;
    }
    public String getNama(){
        return nama;
    }
    public String getNik(){
        return nik;
    }
    public Float getLimitPinjaman(){
        return limit;
    }
    public Float getJumlahPinjaman(){
        return pinjaman;
    }
    public void pinjam(float uang){
        pinjaman += uang;
        if(uang > limit){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            pinjaman = 0;
        } else {
        }
    }
    public void angsur(float uang){ 
        if(uang < pinjaman){  
            pinjaman -= 0;
            persen = pinjaman * 10/100;
            if(uang < persen){       
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            }else{
               pinjaman -= uang; 
            }
        }
    }
    public void angsur1(float uang){
        pinjaman -= uang;
    }
 }

