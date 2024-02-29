package placement_practice;

public class DuplicateArray {

	public static void main(String[] args) {
		String[]ar= {"java","manual","selenium","manual"};
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println("Found duplicate element: "+ar[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
		System.out.println("Duplicate element not found");
		}
	}

}
