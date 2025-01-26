package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.HashMap;
import java.util.Scanner;

public class Bai33 {
    static int n,k;
    static int [] a;
    static HashMap<Integer, Integer> map;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n]; map = new HashMap<>(); map.put(0,-1);
        int sum = 0, ans = 10000;
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<n; i++) {
            sum += a[i];
            if(map.containsKey(sum-k)) {
                ans = Math.min(ans, i-map.get(sum-k));
            }
            map.put(sum, i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
