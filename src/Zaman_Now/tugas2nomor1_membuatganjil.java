package Zaman_Now;

import java.util.Scanner;

public class tugas2nomor1_membuatganjil {

        public static void main(String[] args) {
            Scanner bilangan = new Scanner(System.in);
            int ganjil,awal,akhir,jumlah=0;
            System.out.print("Masukkan Nilai Awal : ");
            awal=bilangan.nextInt();
            System.out.print("Masukkan Nilai Akhir : ");
            akhir=bilangan.nextInt();
            System.out.print("Deret Bilangan Ganjilnya = ");
            ganjil=awal;
            while(ganjil<=akhir){
                if(ganjil % 2==1){
                    jumlah=jumlah+ganjil;
                    System.out.print(ganjil + "");
                }
                ganjil ++;
            }
            System.out.println();
            System.out.println("Jumlah Deret Bilangan Ganjil Adalah = "+ jumlah +"");
        }
    }

