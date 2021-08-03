import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner obj= new Scanner(System.in);
      System.out.println("Enter The product order");
      String ord=obj.nextLine();//string to store product order
      int a[]=new int[4];//to store the number of products purchased
      //calculate the number each product purchased and store it in an array
      for(int i=0;i<ord.length();i++){
          switch(ord.charAt(i)){//to calculate number of products purchased
           case 'A':
              a[0]=a[0]+1;/
              break;
           case 'B':
              a[1]=a[1]+1;
              break;
           case 'C':
              a[2]=a[2]+1;
              break;
           case 'D':
              a[3]=a[3]+1;
              break;
      }
     }
     int total_price=(a[0]/4)*100+(a[0]%4)*35+(a[1]*65)+(a[2]/6)*250+(a[2]%6)*50+a[3]*85;//to calculate total price
     System.out.println(total_price);//print total price
    }
}
