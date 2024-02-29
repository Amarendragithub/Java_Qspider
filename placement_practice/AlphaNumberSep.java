package placement_practice;

public class AlphaNumberSep {

	public static void main(String[] args) {
		String str="amar123en45dra78";
		splitString(str);
	}
		static void splitString(String str) 
	    { 
	        StringBuffer alpha = new StringBuffer(),  
	        num = new StringBuffer(); 
	          
	        for (int i=0; i<str.length(); i++) 
	        { 
	            if (Character.isDigit(str.charAt(i))) {
	                num.append(str.charAt(i)); 
	            }
	            else {
	            	alpha.append(str.charAt(i));
	            }
	        } 
	       
	        System.out.println(alpha); 
	        System.out.println(num);  
	    } 
		

	}


