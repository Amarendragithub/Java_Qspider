package programming;

public class ArmstrongNumber20 {

	public static void main(String[] args) {
		int n=153;
		int sum=0,temp=n,count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		n=temp;
		while(n>0)
		{
			int d=n%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*d;
			}
			sum=sum+pow;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is the armstrong number");
		}else {
			System.out.println(temp+" is not armstrong number");
		}

	}

}
