import java.util.Scanner;

public class ReverseNumber{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

    try{  
      int num = sc.nextInt();
      int rev = 0;
      int temp = 0;

      while(Integer.toString(num).length()>1){
          temp = (num %10); 
          num= num/10; 
          rev = rev*10+temp;
     }
  
    rev = rev*10+num;
    System.out.println("reverse Number : "+ rev );
    }catch(Exception e){
  
      System.out.println("Invalid Number");
  
     
      e.printStackTrace();
    }

    }
}