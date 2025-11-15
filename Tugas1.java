import java.util.Scanner;

public class Tugas1 {
    public static void main  (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Banyak Nilai : ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + " : ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlah;
        System.out.println();

        System.out.print("===hasil perhitungan===\n");
        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        sc.close();
    }
    
}

