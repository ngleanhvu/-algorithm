package org.ngleanhvu.sinh;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class ViduSinhXauNhiPhan {
    static int sumRight = 0;
    static int sumLeft = 0;
    static int n;
    static int [] arr = new int[100];
    static int [] a = new int[100];
    static boolean ok = true;

    static int result = 100000;

    static void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = "); n = sc.nextInt();
        for(int i=1; i<=n; i++){
            arr[i] = 0;
        }
        for(int i=1; i<=n; i++) {
            System.out.println("Nhap a[i] = ");
            a[i] = sc.nextInt();
        }
    }

    static void sinh() {
        int i=n;
        while(i>=1 && arr[i] == 1){
            arr[i] = 0;
            i--;
        }

        if(i==0) ok=false;
        else arr[i] = 1;
    }

    static void calculate() {
        for(int i=1; i<=n; i++) {
            if(arr[i] == 1) sumRight+=a[i];
            else sumLeft+=a[i];
        }

        result = Math.min(result, Math.abs(sumLeft-sumRight));
        System.out.println(result);
        sumRight = 0;
        sumLeft = 0;
    }

    static void output() {
        for(int i=1; i<=n; i++)
            System.out.print(arr[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        init();
        while(ok) {
            calculate();
            output();
            sinh();
        }
        System.out.println(result);
    }
}
