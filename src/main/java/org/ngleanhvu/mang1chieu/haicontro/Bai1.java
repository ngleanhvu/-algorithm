package org.ngleanhvu.mang1chieu.haicontro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    static int n,m;
    static int [] a;
    static int [] b;
    static List<Integer> list;
    static void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m=sc.nextInt();
        a = new int[n];
        b = new int[m];
        list = new ArrayList<>();
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<m; i++) b[i] = sc.nextInt();
        int i=0, j=0;
        while(i < n && j < m) {
            if(a[i] < b[j]) {
                list.add(a[i]);
                ++i;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                ++j;
            } else {
                list.add(a[i]);
                list.add(b[j]);
                ++i; ++j;
            }
        }
        while(i<n) {
            list.add(a[i]);
            ++i;
        }
        while (j<m){
            list.add(b[j]);
            ++j;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        solve();
    }
}
