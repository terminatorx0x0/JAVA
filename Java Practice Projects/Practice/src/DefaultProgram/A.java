 class Parent{
	 int a=10;
	void parentMethod() {
		System.out.println("Inside Parent Class");    
	}
}
 class Child extends Parent{
	 int b=10;
	 void childMethod() {
		 System.out.println("Inside Child Class");
	 }
	 public static void main(String[] args) {
		Child c=new Child();
		c.childMethod();                                      //child method is invoked
		c.parentMethod();                                     //parent method is invoked
		System.out.println("field of child class-"+c.b);      //child class field
		System.out.println("field of parent class-"+c.a);     //parent class field
	}
 }