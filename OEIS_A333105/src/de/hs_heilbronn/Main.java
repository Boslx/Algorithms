package de.hs_heilbronn;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please enter your positive integer value for n: ");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        BigInteger result = A333105.getNumberOfNonnegativeLatticePaths(n);
        System.out.println("For n = " + n + " you get: ");
        System.out.println(result);
        System.out.println("Paths");
    }
}
