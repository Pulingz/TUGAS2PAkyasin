package Zaman_Now;
import java.util.Scanner;

public class tugas2nomor1_membuat_genap {

        public static void main(String[] args) {
        Scanner  bilangan = new Scanner(System.in);
        int genap,awal,akhir,jumlah=0;
        System.out.print("Masukkan Nilai Awal : ");
        awal=bilangan.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        akhir=bilangan.nextInt();
        System.out.print("Deret Bilangan Genapnya = ");
        genap=awal;
        while(genap<=akhir){
            if(genap % 2==0){
                jumlah=jumlah+genap;
                System.out.print(genap + "");
            }
            genap ++;
        }
        System.out.println();
        System.out.println("Jumlah Deret Bilangan Genap Adalah = "+ jumlah +"");
            }
        }
