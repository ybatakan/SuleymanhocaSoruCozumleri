package loops;

public class forloop1 {
    public static void main(String[] args) {

        String str="java";

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            System.out.print(ch+"*");
        }

        String s="Hellooo Ali";

        for(int i=0; i<s.length(); i++) {

            char c = s.charAt(i);

            if (s.indexOf(c) != s.lastIndexOf(c)) {
                System.out.println(c);

                System.out.println("deneme");
            }
        }
    }
}
