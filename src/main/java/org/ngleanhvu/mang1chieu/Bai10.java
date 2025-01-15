package org.ngleanhvu.mang1chieu;

import javax.swing.text.Style;
import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    static int n;
    static int [] a;
    static int [] b;

    static boolean check(int k) {
        if (k<2) return false;
        for (int i=2; i<=Math.sqrt(k); i++) {
            if(k%i==0) return false;
        }
        return true;
    }
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        a[0] = sc.nextInt();
        b[0] = a[0];
        for(int i=1; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i]+b[i-1];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }


    public static void main(String[] args) {
        init();
        for (int i=1; i<n; i++) {
            if(check(b[n-1]-b[i]) && check(b[i]-a[i])) System.out.println(i);
        }
    }
}
