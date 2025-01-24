package org.ngleanhvu.mang1chieu.haicontro;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Bai8 {
    static int n,s;
    static int [] a;
    static HashMap<Integer, Integer> map;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        a = new int[n];
        map = new HashMap<>();
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int left=0, ans=0;
        for (int right=0; right<n; right++) {
            map.put(a[right], map.getOrDefault(a[right], 0)+1);
            while (map.size() > s) {
                map.put(a[left], map.get(a[left])-1);
                if (map.get(a[left])==0) map.remove(a[left]);
                ++left;
            }
            ans += right-left+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
