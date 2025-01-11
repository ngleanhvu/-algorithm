package org.ngleanhvu.sinh;

import javax.lang.model.type.MirroredTypeException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class SinhToHop {

    static int n;
    static int k;

    static boolean ok = true;

    static int [] a = new int[4];

    static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = "); n = sc.nextInt();
        System.out.println("k = 3"); k = sc.nextInt();

        for (int i=1; i<=k; i++) a[i] = i;
    }

    static void sinh() {
        // ban dau init xong: 123
        int i = k;
        // kiem tra co phai cau hinh cuoi cung
        while(i >= 1 && a[i] == n-k+i) {
            i--;
        }
        // ket qua 123 i=3 k=3
        // truong hop 2: i == 0 da toi cau hinh cuoi cung
        if (i==0) ok=false;
        // truong hop 1: i van nam trong doan [1,k]
        else {
            // 124 i=3 k=3
            a[i]++;
            for (int j=i+1; j<=k; j++) {
                a[j] = a[j-1] + 1;
            }
        }

    }

    static void output() {
        for(int i=1; i<=k; i++) System.out.print(a[i]);
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
