/**
 * WEEK 1 PBO - PART 2
 * Soal4ConvertDataType.java
 
 * Nama  : Rina Permata Dewi
 * NIM   : 241511061
 * Kelas : 2B/D3 Teknik Informatika

 */

class Soal4ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;      // long -> int (potensi pemotongan bila besar)
        return (short) i;     // int -> short
    }

    public static void main(String[] args) {
        double d = 10.25;         // nilai awal
        float f = (float) d;      // double -> float (presisi bisa berkurang)
        byte b = (byte) methodOne((long) f); // float -> long -> int -> short -> byte

        System.out.println(b);
    }
}