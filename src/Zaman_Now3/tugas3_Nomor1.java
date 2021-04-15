package Zaman_Now3;
import java.util.Scanner;

public class tugas3_Nomor1 {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        int angka[] = new int[4];
        for (int i = 0; i<angka.length; i++){
            System.out.println("Angka ke " + (i) + " : ");
        angka[i] = input.nextInt();
        }

        // Menampilkan data dalam array
        System.out.println("Angka yang dimasukan");
        for (int i = 0; i < angka.length; i++) {
        System.out.println(angka[i]);

        }

        }

}

