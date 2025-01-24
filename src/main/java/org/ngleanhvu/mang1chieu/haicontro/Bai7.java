package org.ngleanhvu.mang1chieu.haicontro;

import java.util.Scanner;

public class Bai7 {
    static int n,s;
    static int [] a;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int left = 0, sum = 0, ans = 0;
        for(int right=0; right<n; right++) {
            sum+=a[right];
            while(sum>=s) {
                ans += n-right;
                sum-=a[left];
                ++left;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
