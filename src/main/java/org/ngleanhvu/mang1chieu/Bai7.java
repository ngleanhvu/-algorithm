package org.ngleanhvu.mang1chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    static int n;
    static int [] a;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
    }
    public static void main(String[] args) {
        init();
        int res = 1001;
        for (int i=0; i<n-1; i++) {
            res = Math.min(a[i+1]-a[i], res);
        }
        System.out.println(res);
    }
}
