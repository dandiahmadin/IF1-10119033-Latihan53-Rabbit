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
 * Deskripsi Program : Program ini berisi class Rabbit yang merupakan subclass dari superclass Animal
 */

public class Rabbit extends Animal {
    private String color, name;

    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
    
}
