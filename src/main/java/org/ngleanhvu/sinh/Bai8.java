package org.ngleanhvu.sinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Bai8 {
    static int n; // Number of bits
    static int k; // Number of 1s required
    static boolean ok = true; // Flag to indicate if more combinations can be generated
    static int[] a; // Array to store the current binary combination
    static List<int[]> v = new ArrayList<>(); // List to store valid combinations

    // Initialize input and the array
    static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n + 1]; // Create array of size n+1 (1-based indexing)
        Arrays.fill(a, 0); // Initialize all elements to 0
    }

    // Generate the next binary combination
    static void sinh() {
        int i = n;
        // Find the rightmost 0 and flip it to 1
        while (i >= 1 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i == 0) {
            ok = false; // No more combinations can be generated
        } else {
            a[i] = 1;
            // Count the number of 1s in the current combination
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (a[j] == 1) count++;
            }
            // If the combination has exactly k 1s, add it to the list
            if (count == k) {
                v.add(Arrays.copyOfRange(a, 1, n + 1)); // Copy valid combination
            }
        }
    }

    // Print the valid combinations stored in the list
    static void output() {
        for (var item : v) {
            System.out.println(Arrays.toString(item));
        }
    }

    // Main method
    public static void main(String[] args) {
        init(); // Initialize the input and setup
        while (ok) {
            sinh(); // Generate the next combination
        }
        output(); // Print all valid combinations
    }
}
