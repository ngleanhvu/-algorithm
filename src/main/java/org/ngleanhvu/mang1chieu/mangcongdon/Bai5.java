package org.ngleanhvu.mang1chieu.mangcongdon;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    static int n,l,r,k;
    static int [] a;
    static int [] d;
    static int [] f;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        d = new int[n+2];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            if(i==0) d[0] = a[0];
            else d[i] = a[i]-a[i-1];
        }
        l = sc.nextInt();
        r = sc.nextInt();
        k = sc.nextInt();
        d[l] += k;
        d[r] -= k;
        f  = new int[n];
        f[0] = d[0];
        for (int i=1; i<n; i++) {
            f[i] = f[i-1] + d[i];
        }
        System.out.println(Arrays.toString(f));
    }

    public static void main(String[] args) {
        init();
    }
}
