/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-2
 * Nim   : 10116378
 */
public class Kambing {
    public void tambahKambing(){
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Kambing kambingJantan = new PBOIF2_10116378();
        kambingJantan.tambahKambing();
    }
    
}
