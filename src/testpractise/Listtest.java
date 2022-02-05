package testpractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Listtest {

	public static void main(String a[])
	{
		List<Integer> primewithduplicate= new ArrayList<Integer>();
		primewithduplicate.add(1);
		primewithduplicate.add(2);
		primewithduplicate.add(2);
		primewithduplicate.add(3);
		
		Set<Integer> primewithoutduplicate=new LinkedHashSet<Integer>(primewithduplicate);
		System.out.print("duplicate"+primewithduplicate);
		System.out.print("Without duplicate"+primewithoutduplicate);
		Collections.reverse(primewithduplicate);
		System.out.print("Reverse List from git"+primewithduplicate);
		primewithduplicate.remove(0);
		System.out.print("removing"+primewithduplicate);
		
		
		
		
		
		
		
	}
	
}
