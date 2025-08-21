/**
 * WEEK 1 PBO - PART 2
 * Soal5StringTasks.java
 
 * Nama  : Rina Permata Dewi
 * NIM   : 241511061
 * Kelas : 2B/D3 Teknik Informatika
 */

import java.util.Scanner;

public class Soal5StringTasks {
    public static void main(String[] args) {
        // Scanner otomatis ditutup setelah keluar dari blok try
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.next();
            String B = sc.next();

            // 1. jumlah panjang string
            System.out.println(A.length() + B.length());

            // 2. perbandingan lexicographic
            if (A.compareTo(B) > 0)
                System.out.println("Yes");
            else
                System.out.println("No");

            // 3. kapitalisasi huruf pertama
            String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capA + " " + capB);
        }
    }
}
