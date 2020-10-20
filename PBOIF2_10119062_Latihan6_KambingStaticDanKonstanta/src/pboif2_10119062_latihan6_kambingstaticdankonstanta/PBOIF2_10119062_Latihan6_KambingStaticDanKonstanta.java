/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119062_latihan6_kambingstaticdankonstanta;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Program : Program ini berisi program untuk menampilkan jenis-jenis
 * tipe data bilangan bulat 
 *
 */
public class PBOIF2_10119062_Latihan6_KambingStaticDanKonstanta {
 
  public static final String NAMA_KAMBING = "MIDUN";
   
 
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
       System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                           + Mamalia.jumlahKambing);
    }
    
}
