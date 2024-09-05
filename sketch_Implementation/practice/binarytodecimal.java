package practice;

public class binarytodecimal {
    public static void main(String[] args) {
        String binary="0101";
        int pow=1;
        int decimal =0;
        for(int i=binary.length()-1;i>=0;i--){
           char ch=binary.charAt(i);
            
            if(ch=='1'){
                 decimal +=pow;
            }
            pow *=2;
        }
        System.out.println(decimal);
        
       
    }
}
