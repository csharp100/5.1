/*
 * Exercise 5.1 from the Liang Java Textbook 8E
 * Comprehensive Version
 */

package pkg5.pkg1;

/**
 *
 * @author Clint Sharp
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(getPentagonalNumber(i));
        }
    }

    public static int getPentagonalNumber(int n) {
            n = (n * ((3 * n) - 1) / 2);     
        return n;
    }

}