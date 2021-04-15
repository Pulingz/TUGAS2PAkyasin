package Zaman_Now3;
import java.util.Scanner;

public class Tugas3_Nomor3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //variabel bilangan
            int[] bilangan = {11,23,17,20,9,16,42,13,37,10};
            System.out.print("Bilangan :");

            for(int i=0; i<bilangan.length; i++){
                //jika data array bilangan habis dibagi 2 = 0
                if(bilangan[i]% 2 == 0){
                    bilangan[i]=0;

                }
                System.out.print(bilangan[i] + " " );
            }
        }
    }

