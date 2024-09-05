

import java.util.ArrayList;

/**
 * permutions
 */
public class permutions {
    static int count;
    public static void main(String[] args) {
       
        String str="12345";
        ArrayList<String> ans=new ArrayList<>();
        permutionsCheck(str,"",ans,str.length());
       
        for(String pe:ans){
            System.out.println(pe);
        }
       
    }

    private static void permutionsCheck(String str, String store,ArrayList<String> ans,int n) {
       if(n==store.length()){
        ans.add(store);
        count++;
        return;
       }
      
       for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);
        String sub=str.substring(0,i)+str.substring(i+1);
        permutionsCheck(sub, store+curr, ans,n);
       }

    }
    
}