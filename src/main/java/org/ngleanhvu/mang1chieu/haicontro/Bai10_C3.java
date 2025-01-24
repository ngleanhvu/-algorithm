package org.ngleanhvu.mang1chieu.haicontro;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10_C3 {
    static int n,k;
    static int [] a;
    static boolean solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<n; i++) {
            if (Arrays.binarySearch(a, k-a[i]) == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve() ? "YES" : "NO");
    }
}
