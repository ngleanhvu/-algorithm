package org.ngleanhvu.mang1chieu.trungbinh;

import java.util.Scanner;

public class Bai13 {
    static int [] tien = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
    static int n;
    static int solve() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 0;
        int result = 0;
        while(n!=0) {
            result += n/tien[i];
            n = n%tien[i];
            ++i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
