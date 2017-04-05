import java.util.Scanner;
public class ExceptionHandling {

	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
		 
         System.out.println("Enter Your Age");

         int age = sc.nextInt();    
	//Taking input from user

         try
         {
             if(age < 0)
             {
                 throw new AgeIsNegativeException("Age can not be negative");    //throws AgeIsNegativeException if age is negative
             }
         }
         catch(AgeIsNegativeException ex)
         {
             System.out.println(ex);    //Output : Age can not be negative
         }
  finally{
	  System.out.println("Age is negative or Positive :"+age+"Years");
  }
	}
	
	}


