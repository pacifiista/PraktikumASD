
import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        // deklarasi array of objek Mahasiswa20
        Mahasiswa20[] arrayOfMahasiswa = new Mahasiswa20[3];
        String dummy; // variabel dummy untuk menampung inputan enter

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa20();

            System.out.println("Masukkan data Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM"  + ": ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama"  + ": ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas"  + ": ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK"  + ": ");
            dummy = sc.nextLine(); // membersihkan newline character
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy); // konversi string ke float
            System.out.println("------------------------------");

            
        }

    }
}
