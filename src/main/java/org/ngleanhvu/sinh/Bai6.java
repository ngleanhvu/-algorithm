package org.ngleanhvu.sinh;

import java.util.Scanner;

public class Bai6 {
    static int n;
    static int [] a = new int[100];
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1; i<=n; i++) a[i] = sc.nextInt();
    }

    static void output() {
        for(int i=1; i<=n; i++) System.out.print(a[i]);
        System.out.println();
    }
}
