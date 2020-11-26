
public class Exercise02 {

	public static void main(String[] args) {
		//1)	4,5,6,7,8,9,10,11
		
				System.out.println("1. ");
				int i;
				String a="";
				for(i=4;i<12;i++)
				{
					System.out.print(a+i);
					a=",";
				}
				System.out.println();
				
				//2)	10, 13, 16, 19
				System.out.println("2. ");
				String b="";
				for(i=10;i<20;i=i+3)
				{
					System.out.print(b+i);
					b=",";
				}
				System.out.println();
				
				//3)	1, 4, 7, 10, 13, 16
				System.out.println("3. ");
				String c="";
				for(i=1;i<17;i=i+3)
				{
					System.out.print(c+i);
					c=",";
				}
				System.out.println();
				
				//4)	2, 4, 6, 8, 10, 12
				System.out.println("4. ");
				String d="";
				for(i=2;i<13;i=i+2)
				{
					System.out.print(d+i);
					d=",";
				}
				System.out.println();
				
				//5)	1, 4, 9, 16, 25, 36, 49, 64, 81, 100
				System.out.println("5. ");
				String e="";
				for( i=1;i<11;i++)
				{
					System.out.print(e+(i*i));
					e=",";
				}
				System.out.println();
				
				//6)	-10, -8, -6, -4, -2, 0, 2, 4,  6, 8, 10
				System.out.println("6. ");
				String f="";
				for(i=-10;i<11;i=i+2)
				{
					System.out.print(f+i);
					f=",";
				}
				System.out.println();
				
				//7)	-20, -15, -10, -5, 5, 10, 15, 20
				System.out.println("7. ");
				String g="";
				for(i=-20;i<21;i++)
				{ 
					if((i%5==0)&&(i!=0))
					{
				
				{
					System.out.print(g+i);
					g=",";
				}
			}

		}
	}	
}
