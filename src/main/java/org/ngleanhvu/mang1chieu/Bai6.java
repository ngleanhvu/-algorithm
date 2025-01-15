package org.ngleanhvu.mang1chieu;

import javax.print.attribute.standard.Finishings;
import java.util.Scanner;

public class Bai6 {
    static int [] a;
    static int [] b;
    static int k;
    static int n;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        b = new int[1001];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[a[i]]++;
        }
    }

    public static void main(String[] args) {
        init();
        int count = 0;
        for (int i=0; i<=k/2; i++) {
            int y = k-i;
            if(y!=i) count += b[i]*b[y]; // truong hop y=5 i=5
            else count += b[i]*(b[i]-1)/2;
        }
        System.out.println(count);
    }
}
