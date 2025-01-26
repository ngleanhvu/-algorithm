package org.ngleanhvu.mang1chieu.slidingwindow;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Bai2 {
    static int n,k;
    static int [] a;
    static TreeMultiset<Integer> multiset = TreeMultiset.create();
    static Vector<Pair<Integer, Integer>> v = new Vector<>();
    static void solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<k; i++) {
            multiset.add(a[i]);
        }

        v.add(Pair.of(Objects.requireNonNull(multiset.firstEntry()).getElement(),
                Objects.requireNonNull(multiset.lastEntry()).getElement()));

        for (int i=k; i<n; i++) {
            multiset.remove(a[i-k], 1);
            multiset.add(a[i]);
            v.add(Pair.of(Objects.requireNonNull(multiset.firstEntry()).getElement(),
                    Objects.requireNonNull(multiset.lastEntry()).getElement()));
        }
    }

    public static void main(String[] args) {
        solve();
        v.forEach(System.out::println);
    }
}
