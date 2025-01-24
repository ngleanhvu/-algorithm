package org.ngleanhvu.mang1chieu.haicontro;

import java.util.HashMap;
import java.util.Scanner;

public class Bai10_C1 {
    static int n,k;
    static int [] a;
    static HashMap<Integer, Integer> map = new HashMap<>();
    static boolean solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<n; i++) {
            if (map.getOrDefault(k-a[i], 0)==1) return true;
            map.put(a[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve() ? "YES": "NO");
    }
}
