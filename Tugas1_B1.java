import java.util.Scanner;
public class Tugas1_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama Kamu: ");
        String nama = scanner.nextLine();

        // Input NIM
        System.out.print("Masukkan NIM Kamu: ");
        int nim = scanner.nextInt();

        // Output
        System.out.println(""); 
        System.out.println("Nama Kamu: " + nama);
        System.out.println("NIM Kamu: " + nim);
    }
}