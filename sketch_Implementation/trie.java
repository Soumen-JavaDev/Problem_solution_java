


public class trie {
    static class Node{
        Node[] child;
        boolean eow;
        public Node(){
          child=new Node[26];
         eow=false;
         for(int i=0;i<26;i++){
             child[i]=null;
         }
        }  
     }
     static Node root= new Node();
     public static void insert(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
         int index=str.charAt(i)-'a';
         if(curr.child[index]==null){
            curr.child[index]=new Node();
         }
         if(i==str.length()-1){
            curr.child[index].eow=true;
         }
         curr=curr.child[index];
        }
     }
     public static boolean search(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(curr.child[index]==null){
                return false;
            }
            if(i==str.length()-1 && curr.child[index].eow==false){
                return false;
            }
            curr=curr.child[index];
        }
        return true;
     }
     public static boolean wordBreak(String key){
        if(key.length()==0)
            return true;
        
        for(int i=1;i<=key.length();i++){
            String first=key.substring(0, i);
            String secund=key.substring(i);
            if(search(first) && wordBreak(secund)){
                return true;
            }
        }
        return false;
     }
     public static boolean startWith(String prefix){
        Node curr=root;
        for(int i=0 ;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.child[idx]==null){
                return false;
            }
            curr=curr.child[idx];
        }
        return true;
     }
     public static int countTheSubString(Node root){
        if(root == null)
            return 0;
       int  count =0;
        for(int i=0;i<26;i++){
            if(root.child[i] !=null){
                count+=countTheSubString(root.child[i]);
            }
        }
        return count+1;
     }
    public static void main(String[] args) {
        String str="soumen";
        for(int i=0;i<str.length();i++){
            String prfix=str.substring(i);
            insert(prfix);
        }
        System.out.println(countTheSubString(root));
        // String[] str={"soumen","souman","ajoy","rakesh"};
        // for(int i=0;i<str.length;i++){
        //     insert(str[i]);
        // }
        // String key="soumenajoyrak";
        // System.out.println(wordBreak(key));
        // System.out.print(startWith("sou"));
        // System.out.println(search("soumen"));
        // System.out.println(search("ajo"));
        // System.out.println(search("rakesh"));
        
        // System.out.println(search("souman"));
    }
}
