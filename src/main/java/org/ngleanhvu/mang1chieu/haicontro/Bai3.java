package org.ngleanhvu.mang1chieu.haicontro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    static int n,m;
    static int [] a;
    static int [] b;
    static List<Integer> list;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n+1];
        b = new int[m+1];
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int j = 0; j < m; j++) b[j] = sc.nextInt();
        int i=0, j=0, count=0;
        while (i<n && j<m)  {
            if(a[i]==b[j]) {
                int dem1 = 0, dem2=0;
                while(a[i]==b[j]) {
                    ++dem1;
                    ++i;
                }
                while(a[i-1]==b[j]) {
                    ++dem2;
                    ++j;
                }
                count += dem1*dem2;
            } else if(a[i] > b[j]) {
                ++j;
            } else {
                ++i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int result = solve();
        System.out.println(result);
    }
}
