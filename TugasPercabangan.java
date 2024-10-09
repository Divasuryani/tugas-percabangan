import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
        int lamaKerja, jumlahJamKerja;
        double totalGaji;
        

        Scanner scanner = new Scanner(System.in);
        lamaKerja       = scanner.nextInt();
        jumlahJamKerja  = scanner.nextInt();

        /
           import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        // Deklarasi variabel
        final int GAJI_POKOK = 5000000;
        final int UANG_LEMBUR_PER_JAM = 50000;
        int masaKerja, jamKerja, jamLembur;
        double tambahan, totalGaji;

        // Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();
        System.out.print("Masukkan jumlah jam kerja dalam 1 bulan: ");
        jamKerja = scanner.nextInt();

        // Hitung jam lembur
        if (jamKerja > 240) { // 240 jam = 8 jam/hari * 30 hari
            jamLembur = jamKerja - 240;
        } else {
            jamLembur = 0;
        }
        if (masaKerja < 5) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = GAJI_POKOK * 0.05; // Tambahan 5%
        } else {
            tambahan = GAJI_POKOK * 0.10; // Tambahan 10%
        }

        // Hitung total gaji
        totalGaji = GAJI_POKOK + tambahan + (jamLembur * UANG_LEMBUR_PER_JAM);

        // Tampilkan hasil
        System.out.println("Total gaji yang diterima adalah: Rp " + totalGaji);

        // Tutup scanner
        scanner.close();
    }
} Tuliskan proses perhitungan gaji d

Program Menghitung Total Gaji
    
    //Deklarasi
// Var gajipokok = 50000000;
//    uanglembur = 50000
//    masakerja;
//    jamkerja;
//    jumlahjamkerja;
//    jumlahjamlembur;
//    : integer;
//    totalgaji;
//    bonus;
//    double;

//algoritma
//input (masakerja);
//input (jumlahjamkerja);

//if (masa kerja < 5 tahun) then;
//output tidak diberikan tambahan;
//else if (masa kerja antara 5-10 tahun) then;
//output diberikan tambahan sebanyak  5% dari gaji pokok;
//output tambahan = 0,05 * uang lembur;
//else (masa kerja > 10 tahun)then;
//output diberikan tambahan 10% dari gaji pokok;
//output tambahan = 0,01 *  uang lembur;
//end if;
//end;i sini
        
        System.out.println(totalGaji);
    }
}
