
public class Exercise06 {

	public static void main(String[] args) {
		//1)	122333444455555
				System.out.print("(1)");
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<i+1;j++)
					{
						System.out.print(i);
					}
				}
				
				System.out.println();
				
				//2)	22333444455555666666
				System.out.print("(2)");
				for(int i=2;i<=6;i++)
				{
					for(int j=1;j<i+1;j++)
					{
						System.out.print(i);
					}
				}
				
				System.out.println();
				
				//3)	133355555
				System.out.print("(3)");
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<i+1;j++)
					{
						if ((i!=2) && (i!=4))
						System.out.print(i);
					}
				}
				
				
				System.out.println();
				
				//4)	1335557777  without condition
				System.out.print("(4a)");
				for(int i=1;i<=7;i=i+2)
				{
					for(int j=1;j<i+2;j=j+2)
					{
						
						System.out.print(i);
					}
				}
				
				System.out.println();
				
				//4)	1335557777 with condition
				System.out.print("(4b)");
				for(int i=1;i<=7;i=i+2)
				{
					for(int j=1;j<i+1;j++)
					{
						if (j%2!=0)
						System.out.print(i);
					}
				}
				
				System.out.println();
				
				//5)	555554444333221
				System.out.print("(5)");
				for(int i=5;i>=1;i--)
				{
					for(int j=1;j<i+1;j++)
					{
						System.out.print(i);
					}
				}
				
				System.out.println();
				
				
				//6)	544333222211111
				System.out.print("(6)");
				for(int i=5;i>=1;i--)
				{
					for(int j=5;j>i-1;j--)
					{
						System.out.print(i);
					}
				}
				
				
				System.out.println();
				
				//7)	+**+++****+++++
				System.out.print("(7)");
				for(int i=1;i<=5;i++)
				{
				    if (i%2==0)
					{
						for(int j=1;j<i+1;j++)
					
					{
						System.out.print("*");
					}
					}
				
					{
					if (i%2!=0)
					{
					    for(int j=1;j<i+1;j++)
					{
						System.out.print("+");
					}}
				}
				}
				
				System.out.println();
				
				//8)	--***++++-----******+++++++
				System.out.print("(8)");
				for(int i=2;i<=7;i++)
				{
				    if ((i==2) || (i==5))
					{
						for(int j=1;j<i+1;j++)
					
					{
						System.out.print("-");
					}
					}
				
					{
					if ((i==3) || (i==6))
					{
					    for(int j=1;j<i+1;j++)
					{
						System.out.print("*");
					}
					}
				    }
					  if ((i==4) || (i==7))
						{
						  for(int j=1;j<i+1;j++)
						{
							System.out.print("+");
						}
						}
		}
				
	}
}

