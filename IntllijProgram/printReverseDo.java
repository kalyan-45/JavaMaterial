import java.util.*;
public class Source {

   public static void main(String[] args) {
     int n;
     Scanner input= new Scanner(System.in);
     n=input.nextInt();
     int counter=n;
     do{
         System.out.println(counter);
         counter=counter-1;
     }while (counter>=0);
   }
}
