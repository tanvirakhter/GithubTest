import java.util.*;

		public class Exercise08 
		{
			public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);	

				while (true)
				{
					 System.out.println("Type E to end the programm");
					 System.out.print("Enter any character or number: ");
					 char z = sc.next().charAt(0);
					   
					 String D = String.valueOf(z);
					
				    
					 if (z >= 'A' && z <= 'Z')
					 {
						 System.out.println(z + " is a upperCase letter.");  
					 }   
					 else if (z >= 'a' && z <= 'z')
					 {
						 System.out.println(z + " is a lowerCase letter." );  
					 }
					 else if (z >= '0' && z <= '9')  
					 {
						 System.out.println(z + " is a number." );
					 }  
					 else
					 {
						 System.out.println(z + " is a character." ); 
					 }
					 if (new String(D).equals("E"))
					 { 
						 System.out.println("Thanks");
						 break;
					 }
		}
	}

}