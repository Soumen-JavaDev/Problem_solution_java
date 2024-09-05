package practice;

public class decimaltobinary {
    public static void main(String[] args) {
        int num=10;
        int binary=0;
        int mul=1;
        while(num>0){
            int rmd=num%2;
            rmd =rmd*mul;
            binary +=rmd;
            mul *=10;
            num /=2;
        }
        System.out.println(binary);
    }
}
