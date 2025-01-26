package org.ngleanhvu.mang1chieu.slidingwindow;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Bai6 {
    static String s;
    static String t;
    static HashMap<Character, Integer> sMap = new HashMap<>();
    static HashMap<Character, Integer> tMap = new HashMap<>();
    static String solve() {
        // Input
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine(); t = sc.nextLine();

        // Convert to char array
        char[] s_ch = s.toCharArray();
        char[] t_ch = t.toCharArray();

        int tCount = 0, sCount = 0, start = 0;

        String ans = s;

        for (char tCh : t_ch) {
            if (!tMap.containsKey(tCh)) ++tCount;
            tMap.put(tCh, tMap.getOrDefault(tCh, 0) + 1);
        }

        int left = 0, right = 0, tmp = Integer.MAX_VALUE;

        while (right < s_ch.length) {
            sMap.put(s_ch[right], sMap.getOrDefault(s_ch[right],0)+1);
            if (tMap.containsKey(s_ch[right]) && sMap.get(s_ch[right]) == tMap.get(s_ch[right])) // khong duoc >= vi co the dem thieu
                ++sCount;
            if (tCount == sCount) {
                while (sMap.getOrDefault(s_ch[left],0) - 1 >= tMap.getOrDefault(s_ch[left],0)) {
                    sMap.put(s_ch[left], sMap.get(s_ch[left]) - 1);
                    ++left;
                }
                if (right-left+1 < tmp) {
                    start = left;
                    tmp = right-left+1;
                }
            }
            right++;
        }
        return ans.substring(start, start+tmp);
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }
}
