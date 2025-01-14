package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai21 {
    static int n;
    static String [] s;
    static boolean ok = true;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        s = new String[n+1];
        for (int i=1; i<=n; i++) {
            s[i]  = sc.nextLine();
        }
        Arrays.sort(s,1,n+1);
    }
    static void sinh() {
        int i = n-1;
        while(i>=1 && s[i].compareTo(s[i+1]) > 0) {
            --i;
        }
        if (i==0) ok = false;
        else {
            int j = n;
            while (s[i].compareTo(s[j]) > 0) --j;
            String tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            Arrays.sort(s, i+1 , n + 1);
        }
    }
    static void output() {
        for (int i=1; i<=n; i++) System.out.print(s[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            output();
            sinh();
        }
    }
}
