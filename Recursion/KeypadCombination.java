
import java.util.*;

public class KeypadCombination {
     static String[] keypad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    static void printKPC(String ques,String ans) {
       if(ques.length()==0){
           System.out.println(ans);
           return;
       }
        char ch=ques.charAt(0);
        String ros=ques.substring(1);
        String keyPadKey=keypad[ch-'0'];
        for(int i=0;i<keyPadKey.length();i++){
            char key=keyPadKey.charAt(i);
            printKPC(ros,ans+key);
        }
        
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str,"");
        sc.close();
    }
}