
public class Exercise03 {

	public static void main(String[] args) {
		//1)	++++++++++
				System.out.print("1.");
				for(int i=0;i<10;i++)
				{
					System.out.print("+");
				}
				
				System.out.println();
				
				//2)	---------
				System.out.print("2.");
				for(int i=0;i<10;i++)
				{
					System.out.print("-");
				}
				
				System.out.println();
				
				//3)	+-+-+-+-+-
				System.out.print("3.");
				for(int i=0;i<5;i++)
				{
					System.out.print("+-");
				}

				System.out.println();
				
				//4)	*+-*+-*+-
				System.out.print("4.");
				for(int i=0;i<3;i++)
				{
					System.out.print("*+-");	
				}

				System.out.println();
				
				//5)	*+-*+-*+-*
				System.out.print("5.");
				for(int i=0;i<3;i++)
				{
					System.out.print("*");
					System.out.print("+");
					System.out.print("-");
				}
				System.out.print("*");

				System.out.println();
				
				//6)	**++**++**++
				System.out.print("6.");
				for(int i=0;i<3;i++)
				{
					System.out.print("**++");
				}

				System.out.println();
				
				//7)	***+++---***+++---  ##
				System.out.print("7.");
				for(int z=1;z<=18;z++)
				{
					if(z==1 || z==2  || z==3 || z==10 || z==11 || z==12)
					{
						System.out.print("*");
					}
					else if(z==4 || z==5  || z==6 || z==13 || z==14 || z==15)
					{
					System.out.print("+");
					}
					else
					{
						System.out.print("-");
						}
					
				}
				
				System.out.println();
				
				//8)	***+++------+++***
				System.out.print("8.");
				for(int i=0;i<2;i++)
				{
					if(i==0)
					{
						System.out.print("***+++---");
					}
					else
					{
					System.out.print("---+++***");
					}		
			}
	  }

}
