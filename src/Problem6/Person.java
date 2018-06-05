package Problem6;

class Person implements Cloneable {
	String name;
	Computer computer;  
	public Person(String name, Computer computer) {
		super();
		this.name = name;
		this.computer = computer;
	}
	
	  public Object clone()
	  {
	        Object obj=null;
	        try
	        {
	            obj=super.clone();
	        }catch(CloneNotSupportedException ex)
	        {
	            System.out.println("Fail on cloning");
	        }
	        return obj;
	    }
	
	
}