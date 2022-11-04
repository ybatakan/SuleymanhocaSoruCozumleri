package stringmanupulationsorulari;

public class StringManupulation2 {
    public static void main(String[] args) {

        // bir stringde space haric kac karakter war gosteren kodu yaz

        String str= "ali okula gitti.";

        String str1= str.replace(" ","");
        int sayi=str1.length();
        System.out.println(sayi);

        //butun a lari A yap

        String s= "ankaranin yasina gozlrimin yasina bak";
        String s1= s.replace("a","A");
        System.out.println(s1);


        // butun sayilari * a cevir

        String stdId= "AC459871432";

        String stdId1= stdId.replaceAll("[0-9]","*");
        System.out.println(stdId1);

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

       boolean first=pwd.replace("","").length()>7;
       boolean second=pwd.replaceAll("[0-9a-zA-Z]","").length()>0;
       boolean third=pwd.replaceAll("[^0-9]","").length()>0;
       boolean forth=pwd.replaceAll("[^A-Z]","").length()>0;
       boolean fifth=pwd.replaceAll("[^a-z]","").length()>0;

       if(first && second && third && forth && fifth){
           System.out.println("dogru pwd girdiniz");
       }else{
           System.out.println( "yeni gir");
       }





    }
}
