package loops;

public class forloop2 {
    public static void main(String[] args) {


        String s = "yusufnasildir?";

                for( int i=0; i<s.length(); i++){
                    char ch=s.charAt(i);

                    if(s.lastIndexOf(ch)!=s.indexOf(ch)){
                        System.out.print(ch);
                    }
                }

    }
}