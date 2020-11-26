
public class Exercise05 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		a=88;
		b=26;
		
		while(b>0)

		{
			c=b;
			b=a%b;
			a=c;
		}
		System.out.println("The HCF is = "+ a);
		}

}

