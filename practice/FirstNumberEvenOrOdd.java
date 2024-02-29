package practice;

public class FirstNumberEvenOrOdd {

	public static void main(String[] args) {
		int a=23;
		while(a>10) {
			a=a/10;
		}
		if(a%2==0)
		{
			System.out.println(a+" is even no");
		}else {
			System.out.println(a+" is odd no");
		}

	}

}
