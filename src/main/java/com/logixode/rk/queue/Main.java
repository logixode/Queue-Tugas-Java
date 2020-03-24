package com.logixode.rk.queue;

/** Class utama dari project Queue
 * @author Rohmad Kurniadi
 */
public class Main {
    public static void main(String[] args) {
        
        // declare object dari class Queue
        Queue antrian = new Queue(5);
        
        antrian.insert(1);
        antrian.insert(3);
        antrian.insert(5);
        antrian.insert(6);
        
        antrian.view();
        
        System.out.println("\nMenghapus item dari antrian");
        System.out.println(
            "Item yang terhapus adalah " + 
            antrian.remove() +
            "\n"
        );
        
        antrian.view();
        
    }
}
