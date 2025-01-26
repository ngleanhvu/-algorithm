package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.HashMap;
import java.util.Scanner;

public class Bai34 {
    static int n,k;
    static int [] a;
    static HashMap<Integer, Integer> map;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n+1]; map = new HashMap<>();
        int ans = -1;
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if (!map.containsKey(a[i])) map.put(a[i], i);
            if (map.containsKey(a[i]-k)) ans = Math.max(ans, i-map.get(a[i]-k)+1);
            if (map.containsKey(a[i]+k)) ans = Math.max(ans, i-map.get(a[i]+k)+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
