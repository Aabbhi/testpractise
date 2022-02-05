package testpractise;

class Bank{  
float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank{  
float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends Bank{  
float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends Bank{  
float getRateOfInterest(){return 9.7f;}  
}  
class TestPolymorphism{  
public static void main(String args[]){  
Bank b;  
b=new SBI();  
System.out.println("SBI Rate of Intereshgfhgffft: "+b.getRateOfInterest());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  

System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}  
