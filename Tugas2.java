import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("=== Program Kasir Sederhana ===");
        System.out.println();

        System.out.print("Jumlah Pesanan: ");
        int jumlahPesanan = sc.nextInt();

        String[] namaBarang = new String[jumlahPesanan];
        int[] hargaBarang = new int[jumlahPesanan];     

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Nama Pesanan ke-" + (i + 1) + ": ");
            namaBarang[i] = sc.next();

            System.out.print("Nama makanan/minuman : ");
            namaBarang[i] = sc.nextLine();

            System.out.print("Harga Pesanan : ");
            hargaBarang[i] = sc.nextInt();
            sc.nextLine();

        }

        int totalHarga = 0;
        for(int i = 0; i < jumlahPesanan; i++) {
            totalHarga += hargaBarang[i];
        }

        System.out.println("\n=== Struk Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ": " + namaBarang[i] + " - Rp " + hargaBarang[i]);
        }
        System.out.println("Total Harga: Rp " + totalHarga);

        }
    }
}
