package org.ngleanhvu.sinh;

import java.util.*;

public class Bai26 {
    static int n;
    static int k;
    static int [] a;
    static boolean ok = true;
    static Set<Integer> set;
    static int [] b;
    static int [] c;
    static List<int []> list = new ArrayList<>();

    static void init() {
        ok = true;
        set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        c = new int[set.size()];
        Arrays.fill(c, 0);
        b = new int[set.size()];
        int i=0;
        for (var item:set) {
            b[i] = item;
            ++i;
        }
    }
    static void sinh() {
        int i=set.size()-1;
        while(i>=0 && c[i] == 1) {
            c[i] = 0;
            --i;
        }
        if (i==-1) ok = false;
        else {
            c[i] = 1;
            int count = 0;
            int [] item = new int[set.size()];
            for (int j=0; j<set.size(); j++) {
                if(c[j] == 1) {
                    item[j] = b[j];
                    ++ count;
                }
            }
            if(count == k) list.add(item);
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
