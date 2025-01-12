package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai7 {
    static Integer n;
    static Boolean ok = true;
    static Integer [] a = new Integer[100];
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1; i<=n; i++) a[i] = n-i+1;
    }
    static void sinh() {
        int i = n-1;
        while (i>=1 && a[i] < a[i+1]) i--; // vi tri bat dau sinh hoan vi
        if(i==0) ok = false;
        else {
            int j = n;
            while(a[i] < a[j]) j--; // vi tri bat dau thay doi hoan vi
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            Arrays.sort(a, i+1, n+1,  Collections.reverseOrder());
        }
    }
    static void output() {
        for (int i=1; i<=n; i++) System.out.print(a[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            output();
            sinh();
        }
    }
}
