package org.ngleanhvu.mangcongdon;

import java.util.Scanner;

public class Bai2 {
    static int n;
    static int l, r;
    static int [] a;
    static int [] b;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        a[0] = sc.nextInt();
        b[0] = a[0];
        for (int i=1; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i] + b[i-1];
        }
        l = sc.nextInt();
        r = sc.nextInt();
    }
    static int solve(int l, int r) {
        return b[r] - b[l-1];
    }

    public static void main(String[] args) {
        init();
        int result = solve(l,r);
        System.out.println(result);
    }
}
