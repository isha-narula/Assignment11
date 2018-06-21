import java.util.HashMap;
import java.util.Map;

public class Mapping {

	  public static void main(String args[]) {  
	  HashMap<Double,String> hash_map= new HashMap<Double,String>();  
	  hash_map.put(1.1, "ORANGE");
	  hash_map.put(2.1, "GREEN");
	  hash_map.put(3.1, "YELLOW");
	  hash_map.put(4.1, "PURPLE");
	  for(Map.Entry x:hash_map.entrySet()){  
	   System.out.println(x.getKey()+" "+x.getValue());  
	  }  
	 }  
	
}

