/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class Luas {
    // variable instance
    double jari2;
    double phi;
    double hasil;
    
    //Method Void
    //konstruktor dan parameter
    void Luas(double jari2, double phi) {
        this.phi = phi;
        this.jari2 = jari2;
    }
    
    //method hitung
    void hitung() {
        hasil = phi * jari2 * jari2;
        System.out.println("<<<<Method Void>>>>");
        System.out.println("Hasil dari Luas Lingkaran adalah : " + hasil);
        System.out.println();
    }

    //Method Non Void 
    double jari2() {
        return jari2;
    }

    double phi() {
        return phi;
    }
    
    //Method Hitung
    double Hitung() {
        System.out.println("<<<<Method Non Void>>>>");
        System.out.println("Hasil dari Luas Lingkaran adalah : " + hasil);
        return hasil;
    }
}
