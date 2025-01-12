package org.ngleanhvu.sinh;

import java.util.Scanner;

public class Bai4 {
    static int n;
    static char [] a = new char[10];
    static boolean ok = true;
    static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = "); n = sc.nextInt();
        for (int i=1; i<=n; i++) a[i] = 'A';
    }
    static void sinh() {
        int i=n;
        while(i>=1 && a[i] == 'B') {
            a[i] = 'A';
            --i;
        }
        if(i==0) ok = false;
        else {
            a[i] = 'B';
        }
    }
    static void output() {
        for (int i=1; i<=n; i++) System.out.print(a[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        init();
        while (ok) {
            output();
            sinh();
        }
    }
}
