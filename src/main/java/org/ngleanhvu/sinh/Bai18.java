package org.ngleanhvu.sinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai18 {
    static int n;
    static boolean ok = true;
    static char [] ch;
    static List<char[]> list = new ArrayList<>();
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new char[n];
        Arrays.fill(ch,'A');
    }
    static void sinh() {
        int i = n-1;
        while(i>=0 && ch[i] == 'H') {
            ch[i] = 'A';
            --i;
        }
        if(i==-1) ok=false;
        else {
            boolean check = true;
            ch[i] = 'H';
            for (int j=0; j<n-1; j++) {
                if(ch[0]=='A' || ch[n-1]=='H') {
                    check = false;
                    break;
                }
                else {
                    if(ch[j]=='H' && ch[j+1]=='H') {
                        check = false;
                        break;
                    }
                }
            }
            // if(check) list.add(ch); không được dùng kiểu này vì đang thang chiếu tới mảng đó sẽ làm thay đổi mảng
            // phải copy mảng sang 1 mảng khác
            if (check) list.add(Arrays.copyOfRange(ch,0,n));
        }
    }
    public static void main(String[] args) {
        init();
        while(ok) {
            sinh();
        }
        for (var item:list) {
            System.out.println(item);
        }
    }
}
