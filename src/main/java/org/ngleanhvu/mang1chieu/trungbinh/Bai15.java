package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai15 {
    static int n, res, count;
    static int [] a;

    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
    }
    static Map<Integer, Integer> solve() {
        Arrays.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        count = 1;
        res = Math.min(10000, a[1] - a[0]);
        for (int i=2; i<n; i++) {
            if(a[i]-a[i-1] < res) {
                res = a[i] - a[i-1];
                count = 1;
            } else if(a[i]-a[i-1] == res) ++count;
        }
        map.put(res, count);
        return map;
    }

    public static void main(String[] args) {
        init();
        System.out.println(solve());
    }
}
