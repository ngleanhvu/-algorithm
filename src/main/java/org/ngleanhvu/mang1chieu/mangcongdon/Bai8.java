package org.ngleanhvu.mang1chieu.mangcongdon;

import java.util.Scanner;

public class Bai8 {
    static int soPhanTu,sotThaoTac,soTruyVan;
    static int [] mangPhanTu;
    static int [] mangThaoTac;
    static int [] mangTruyVan; // mang chua so lan thuc hien so thao tac
    static int [] mangTrai;
    static int [] mangPhai;
    static int [] mangDonVi;
    static int [] mangKetQua;
    static void solve() {
        Scanner sc = new Scanner(System.in);
        soPhanTu = sc.nextInt();
        sotThaoTac = sc.nextInt();
        soTruyVan = sc.nextInt();
        mangPhanTu = new int[soPhanTu+1];
        mangThaoTac = new int[sotThaoTac+1];
        mangTruyVan = new int[sotThaoTac+2];
        mangKetQua = new int[sotThaoTac+5];
        mangTrai = new int[sotThaoTac+1];
        mangPhai = new int[sotThaoTac+2];
        mangDonVi = new int[sotThaoTac+1];
        for (int i=1; i<=soPhanTu; i++) mangPhanTu[i] = sc.nextInt();
        for (int i=1; i<=sotThaoTac; i++) {
            mangTrai[i] = sc.nextInt();
            mangPhai[i] = sc.nextInt();
            mangDonVi[i] = sc.nextInt();
        }
        for(int i=1; i<=soTruyVan; i++){
            int trai,phai; trai=sc.nextInt(); phai=sc.nextInt();
            mangTruyVan[trai]++;
            mangTruyVan[phai+1]--;
        }
        for(int i=1; i<=sotThaoTac; i++) {
            mangTruyVan[i]+=mangTruyVan[i-1]; // bat dau khoi phuc mang tan so
            mangKetQua[mangTrai[i]] += mangTruyVan[i]*mangDonVi[i];
            mangKetQua[mangPhai[i]+1] -= mangTruyVan[i]*mangDonVi[i];
        }
        for (int i=1; i<=soPhanTu; i++) {
            mangKetQua[i]+=mangKetQua[i-1];
            System.out.print(mangPhanTu[i]+mangKetQua[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solve();
    }
}