package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai2 {
    static int n;
    static int [] a;
    static List<Integer> list = new ArrayList<>();
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        list.add(a[0]);
    }
    static void solve() {
        int tmp = a[0];
        for (int i=1; i<n; i++) {
            if(a[i] > tmp) {
                list.add(a[i]);
                tmp = Math.max(tmp, a[i]);
            }
        }
    }

    public static void main(String[] args) {
        init();
        solve();
        System.out.println(list);
    }
}
