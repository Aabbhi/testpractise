package testpractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class a{
	
	public void call()
	{
		System.out.print("a call");
	}
}


public class bc extends a {

	
	    public static void main(String args[]){  
	    	
	    	a a1= new a();
	    	a1.call();
	    	HashMap<String,Object> abc1=new HashMap<String,Object>();
			abc1.put("abc", "new");
			HashMap<String,Object> abc2=new HashMap<String,Object>();
			abc2.put("abc", "new2");
			List<Object> an=new ArrayList<Object>();
			an.add(abc1);
			an.add(abc2);
				HashMap<String,Object> abc=new HashMap<String,Object>();
				abc.put("abc", "new");
				abc.put("data", an);
	     System.out.println(abc);  
	     
	     Map<String, Object> map = new HashMap<>();
	  // Convert a map having list of values.
	  String[] value1 = new String[] { "value11", "value12", "value13" };
	  String[] value2 = new String[] { "value21", "value22", "value23" };
	  map.put("key1", value1);
	  map.put("key2", value2);

	  JSONObject json = new JSONObject(map);
	  System.out.println(json);
	    }  
	
}
