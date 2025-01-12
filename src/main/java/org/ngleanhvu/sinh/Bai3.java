package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    static int [] init(int n) {
        int [] a = new int[n];
        for (int i=0; i<=n-1; i++) {
            System.out.printf("Nhap a[%d] = \n", i);
            a[i] = sc.nextInt();
        }
        System.out.println();
        return a;
    }
    static void output(int [] a) {
        Arrays.stream(a).forEach(System.out::println);
    }
    static void swap(int i, int j, int [] a) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    static int [] sinh(int [] a, int n) {
        int i = n-2;
        while(i>=0 && a[i] > a[i+1]) --i;
        if (i==-1) for (i=0; i<n; i++) a[i] = i+1;
        else {
            int j = n-1;
            while(a[i] > a[j]) --j;
            swap(i,j,a);
            Arrays.sort(a,i, j);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.printf("n = \n"); int n = sc.nextInt();
        int [] a = init(n);
        a = sinh(a,n);
        output(a);
    }
}
