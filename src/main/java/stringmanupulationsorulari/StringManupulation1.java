package stringmanupulationsorulari;

import java.util.Scanner;

public class StringManupulation1 {

    public static void main(String[] args) {

        // Kullanicidan aldigin ismin ilk ve son harflerini ekrana yazdir

        Scanner input= new Scanner(System.in);
//        System.out.println("isim gir");
//        String isim= input.next();
//
//        char ilkHarf= isim.charAt(0);
//        char sonHarf=isim.charAt(isim.length()-1);
//
//        System.out.println(ilkHarf+""+sonHarf);
//
//        String ilk= isim.substring(0,1);
//        String son= isim.substring(isim.length()-1,isim.length()); //silik olan yeri yazmaya gerek yok
//
//        System.out.println(ilk+son);

        // sadece haycan isimlerini yazdir

        String str="ben kedi, esim tavuk, oglum sever inek";

        String kedi= str.substring(4,8);
        String tavuk=str.substring(15,20);
        String inek= str.substring(34);

        System.out.println(kedi+" "+ tavuk+" "+ inek);

        // isim ve soy isim iceren ismin ilk ve son ismin basharflerini yazdir

        System.out.println("isim soy isim gir");
        String tumAd= input.nextLine();

        String birinci =tumAd.substring(0,1);
        String ikinci= tumAd.split(" ")[1].substring(0,1);

        System.out.println(birinci+ikinci);





    }
}
