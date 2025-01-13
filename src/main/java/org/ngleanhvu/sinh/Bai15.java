package org.ngleanhvu.sinh;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai15 {
    static boolean ok = true;
    static char [] ch;
    static String sinh(String a) {
        StringBuilder s = new StringBuilder(a);
        int i = s.length()-2;
        while(i>=0 && (s.charAt(i) >= s.charAt(i+1))) {
            --i;
        }
        if(i==-1) ok = false;
        else {
            int j = s.length()-1;
            while (s.charAt(i) > s.charAt(j)) --j;
            char tmp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, tmp);
            ch = s.toString().toCharArray();
            Arrays.sort(ch, i+1, s.length());

        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = sinh("279134399742");
        System.out.println(s);
    }
}
