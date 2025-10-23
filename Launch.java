//package com.tap;
//
//
//class Demo{
//	
//	public Demo() {
//		
//	}
//	
//	static Demo getInstance() {
//		
//		return new Demo();
//		
//	}
//	
//}
//
//public class Launch {
//	
//	public static void main(String[] args) {
//		
//		Demo d1 = new Demo();
//		Demo d2 =new Demo();
//		Demo d3 = new Demo();
//		
//		System.out.println(d1);
//	    System.out.println(d2);
//	    System.out.println(d3);
//		
//	}
//
//}



//package com.tap;
//
//
//class Demo{
//	
//	public Demo() {
//		
//	}
//	
//	static Demo getInstance() {
//		
//		return new Demo();
//		
//	}
//	
//}
//
//public class Launch {
//	
//	public static void main(String[] args) {
//		
//		Demo d1 = new Demo();
//		Demo d2 =new Demo();
//		Demo d3 = new Demo();
//		
//		System.out.println(d1);
//	    System.out.println(d2);
//	    System.out.println(d3);
//		
//	}
//
//}




//package com.tap;
//
//
//class Singleton{
//	
//	private final static Singleton INSTANCE = new Singleton();
//	
//	private Singleton() {
//		
//	}
//	
//	final static Singleton getInstance(){	
//		return INSTANCE;
//	}
//	
//}
//
//class Singleton2{
//	
//	private static Singleton2 INSTANCE;
//	
//	private Singleton2() {
//		
//	}
//	
//	synchronized final static Singleton2 getInstance(){	
//		
//		if(INSTANCE == null) {
//			INSTANCE= new Singleton2();
//		}
//		return INSTANCE;
//	}
//	
//}
//
//public class Launch {
//	
//	public static void main(String[] args) {
//		
//		Singleton2 d1 = Singleton2.getInstance();
//		Singleton2 d2 =Singleton2.getInstance();
//		Singleton2 d3 =Singleton2.getInstance();
//		
//		System.out.println(d1);
//	    System.out.println(d2);
//	    System.out.println(d3);
//		
//	}
//
//}



package com.tap;


class Singleton{
	
	private final static Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	final static Singleton getInstance(){	
		return INSTANCE;
	}
	
}

class Singleton2{

   private static Singleton2 INSTANCE;

   private Singleton2() {
	
   }

   synchronized final static Singleton2 getInstance(){	
	
   if(INSTANCE == null) {
		INSTANCE= new Singleton2();
   }
   return INSTANCE;
}

class Singleton3{
	
	class Inner{
	
	private final static Singleton3 INSTANCE=new Singleton3();
	
	}
	
	private Singleton3() {
		
	}
	
	final static Singleton3 getInstance(){	
		
		return Inner.INSTANCE;
		
	}
	
}

public class Launch {
	
	public static void main(String[] args) {
		
		Singleton3 d1 = Singleton3.getInstance();
		Singleton3 d2 =Singleton3.getInstance();
		Singleton3 d3 =Singleton3.getInstance();
		
		System.out.println(d1);
	    System.out.println(d2);
	    System.out.println(d3);
		
	}

}
