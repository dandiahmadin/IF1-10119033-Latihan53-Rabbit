/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.rabbit;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi object kelinci dengan pendekatan object oriented dan 
 * penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is ".concat(rabbit.getName()));
        System.out.println(rabbit.getName().concat(" is Vegetarian? ") + rabbit.isVegetarian());
        System.out.println(rabbit.getName().concat(" eats ").concat(rabbit.getEats()));
        System.out.println(rabbit.getName().concat(" has ") + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName().concat(" has ").concat(rabbit.getColor()));
    }
    
}
