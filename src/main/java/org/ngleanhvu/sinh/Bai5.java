package org.ngleanhvu.sinh;

import java.util.Scanner;

public class Bai5 {
    static int n;
    static int k;
    static boolean ok = true;
    static int [] a = new int[100];
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=1; i<=k; i++) a[i] = i;
    }
    static void sinh() {
        int i=n;
        while(i>=1 && a[i] == n-k+i) --i;
        if(i==0) ok=false;
        else {
            a[i]++;
            for(int j=i+1; j<=k; j++) a[j] = a[j-1] + 1;
        }
    }
    static void output() {
        for(int i=1; i<=k; i++) System.out.print(a[i]);
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
