package org.ngleanhvu.sinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai13 {
    static int n;
    static int k;
    static boolean ok = true;
    static int [] a;
    static List<int[]> v = new ArrayList<>();

    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n+1];
        Arrays.fill(a, 0);
    }
    static void sinh() {
        int i = n;
        int count = 0;
        while(i>=1 && a[i] == 1) {
            a[i] = 0;
            --i;
        }
        if (i==0) ok = false;
        else {
            a[i] = 1;
            int j = 1;
            for (j=1; j<=n; j++) {
                if (a[j] == 0) ++count;
                else {
                   if (count == k) v.add(Arrays.copyOfRange(a,1,n+1));
                   count = 0;
                }
            }
            if(count == k && j == n+1) v.add(Arrays.copyOfRange(a,1,n+1));
        }
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            sinh();
        }
        for (var item:v) System.out.println(Arrays.toString(item));
    }
}
