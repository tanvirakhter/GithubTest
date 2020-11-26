
public class Exercise07 {

	public static void main(String[] args) {
		//1)	Display all of the possible pairs of numbers between 1 and 10 
				System.out.println("1.");
				for (int i=1;i<=10;i++)
				{
					for (int j=1;j<=10;j++)
					{
						System.out.print("(");
						System.out.print(i);
						System.out.print(",");
						System.out.print(j);
						System.out.print(")");
					}
				}
				
				
				System.out.println();
				
				//2)	Display all possible pairs for the numbers i and j that are i < j and 0 < i and j < 11 
				System.out.println("2.");
				for (int i=1;i<11;i++)
				{
					for (int j=2;j<11;j++)
					if (i<j)
					{
						System.out.print("(");
						System.out.print(i);
						System.out.print(",");
						System.out.print(j);
						System.out.print(")");
					}
				}
				
				System.out.println();
				
				//3)	Display all possible pairs of the numbers 1,2,3,4 paired with 4,5,6,7,8 
				System.out.println("3.");
				for (int i=1;i<5;i++)
				{
					for (int j=4;j<9;j++)
					{
						System.out.print("(");
						System.out.print(i);
						System.out.print(",");
						System.out.print(j);
						System.out.print(")");
					}
				}			
	}
}
