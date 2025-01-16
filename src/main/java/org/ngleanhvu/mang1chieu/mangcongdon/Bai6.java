package org.ngleanhvu.mang1chieu.mangcongdon;

import javax.print.attribute.standard.Finishings;
import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    static int n,q;
    static Integer [] a;
    static int [] d;
    static Integer [] f;
    static Scanner sc = new Scanner(System.in);
    static long res = 0;
    static void init() {
        n = sc.nextInt();
        q = sc.nextInt();
        a = new Integer[n];
        d = new int[n+2];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        while(q!=0) { // dung de dem cac so o vi tri i truy van bao nhieu lan
            int l,r; l=sc.nextInt(); r=sc.nextInt();
            --l; --r;
            d[l] += 1;
            d[r+1] -= 1;
            q--;
        }
        f = new Integer[n];
        // bat dau khoi phuc lai mang goc de biet tai moi vi tri i truy van bao nhieu lan
        f[0] = d[0];
        for (int i=1; i<n; i++) {
            f[i] = f[i-1] + d[i];
        }
        for (int i=0; i<n; i++) {
            System.out.print(f[i]+" ");
        }
        System.out.println();
        Arrays.sort(f, (x, y) -> y - x);
        Arrays.sort(a, (x, y) -> y - x);
        for (int i=0; i<n; i++) {
            res += (long) a[i] *f[i];
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println(res);
    }
}
