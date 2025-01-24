package org.ngleanhvu.mang1chieu.haicontro;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10_C2 {
    static int n,k;
    static int [] a;
    static boolean solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int left = 0, right = n-1;
        Arrays.sort(a);
        while (left <= right) {
            if (a[left] + a[right] == k) return true;
            if (a[left] + a[right] > k) {
                --right;
            } else {
                ++left;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve() ? "YES" : "NO");
    }
}
