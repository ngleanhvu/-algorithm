package org.ngleanhvu.sinh;

import java.util.Scanner;

public class Bai2 {
    static int[] sinh(int[] a, int n, int k) {
        int i = k - 1; // Bắt đầu từ phần tử cuối của tổ hợp
        while (i >= 0 && a[i] == n - k + i + 1) --i; // Tìm vị trí cần tăng
        if (i < 0) { // Nếu không còn tổ hợp nào lớn hơn
            for (i = 0; i < k; i++) a[i] = i + 1; // Reset lại tổ hợp đầu tiên
        } else {
            a[i]++; // Tăng giá trị tại vị trí tìm được
            for (int j = i + 1; j < k; j++) { // Cập nhật các phần tử phía sau
                a[j] = a[j - 1] + 1;
            }
        }
        return a;
    }

    static int[] init(int n, int k) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[k]; // Khởi tạo mảng kích thước k
        System.out.println("Nhập " + k + " phần tử tổ hợp ban đầu:");
        for (int i = 0; i < k; i++) a[i] = sc.nextInt(); // Nhập giá trị
        sc.close();
        return a;
    }

    static void output(int[] a) {
        for (int value : a) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n và k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = init(n, k);
        System.out.println("Tổ hợp tiếp theo:");
        a = sinh(a, n, k);
        output(a);

        sc.close();
    }
}
