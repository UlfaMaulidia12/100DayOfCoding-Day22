package ProgramTipeDataKarakter;

import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.println("=== Program Jenis Kelamin ===");

            char jenisKelamin = getGenderInput("Masukkan Jenis Kelamin Anda (L/P): ");

            if (jenisKelamin == 'L' || jenisKelamin == 'l') {
                System.out.println("Anda adalah seorang Laki-laki.");
            } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
                System.out.println("Anda adalah seorang Perempuan.");
            } else {
                System.out.println("Jenis kelamin tidak valid.");
            }

            ulangi = getYesNoInput("Ingin memasukkan jenis kelamin lagi? (Y/N): ");
        } while (ulangi == 'Y' || ulangi == 'y');

        input.close();
    }

    private static char getGenderInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        char jenisKelamin = input.next().charAt(0);
        return jenisKelamin;
    }

    private static char getYesNoInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        char response = input.next().charAt(0);
        return response;
    }
}
