package org.ngleanhvu.mang1chieu.haicontro;

import java.util.Scanner;

public class Bai5 {
    static int n,s;
    static int [] a;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int left=0, right=0, ans=100000, sum=0;
        for (right=0; right<n; right++) {
            sum+=a[right];
            while (sum>=s) {
                sum-=a[right];
                ans = Math.min(ans, right-left+1);
                ++left;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = solve();
        System.out.println(result);
    }
}
