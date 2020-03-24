package com.logixode.rk.queue;

/** Proses utama Queue
 * @author Rohmad Kurniadi
 */
public class Queue {
    
    public int maxQueue;
    public int myQueue[];
    public int rear;

    /** Cunstructor dari class Queue
     * @param maxValue int  panjang maksimal untuk array myQueue[]
     */
    public Queue( int maxValue ) {
        maxQueue    = maxValue;
        myQueue     = new int[maxQueue];
        rear--;
    }
    
    /** Method untuk memasukkan nilai baru kedalam array myQueue[]
     * @param value int  nilai baru yang ingin di-insert ke array
     */
    public void insert( int value ) {
        rear++;
        myQueue[rear] = value;
    }
    
    /** Method untuk menampilkan antrian
     * @param none
     */
    public void view() {
        System.out.println("Antriannya adalah :");
        
        for (int i = 0; i <= rear; i++) {
            System.out.println("\t" + myQueue[i]);
        }
    }
    
    /** Function untuk menghapus array dengan index pertama
     * @return array index pertama dari myQueue[] yang telah terhapus
     */
    public int remove() {
        int removed = myQueue[0];
        shifting();
        rear--;
        return removed;
    }
    
    /** Method untuk menata ulang urutan antrian
     * @param none
     */
    public void shifting() {
        for (int i = 0; i < rear; i++) {
            myQueue[i] = myQueue[i+1];
        }
        
        myQueue[rear] = 0;
    }
    
}
