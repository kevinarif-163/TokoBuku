package Array;

import java.util.Scanner;

public class TokoBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Jenis Buku : ");
        int Jumlah = input.nextInt();
        String[] buku = new String[Jumlah];
        int jumlah [] = new int [Jumlah];

        for (int i = 0; i < buku.length; i++) {
            System.out.println("jenis buku " + (i+1) + " :");
            buku[i] = input.next();
            System.out.println("Jumlah "+buku[i]+" :");
            jumlah[i]=input.nextInt();
        }
        System.out.println("===DAfTAR BUKU===");
        for (int i = 0; i < buku.length; i++) {
            System.out.println(buku[i]+" : " + jumlah[i]);
        }
        

    }
        

}
