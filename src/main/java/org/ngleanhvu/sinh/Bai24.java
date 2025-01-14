package org.ngleanhvu.sinh;

import java.util.*;

public class Bai24 {
    static int n;
    static int [] a;
    static int [] b;
    static boolean ok = true;
    static List<List<Integer>> list = new ArrayList<>();
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1];
        b = new int[n+1];
        Arrays.fill(a,0);
        for (int i=1; i<=n; i++) b[i] = sc.nextInt();
    }
    static boolean check(int [] a) {
        for (int i=1; i<=n; i++) {
            if (a[i] != 0) return true;
        }
        return false;
    }
    static void sinh() {
        int i = n;
        while(i>=1 && a[i] == 1) {
            a[i] = 0;
            --i;
        }
        if (i==0) ok = false;
        else {
            a[i] = 1;
            List<Integer> tmp = new ArrayList<>();
            for (int j=1; j<=n; j++) {
                if(a[j] == 1) {
                    tmp.add(b[j]);
                }
            }
            if(!tmp.isEmpty()) list.add(tmp);
        }
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            sinh();
        }
        list.sort((a, b) -> {
            if(a.size() != b.size()) {
                return Integer.compare(a.size(), b.size());
            }
            return a.toString().compareTo(b.toString());
        });
        for (var item:list) {
            System.out.println(item);
        }
    }
}
