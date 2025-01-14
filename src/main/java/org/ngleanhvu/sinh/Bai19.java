package org.ngleanhvu.sinh;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai19 {
    static int n;
    static int [] a;
    static boolean ok = true;
    static List<int[]> list = new ArrayList<>();
    static boolean check() {
        int left = 1;
        int right = n;
        while(left<=right) {
            if(a[left] != a[right]) return false;
            ++left;
            --right;
        }
        return true;
    }
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n+1];
        Arrays.fill(a,0);
        list.add(Arrays.copyOfRange(a,1,n+1));
    }
    static void sinh() {
        int i=n;
        while(i>=1 && a[i]==1){
            a[i] = 0;
            --i;
        }
        if(i==0) {
            ok = false;
        } else {
            a[i] = 1;
            if (check()) list.add(Arrays.copyOfRange(a,1,n+1));
        }
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            sinh();
        }
        for (var item:list)
            System.out.println(Arrays.toString(item));
    }
}
