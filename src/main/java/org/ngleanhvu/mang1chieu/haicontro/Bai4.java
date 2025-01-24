package org.ngleanhvu.mang1chieu.haicontro;

import java.util.Scanner;

public class Bai4 {
    static int n,s;
    static int [] a;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); s = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int left=0, right=0, sum=0, ans=0;
        for (int i=0; i<n; i++) {
            sum+=a[right];
            while(sum > s) {
                sum-=a[left];
                ++left;
            }
            ans=Math.max(ans,right-left+1);
            ++right;
        }
        return ans;
    }

    public static void main(String[] args) {
        int result=solve();
        System.out.println(result);
    }
}
