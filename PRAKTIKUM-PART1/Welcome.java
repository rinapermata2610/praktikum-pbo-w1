/**
 * WEEK 1 PBO - PART 1
 * Welcome.java
 
 * Nama  : Rina Permata Dewi
 * NIM   : 241511061
 * Kelas : 2B/D3 Teknik Informatika
 */

/**
 * This program displays a greeting for the reader.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);

        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
    }
}