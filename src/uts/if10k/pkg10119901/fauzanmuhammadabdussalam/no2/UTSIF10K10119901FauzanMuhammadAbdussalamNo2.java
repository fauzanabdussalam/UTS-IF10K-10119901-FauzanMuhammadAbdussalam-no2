/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119901.fauzanmuhammadabdussalam.no2;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : UTS No.2 (Tabungan)
 *
 */
public class UTSIF10K10119901FauzanMuhammadAbdussalamNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        
        System.out.print("Masukkan Saldo Awal \t : ");
        Tabungan t = new Tabungan(scanner.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang \t : " + t.ambilUang(scanner.nextInt()));
    }
}
