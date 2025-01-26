package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.HashMap;
import java.util.Scanner;

public class Bai37 {
    static int n,k;
    static int [] a;
    static HashMap<Integer, Integer> map;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n]; map = new HashMap<>();
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int sum = 0; map.put(0,-1); int ans = 0;
        for (int i=0; i<n; i++) {
            sum = (sum+a[i]%k+k)%k; // +k de cho so duong neu a[i] am thi a[i]%k ra 1 so roi cong them k
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i-map.get(sum));
            }
            if (!map.containsKey(sum)) map.put(sum,i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
