package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai35 {
    static int n,k;
    static int [] a;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int left = 0, ans = 0, min_value = 1000000;
        for (int right = 0; right < n; right++) {
            min_value = Math.min(min_value, a[right]);
            while (Math.abs(a[right]-min_value) > k) {
                ++left;
                min_value = a[left];
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
