package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.HashMap;
import java.util.Scanner;

public class Bai38 {
    static int n;
    static int [] a;
    static HashMap<Integer, Integer> map;
    static void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1]; map = new HashMap<>();
        for (int i=1; i<=n; i++) a[i] = sc.nextInt();
        int distinct = 0; map.put(0,0); int sum=0; int start = 0;
        for (int i=1; i<=n; i++) {
            sum+=a[i];
            if (map.containsKey(sum)) {
                int kc = i-map.get(sum);
                if (kc > distinct) {
                    distinct = kc;
                    start = map.get(sum)+1;
                }
            }
            if (!map.containsKey(sum)) map.put(sum,i);
        }
        for (int i=start; i<start+distinct; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
