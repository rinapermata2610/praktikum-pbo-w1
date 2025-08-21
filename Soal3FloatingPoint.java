/**
 * WEEK 1 PBO - PART 2
 * Soal3FloatingPoint.java
 
 * Nama  : Rina Permata Dewi
 * NIM   : 241511061
 * Kelas : 2B/D3 Teknik Informatika
 */

public class Soal3FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        long rounded = Math.round(x); // Math.round(double) -> long
        int nx = (int) rounded;       // cast ke int sesuai variabel yang diminta

        System.out.println("x       = " + x);
        System.out.println("rounded = " + rounded);
        System.out.println("nx      = " + nx);
    }
}
