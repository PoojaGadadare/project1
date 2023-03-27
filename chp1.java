import java.util.Scanner;
public class chp1 {
 public static void main(String[] args) {
    System.out.println("Enter your marks");
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter marks of physics");
   int physics=sc.nextInt();
   System.out.println("Enter marks of chemistrey");
   int chemistrey=sc.nextInt();
   System.out.println("Enter marks of maths");
   int maths=sc.nextInt();
float percentage=(physics+chemistrey+maths)/3.0f;
System.out.print("Your percentage is=");
System.out.println(percentage);
 }   
}
