package placement_practice;

public class SearchAnElement {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,70};
		int search_ele=40;boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i]) {
				System.out.println("Element found at :"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
		System.out.println("Element not found");
		}
	}

}
