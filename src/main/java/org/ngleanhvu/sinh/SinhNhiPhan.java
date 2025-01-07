package org.ngleanhvu.sinh;

import javax.swing.text.Style;
import java.util.Scanner;
import java.util.TreeMap;

public class SinhNhiPhan {
    static int n;
    static int [] X = new int[100];

    static void khoiTao() {
        for (int i=0; i<n; i++) {
            X[i] = 0;
        }
    }
    // Cau hinh cuoi cung toan bo = 1
    static boolean kiemTra() {
        for(int i=0; i<n; i++) {
            if(X[i] == 0) return false;
        }
        return true;
    }

    static void sinh() {
        int i = n-1;
        while (i >=0 && X[i] == 1) {
            X[i] = 0;
            i--;
        }
        // Tim duoc bit dau tien = 0 tinh tu ben phai
        X[i] = 1;
    }
    static void xuat() {
        for(int i=0; i<n; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Bat dau tu bit cuoi cung
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = "); n = scanner.nextInt();
        while (!kiemTra()) {
            xuat();
            sinh(); // sinh ra cau hinh tiep theo
        }
        xuat();
    }
}
