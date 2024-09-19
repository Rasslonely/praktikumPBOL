import java.util.*;

public class Tugas2_B1 {
    private Map<String, String> dataMahasiswa = new HashMap<>();

    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        boolean found = false;
        for (String key : dataMahasiswa.keySet()) {
            if (key.equals(nim)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("NIM sudah terdaftar!");
        } else {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            dataMahasiswa.put(nim, nama);
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        }
    }

    public void read() {
        if (dataMahasiswa.isEmpty()) {
            System.out.println("Data mahasiswa kosong.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Map.Entry<String, String> entry : dataMahasiswa.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM yang ingin anda ubah: ");
        String nim = scanner.nextLine();
        boolean found = false;
        for (String key : dataMahasiswa.keySet()) {
            if (key.equals(nim)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            dataMahasiswa.put(nim, namaBaru);
            System.out.println("Data mahasiswa berhasil diubah.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM yang ingin dihapus: ");
        String nim = scanner.nextLine();
        boolean found = false;
        for (String key : dataMahasiswa.keySet()) {
            if (key.equals(nim)) {
                found = true;
                break;
            }
        }

        if (found) {
            dataMahasiswa.remove(nim);
            System.out.println("Data mahasiswa berhasil dihapus.");
        } else {
            System.out.println("NIM tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Tugas2_B1 mahasiswa = new Tugas2_B1();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Ubah Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    mahasiswa.create();
                    break;
                case 2:
                    mahasiswa.read();
                    break;
                case 3:
                    mahasiswa.update();
                    break;
                case 4:
                    mahasiswa.delete();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }
}