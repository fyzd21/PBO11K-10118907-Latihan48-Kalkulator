/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan48.kalkulator;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan kalkulator menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        k.setValue1(7);
        k.setValue2(5);
        
        System.out.println("VALUE 1 = "+k.getValue1());
        System.out.println("VALUE 2 = "+k.getValue2());
        k.setNameProject();
        k.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = "+k.add(k.getValue1(), k.getValue2()));
        System.out.println("Result minus is = "+k.minus(k.getValue1(), k.getValue2()));
        System.out.println("Result multiple is = "+k.multiplication(k.getValue1(), k.getValue2()));
        System.out.println("Result division is = "+k.division(k.getValue1(), k.getValue2()));
    }
    
}
