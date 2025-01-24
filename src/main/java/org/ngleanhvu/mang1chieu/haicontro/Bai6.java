package org.ngleanhvu.mang1chieu.haicontro;

import javax.swing.plaf.metal.MetalTheme;
import java.util.Scanner;

public class Bai6 {
    static int n,s;
    static int [] a;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        int left=0, sum=0, ans=0;
        for (int right=0; right<n; right++) {
            sum+=a[right];
            while(sum > s) {
                sum-=a[left];
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
