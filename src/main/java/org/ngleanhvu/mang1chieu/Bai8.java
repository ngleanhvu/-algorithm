package org.ngleanhvu.mang1chieu;

import java.util.Scanner;

public class Bai8 {
    static int n;
    static int [] a;
    static int [] b;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[1001];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[a[i]] = 1;
        }
    }

    public static void main(String[] args) {
        init();
        for (int i=0; i<n; i++) {
            if (b[a[i]] == 1) {
                System.out.println(a[i]);
                b[a[i]] = 0;
            }
        }
    }
}
