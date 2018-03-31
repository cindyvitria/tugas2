/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author Acer
 */
public class BelahKetupatAksi {
    public static void main(String[] args) {
        BelahKetupat BK1 = new BelahKetupat(); 
        BK1.sisi1 = 2;
        BK1.sisi2 = 2;
        BK1.sisi3 = 2;
        BK1.sisi4 = 2;
        
        BK1.cetakinfo();
        
        System.out.println("Keliling BelahKetupat = "+BK1.HitungKeliling());
        BK1.cetakKeliling();
        
        BelahKetupat BK2 = new BelahKetupat();
        BK2.cetakinfo();
 
        BelahKetupat BK3 = new BelahKetupat(3,3,3,3);
        BK3.cetakinfo();
    }
}
