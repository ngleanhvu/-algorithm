package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Scanner;

public class SinhHoanVi {
    static int n;
    static int [] a = new int[100];
    static boolean ok=true;
    static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = "); n = sc.nextInt();
        for (int i=1; i<=n; i++) a[i] = i;
    }
    static void swap(int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    static void reserve(int j, int n) {
        int left = j, right = n;
        while(left < right) {
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            ++left;
            --right;
        }
    }
    static void sinh() {
        // bat dau tu sat vi tri cuoi cung
        // Ban dau 1 2 3 4 5
        // Khi nao a[i] > a[i+1] dich sang ben trai
        int i = n-1;
        while((a[i] > a[i+1]) && i>=1) {
            i--;
        }
        if (i==0) ok=false;
        else {
            // a[i] < a[i+1]
            // Di tim so sau vi tri i > a[i] va nho nhat co the
            int j = n;
            while (a[j] < a[i]) --j; // dich sang trai
            // a[j] phan tu lon hon a[i] nho nhat
            // sau do swap(a[i], a[j])
            swap(i, j);
            // dao nguoc mang tu vi tri j -> n => hai con trỏ o(n)
            reserve(i+1, n);
            // hoac dung hang sort Arrays.sort(arr, i, j) => o(nlogn)
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
