/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absen;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author Zidan
 */
public class Absen {
    
    ArrayList<Pengunjung> listPengunjung;
    
    public Absen() {
        Scanner in = new Scanner(System.in);
        this.listPengunjung = new ArrayList<>();
        
        while (true) {
            System.out.println("Nama Lengkap:");
            String namaLengkap = in.nextLine();
            if (namaLengkap.isEmpty()) {
                System.out.println("Error; Tidak boleh kosong!");
                continue;
            }
            
            System.out.println("Asal Kota:");
            String asalKota = in.nextLine();
            if (asalKota.isEmpty()) {
                System.out.println("Error: Tidak boleh kosong!");
                continue;
            }
            
            System.out.println("Nomor Ponsel:");
            String nomorPonsel = in.nextLine();
            if (nomorPonsel.isEmpty()) {
                System.out.println("Error: Format salah!");
                continue;
            }
            
            this.listPengunjung.add(new Pengunjung(namaLengkap, asalKota, nomorPonsel));
            
            System.out.println("Terimakasih\n");
            
            cetakDaftarPengunjung();
            
            System.out.println("\n");
        }
    }

        
    boolean cekNomorPonsel(String s) {
        boolean valid = false;
        
        if(s.matches("^(\\+62|62|0)8[1-9]{6,10}$")) {
            valid = true;
        }

        return valid;
    }
    
    void cetakDaftarPengunjung() {
        String formatcetak = "| %-23s | %-18s | %-18s |%n";
        
        System.out.format("+-------------------------+--------------------+--------------------+%n");
        System.out.format("| Nama Lengkap | Asal Kota | Nomor Ponsel |%n");
        System.out.format("+-------------------------+--------------------+--------------------+%n");
        for (Pengunjung list    : listPengunjung) {
            System.out.format(formatcetak, list.getnamaLengkap(), list.getasalKota(), list.getnomorPonsel());
        }
        System.out.format("+-------------------------+--------------------+--------------------+%n");
    }
}