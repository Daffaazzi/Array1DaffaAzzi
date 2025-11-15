import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Kasir Sederhana ===");
        System.out.println();

        String[] namaBarang = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate ice"};

         System.out.println("Daftar Menu:");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i]);
        }

         System.out.println();
        System.out.print("Masukkan nama makanan/minuman yang dicari:");
        String dicari = sc.nextLine();   

            boolean ditemukan = false;
            for (int i = 0; i < namaBarang.length; i++) {
                if (namaBarang[i].equalsIgnoreCase(dicari)) {
                    ditemukan = true;
                    break;
                }
            }
    
            System.out.println("=== Hasil Pencarian ===");
            if (ditemukan) {
                System.out.println(dicari + " tersedia di menu.");
            } else {
                System.out.println(dicari + " tidak ditemukan di menu.");
            }
    
            sc.close();
        }
    }

