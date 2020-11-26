import java.text.DecimalFormat;

public class Exercise01 {

	public static void main(String args[])
		{
		
		double x = 123.456;
        double y = 17.0/3.0;
        double z = Math.sqrt(2); // z = √2
        String a = "Hello";
        String b = "World";

        String s=Double. toString(x);
        String q=Double. toString(y);
        String w=Double. toString(z);
        String number = String.format("%.3f",y);
        
        System.out.println("y to three decimal places = " + number);

        int r=s.indexOf('.');
        int p=q.indexOf('.');
        int l=w.indexOf('.');

        System.out.println("x has "+r+" numbers before decimal.");

        System.out.println("y has "+p+ " numbers after decimal.");

        System.out.println("z has "+l+" numbers after decimal.");
        
        int m=s.length()-1-r;
        System.out.println("x has "+m+" numbers after decimal.");
        
        int n=q.length()-1-p;
        System.out.println("y has "+n+" numbers after decimal.");

        int o=w.length()-1-l;
        System.out.println("z has "+o+" numbers after decimal.");

        
        String c=a+" "+b;
        String f="";
        
        for(int i=c.length()-1;i>=0;i--)

        {
        	char k=c.charAt(i);
        	String g=f+k;
        	System.out.print (g);
        }
        	System.out.println();
        	String h= a.replace("ll", "ppp");
        	System.out.println(h);

        }

}

 

