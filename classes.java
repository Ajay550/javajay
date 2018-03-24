class demo {
	demo(){
		System.out.println("hello ajay");
	}
	{
		System.out.println("added initilize block");
	}	
	void show()
	{
		System.out.println("bye");
	}
	static{
		System.out.println("aj");
	}
	
	

}

class hello{
          static public void main(String[]args)
		  {
		    demo a1= new demo();
			  a1.show();
		  }
}
