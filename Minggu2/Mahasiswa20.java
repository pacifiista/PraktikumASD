public class Mahasiswa20 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String KelasBaru) {
        kelas = KelasBaru;
    }

    void updateIPK(double IPKBaru) {
        ipk = IPKBaru;
    }

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.5) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    
}
