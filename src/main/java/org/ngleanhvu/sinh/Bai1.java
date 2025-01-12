package org.ngleanhvu.sinh;

import java.util.Scanner;

public class Bai1  {
    static String s;
    static String sinh(String a) {
        StringBuilder sb = new StringBuilder(a);
        int i = a.length()-1;
        while(i>=0 && sb.charAt(i) == '1') {
            sb.setCharAt(i, '0');
            --i;
        }
        if (i >= 0) sb.setCharAt(i, '1');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s = "); s = sc.nextLine();
        s = sinh(s);
        System.out.println(s);
    }
}
