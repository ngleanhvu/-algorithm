package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Bai20 {
    static int n;
    static boolean ok = true;
    static int [] a;
    static int [] b;
    static int result = 100000;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1];
        b = new int[n+1];
        Arrays.fill(a,0);
        for (int i=1; i<=n; i++) b[i] = sc.nextInt();
    }
    static void sinh() {
        int i = n;
        while(i>=1 && a[i]==1) {
            a[i] = 0;
            --i;
        }
        if(i==0) ok = false;
        else {
            a[i] = 1;
            int sum1 = 0, sum2 = 0;
            for (int j=1; j<=n; j++) {
                if (a[j] == 1) sum1+=b[j];
                else sum2+=b[j];
            }
            result = Math.min(Math.abs(sum1-sum2), result);
        }
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            sinh();
        }
        System.out.println(result);
    }
}
