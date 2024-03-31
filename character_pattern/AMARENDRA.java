package character_pattern;

public class AMARENDRA {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1&&j>=2&&j<=4||j==1&&i>=2||j==5&&i>=2||i==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				if(j==1||i==2&&j>=4||i==2&&j<=2||j==5||i==3&&j==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				if(i==1&&j>=2&&j<=4||j==1&&i>=2||j==5&&i>=2||i==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				if(j==1||i==1&&j<=4||j==5&&i>=2&&i<=3||i==4&&j<=4||i-j==2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				if(j==1&&i>=2&&i<=6||i==1&&j>=2||i==7&&j>=2||i==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				if(j==1||i==1&&j<=4||i==7&&j<=4||j==5&&i>=2&&i<=6) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print(" ");
			for(int j=1;j<=5;j++) {
				if(j==1||i==1&&j<=4||j==5&&i>=2&&i<=3||i==4&&j<=4||i-j==2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.print(" ");
			
				for(int j=1;j<=5;j++) {
					if(i==1&&j>=2&&j<=4||j==1&&i>=2||j==5&&i>=2||i==4) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					
				}
			
			System.out.println();
			
			
		}


	}

}
