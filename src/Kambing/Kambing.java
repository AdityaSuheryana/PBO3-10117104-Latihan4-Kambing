/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kambing;

/**
 *
 * @author
 * Nama      : Aditya Suheryana
 * Kelas     : IF-3 / PBO-3
 * Nim       : 10117104
 * Deskripsi : Program ini berisi tambah Kambing tanpa di input , 
 *             yang awalnya 0 menjadi 5
 */
public class Kambing {

public void tambahKambing(){
//Deklarasi Variabel lokal
int jumlahKambing = 0;

jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing Setelah ditambah = " + jumlahKambing);

}   
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing(); 
    }
    
}
