/**
 * WEEK 1 PBO - PART 2
 * Soal2Constants.java
 
 * Nama  : Rina Permata Dewi
 * NIM   : 241511061
 * Kelas : 2B/D3 Teknik Informatika
 */

// Header identitas…
public class Soal2Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54; // konstanta lokal (hanya di main)
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
                + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}