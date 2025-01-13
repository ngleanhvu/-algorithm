package org.ngleanhvu.sinh;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class Bai17 {
    static boolean ok = true;
    static int k;
    static char [] ch = new char[13];
    static long sinh(char [] ch, int k) {
        int n = ch.length;
        int i = n-1;
        while(i>=0 && ch[i] == '9') {
            ch[i] = '0';
            --i;
        }
        if(i==-1) ok = false;
        ch[i] = '9';
        long result = 0;
        for (var item:ch) {
            result = result*10 + (item-'0');
        }
        if (result % k == 0) return result;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        Arrays.fill(ch, '0');
        long result = 0;
        while(ok) {
            result = sinh(ch, k);
            if (result != 0) break;
        }
        System.out.println(result);
    }
}
