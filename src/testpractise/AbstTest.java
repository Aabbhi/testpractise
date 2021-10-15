package testpractise;

import java.util.List;

abstract class abc{
	
	abstract void ab1();
	
}
 class AbstTest1 extends abc {

	
	void ab1() {
		List<String> a;
		
		System.out.print("this is implementation");
		
	}
	
	

}

public class AbstTest extends AbstTest1 {

	public static void main(String args[]){
     abc a1=new AbstTest1();
     a1.ab1();
	}
	

}


