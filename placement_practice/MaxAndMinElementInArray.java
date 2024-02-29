package placement_practice;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		int[]a= {9,8,3};
		int max=a[0],secondmax=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				if(max>secondmax) {
					secondmax=a[i];
				}
			}
		}
		System.out.println("Maximum element array is: "+secondmax);
		
//		int min=a[0],secondmin=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]<min) {
//				min=a[i];
//				if(secondmin<min) {
//					secondmin=a[i];
//				}
//			}
//		}
//		System.out.println("Secend minimum array is: "+secondmin);

	}

}
