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
        if( isFull() ) {
            System.out.println("Maaf, antrian sedang penuh...\n");
        }
        else {
            rear++;
            myQueue[rear] = value;
        }
    }
    
    /** Method untuk menampilkan antrian
     * @param none
     */
    public void view() {
        if( isEmpty() ) {
            System.out.println("Antian bisa diisi kembali.\n");
        }
        else {
            System.out.println("Antriannya adalah :");
            for (int i = 0; i <= rear; i++) {
                System.out.println("\t" + myQueue[i]);
            }
            System.out.println();
        }
    }
    
    /** Function untuk menghapus array dengan index pertama
     * @return array index pertama dari myQueue[] yang telah terhapus
     */
    public int remove() {
        if( isEmpty() ) {
            System.out.println("Maaf, antrian sudah kosong.\n");
            return 0;
        }
        else {
            int removed = myQueue[0];
            shifting();
            rear--;
            return removed;
        }
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
    
    /** Function untuk cek kondisi jika myQueue[] kosong
     * @return true atau false
     */
    public boolean isEmpty() {
        return (rear == -1);
    }
    
    /** Function untuk cek kondisi jika myQueue[] penuh
     * @return true atau false
     */
    public boolean isFull() {
        return (maxQueue -1 == rear);
    }
}
// EOF