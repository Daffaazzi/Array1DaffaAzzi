import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main (String[] args){
        System.out.print("Masukkan jumlah mahasiswa : ");
        try (Scanner sc = new Scanner (System.in)) {
            int jumlahMhs = sc.nextInt();

            int[] nilaiMhs = new int[jumlahMhs];
            double total = 0;
            double rata2;

            int totalLulus = 0, totalTidakLulus = 0;
            int jmlLulus = 0, jmlTidakLulus = 0;

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                nilaiMhs[i] = sc.nextInt();
            }

            for (int i = 0; i < nilaiMhs.length; i++){
                total += nilaiMhs[i];
                if (nilaiMhs[i] >= 70){ // pertanyaan no 1
                    System.out.println("Mahasiswa ke-"+(i+1)+" : "+nilaiMhs[i]+" (Lulus)");
                    totalLulus += nilaiMhs[i];
                    jmlLulus++;
                } else {
                    System.out.println("Mahasiswa ke-"+(i+1)+" : "+nilaiMhs[i]+" (Tidak Lulus)");
                    totalTidakLulus += nilaiMhs[i];
                    jmlTidakLulus++;
                }
            }

            double rataLulus = 0, rataTidakLulus = 0;
            if (jmlLulus > 0) {
                rataLulus = (double) totalLulus / jmlLulus;
            }
            if (jmlTidakLulus > 0) {
                rataTidakLulus = (double) totalTidakLulus / jmlTidakLulus;
            }

            rata2 = (jumlahMhs > 0) ? total / jumlahMhs : 0;

            System.out.println("Rata-rata nilai mahasiswa: " + rata2); // pertanyaan no 2  
            System.out.println("Rata-rata nilai mahasiswa yang lulus: " + rataLulus);
            System.out.println("Rata-rata nilai mahasiswa yang tidak lulus: " + rataTidakLulus);   
        }
    }
}
