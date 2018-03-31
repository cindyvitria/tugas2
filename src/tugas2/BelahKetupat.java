
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
public class BelahKetupat {
    int sisi1;
    int sisi2;
    int sisi3;
    int sisi4;

    public BelahKetupat() {
        sisi1=4;
        sisi2=4;
        sisi3=4;
        sisi4=4;   
    }

    public BelahKetupat(int sisi1, int sisi2, int sisi3, int sisi4) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
    }
    
    void cetakinfo() {
        System.out.println("sisi1 = "+sisi1);
        System.out.println("sisi2 = "+sisi2);
        System.out.println("sisi3 = "+sisi3);
        System.out.println("sisi4 = "+sisi4);    
    }
    int HitungKeliling(){
        int Keliling;
        Keliling=sisi1+sisi2+sisi3+sisi4;
        return Keliling;
    }
    void cetakKeliling(){
        System.out.println("Kelilingnya adalah: "+HitungKeliling());
    }
}
