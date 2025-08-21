/**
 * WEEK 1 PBO - PART 2
 * Soal1DataTypesCheck.java
 
 * Nama  : Rina Permata Dewi
 * NIM   : 241511061
 * Kelas : 2B/D3 Teknik Informatika
 */

import java.util.Scanner;

public class Soal1DataTypesCheck {
    public static void main(String[] args) {
        // Scanner otomatis ditutup setelah blok try selesai
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt(); // jumlah test case

            for (int i = 0; i < T; i++) {
                try {
                    long n = sc.nextLong(); // baca input angka
                    System.out.println(n + " can be fitted in:");

                    if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                        System.out.println("* byte");
                    if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                        System.out.println("* short");
                    if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                        System.out.println("* int");
                    if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                        System.out.println("* long");

                } catch (Exception e) {
                    String val = sc.next();
                    System.out.println(val + " can't be fitted anywhere.");
                }
            }
        }
    }
}
