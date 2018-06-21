import java.util.*;
public class Compare {
	
	  
	  public static void main(String[] args) {
	     
	        HashSet<String>s1 = new HashSet<String>();
	     
	          s1.add("Red");
	          s1.add("Green");
	          s1.add("Yellow");
	          s1.add("3");

	          HashSet<String>s2 = new HashSet<String>();
	          s2.add("Red");
	          s2.add("Pink");
	          s2.add("Yellow");
	          s2.add("4");
	          HashSet<String>result_set = new HashSet<String>();
	         for (String element :s1){
	             System.out.println(s2.contains(element) ? "Yes" : "No");
	          }      
	     }
	}

