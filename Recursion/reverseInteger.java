/**
 * reverseInteger
 */
public class reverseInteger {

    public static void main(String[] args) {
        int num=12345;
        int rvs=0;
        while (num!=0) {
            rvs=rvs*10+num%10;
            num=num/10;
            
        }
        System.out.println(rvs);
    }
}