package org.ngleanhvu.mang1chieu.mangcongdon;

import java.util.Scanner;

public class Bai7 {
    static int n,k,q;
    static int [] a;
    static int [] f;
    static void init() {
        a = new int[200005];
        f = new int[200000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        q = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int l, r;
            l = sc.nextInt();
            r = sc.nextInt();
            a[l] += 1;
            a[r + 1] -= 1;
        }
        for (int i = 1; i <= 200000; i++) {
            a[i] += a[i - 1];
        }
        int dem = 0;
        for (int i = 1; i < 200000; i++) {
            if (a[i] >= k) ++dem;
            f[i] = dem;
        }
        while(q!=0) {
            int l,r; l = sc.nextInt(); r=sc.nextInt();
            System.out.println(f[r]-f[l-1]);
            q--;
        }
    }

    public static void main(String[] args) {
        init();
    }
}
