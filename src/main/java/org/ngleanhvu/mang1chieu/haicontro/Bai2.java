package org.ngleanhvu.mang1chieu.haicontro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    static int n,m;
    static int [] a;
    static int [] b;
    static List<Integer> list;
    static void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        a = new int[n];
        b = new int[m];
        list = new ArrayList<>();
        for (int i=0; i<n; i++) a[i]=sc.nextInt();
        for (int j=0; j<m; j++) b[j]=sc.nextInt();
        int i=0, j=0, count=0;
        while (i<n) {
            if (a[i] < b[j]) {
                ++i;
                ++count;
            } else {
                list.add(count);
                ++j;

            }
        }
        while(j<m) {
            list.add(count);
            ++j;
        }
        while(i<n) {
            list.add(count);
            ++i;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        solve();
    }
}
