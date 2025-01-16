package org.ngleanhvu.mang1chieu.mangcongdon;

import java.util.Scanner;

public class Bai4 {
    static int n,m,x1,y1,x2,y2;
    static int [][] a;
    static int [][] b;
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        a = new int[n+1][m+1];
        b = new int[n+1][m+1];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                b[i][j] = b[i-1][j]+b[i][j-1] + a[i][j] - b[i-1][j-1];
            }
        }
    }
    public static void main(String[] args) {
        init();
        int result =b[x2][y2]-b[x1-1][y2]-b[x2][y1-1]+b[x1-1][y1-1];
        System.out.println(result);
    }
}
