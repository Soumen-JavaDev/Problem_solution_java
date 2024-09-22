import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter class");
        String clas=sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/soumen","soumen","Soumen@123");
//        PreparedStatement ps= con.prepareStatement("Insert into student values(1,'soumen','X')");

    /*  Parameters Index base add */
        PreparedStatement ps= con.prepareStatement("Insert into student values(?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,clas);
        int i=ps.executeUpdate();
        System.out.println(i);
    }
}