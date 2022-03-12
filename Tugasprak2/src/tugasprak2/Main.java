/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak2;

import java.util.Scanner;

/**
 *
 * @author HP series
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        int ulangi=0;
        double panjang, lebar, tinggi, jariJari;
        System.out.println("+---------------+");
        System.out.println("|    TUGAS 2    |");
        System.out.println("+---------------+");
        System.out.println("Balok dan Tabung");
        
        do{
        System.out.println("Pilihan Menu");
        System.out.println("1. Balok");
        System.out.println("2. Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        if(pilih==1){
            System.out.print("Input panjang : ");
            panjang = input.nextDouble();
            System.out.print("Input lebar : ");
            lebar = input.nextDouble();
            System.out.print("Input tinggi : ");
            tinggi = input.nextDouble();
            
            Balok balok = new Balok(tinggi, panjang, lebar);
            System.out.println("Luas Persegi Panjang = " + balok.luas());
            System.out.println("Keliling Persegi Panjang = " + balok.keliling());
            System.out.println("Volume Balok = " + balok.volume());
            System.out.println("Luas Permukaan = " + balok.luasPermukaan());
            System.out.print("Ulangi? (y:1||n:0)");
            ulangi = input.nextInt();
        }
        else if(pilih==2){
            System.out.print("Input Jari-Jari = ");
            jariJari = input.nextDouble();
            System.out.print("Input Tinggi = ");
            tinggi = input.nextDouble();
            
            Tabung tabung = new Tabung(tinggi, jariJari);
            System.out.println("Luas Lingkaran = " + tabung.luas());
            System.out.println("Keliling Lingkaran = " + tabung.keliling());
            System.out.println("Volume Tabung : " + tabung.volume());
            System.out.println("Luas Permukaan : " + tabung.luasPermukaan());
            System.out.print("Ulangi? (y:1||n:0)");
            ulangi = input.nextInt();
        }
        }while(ulangi==1 && pilih!=0);
        
        
        
    }
    
}
