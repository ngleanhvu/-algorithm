package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    static int n;
    static int [] a = new int[100];
    static boolean ok = true;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1; i<=n; i++) a[i] = i;
    }
    static void reserve(int j, int n) {
        int left = j, right = n;
        while(left < right) {
            int tmp = a[right];
            a[right] = a[left];
            a[left] = tmp;
            ++left;
            --right;
        }
    }
    static void sinh() {
        int i = n-1;
        while(i>=1 && a[i] > a[i+1]) --i;
        if(i==0) ok=false;
        else {
            int j = n;
            while(a[i] > a[j]) --j;
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            reserve(i+1, n);
        }
    }
    static void output() {
        for(int i=1; i<=n; i++) System.out.print(a[i]);
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
