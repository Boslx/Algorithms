package de.hs_heilbronn;

import java.math.BigInteger;

public class A333105 {
    public static BigInteger getNumberOfNonnegativeLatticePaths(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0 || n == 1) return BigInteger.ONE;

        int arrayWidth = n - 1;
        BigInteger[][] pathArray = new BigInteger[arrayWidth][(n)];
        for (int x = 0; x < arrayWidth; x++) {
            for (int y = 0; y < n; y++) {
                pathArray[x][y] = BigInteger.ZERO;
            }
        }

        pathArray[0][0] = BigInteger.ONE; // fill the first column of the array. The first both values has to be 1.
        pathArray[0][1] = BigInteger.ONE;

        int iy;
        for (int x = 0; x + 1 < arrayWidth; x++) {
            for (int y = 0; y < n; y += 1) {
                for (int i = -1; i <= y || i == 1; i++) {
                    iy = y + i;
                    if (iy >= 0 && ((iy < n)))
                        pathArray[x + 1][iy] = pathArray[x + 1][iy].add(pathArray[x][y]);
                }
            }
        }

        return pathArray[(arrayWidth - 1)][0].add(pathArray[(arrayWidth - 1)][1]);
    }
}
