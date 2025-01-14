package org.ngleanhvu.sinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai25 {
    static int n;
    static boolean ok = true;
    static int [] a;
    static List<int []> list = new ArrayList<>();
    static boolean check(int [] a) {
        for (int j=1; j<n; j++) {
            if (a[j] == a[j+1]) return false;
        }
        return true;
    }
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1];
        Arrays.fill(a, 0);
    }
    static void sinh() {
        int i = n;
        while(i>=1 && a[i] == 1) {
            a[i] = 0;
            --i;
        }
        if(i==0) ok = false;
        else {
            a[i] = 1;
            if(check(a)) list.add(Arrays.copyOfRange(a,1,n+1));
        }
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            sinh();
        }
        for(var item:list) System.out.println(Arrays.toString(item));
    }
}
