package practice;

public class XylemOrPhloemNo {

	public static void main(String[] args) {
		int n=1234,temp=n;
		int a=0,b=0,c=0,d=0;
		while(n>0)
		{
		 c=n%10;
		 a=a+c;
		 n=n/10;
		 
		 while(n>9) {
			 d=n%10;
			 b=b+d;
			 n=n/10;
		 }
		}
		if(a==b)
		{
			System.out.println(temp+" is Xylem number");
		}else {
			System.out.println(temp+" is phloem number");
		}

	}

}
