package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.Scanner;

public class bai4 {
    static int n;
    static int [] a;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
    }
    static boolean solve() {
        int t25 = 0;
        int t50 = 0;
        for (int i=0; i<n; i++) {
            if(a[i] == 25) {
                t25++;
            } else if(a[i] == 50) {
                if(t25 == 0) return false;
                t50++;
                t25--;
            } else {
                if(t50 > 0 && t25 >0) {
                    t25--;
                    t50--;
                } else if(t50 == 0 && t25 > 3) {
                    t25-=3;
                } else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        init();
        System.out.println(solve());
    }
}
