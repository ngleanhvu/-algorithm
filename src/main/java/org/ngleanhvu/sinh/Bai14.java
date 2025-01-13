package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bai14 {
    static int sinh(int [] a, int n, int k) {
        int count = 0;
        Map<Integer, Integer> map = IntStream.range(1, k+1)
                .boxed()
                .collect(Collectors.toMap(i->i, i->a[i]));
        for(var item:map.entrySet()) System.out.println(item);
        int i = k;
        while(i>=1 && a[i] == n-k+i) --i;
        if(i==0) return k;
        else {
            a[i]++;
            for (int j=i+1; j<=k; j++) a[j] = a[j-1] + 1;
            for (int j=1; j<=k; j++) {
                if(!map.containsValue(a[j])) ++ count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[n+1];
        for (int i=1; i<=k; i++) {
            a[i] = sc.nextInt();
        }
        int result = sinh(a, n, k);
        System.out.println(result);
    }
}
