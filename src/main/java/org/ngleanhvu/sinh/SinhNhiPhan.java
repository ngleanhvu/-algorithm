package org.ngleanhvu.sinh;

import javax.swing.text.Style;
import java.util.Scanner;
import java.util.TreeMap;

public class SinhNhiPhan {
    static int n;
    static boolean ok = true;
    static int [] X = new int[100];

    static void khoiTao() {
        for (int i=0; i<n; i++) {
            X[i] = 0;
        }
    }

    static void sinh() {
        int i = n-1;
        while (i >=0 && X[i] == 1) {
            X[i] = 0;
            i--;
        }
        if(i==-1) ok=false;
        // Tim duoc bit dau tien = 0 tinh tu ben phai
        else X[i] = 1;
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
        while (ok) {
            xuat();
            sinh(); // sinh ra cau hinh tiep theo
        }
    }
}
