package org.ngleanhvu.sinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai22 {
    static int n = 4;
    static boolean ok = true;
    static int [] a;
    static List<int[]> list = new ArrayList<>();
    static void init(int n) {
        ok = true;
        a = new int[n+1];
        Arrays.fill(a, 0);
        list.add(Arrays.copyOfRange(a,1,n+1));
    }
    static boolean check(int [] a, int n) {
        int left = 1;
        int right = n;
        while(left<=right){
            if (a[left] != a[right]) return false;
            ++left; --right;
        }
        return true;
    }
    static void sinh(int [] a, int n) {
        int i = n;
        while(i>=1 && a[i] == 1) {
            a[i] = 0;
            --i;
        }
        if (i==0) ok = false;
        else {
            a[i] = 1;
            if(check(a,n)) list.add(Arrays.copyOfRange(a,1,n+1));
        }
    }

    public static void main(String[] args) {
        for (int i=2; i<=n; i*=2) {
            init(i);
            while (ok) {
                sinh(a,i);
            }
        }
        for (var item:list) System.out.println(Arrays.toString(item));
    }
}
