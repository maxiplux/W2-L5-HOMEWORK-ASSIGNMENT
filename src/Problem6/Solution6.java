package Problem6;

public class Solution6 {
	public static void main(String[] args) {
		
		Computer computer = new Computer("Asus", "x3120", 1024, 3200);		
		Person federico = new Person("Federico", computer);
		
		Person leonardo= federico;
		
		Person francisco=  (Person)federico.clone();
		
		System.out.println(leonardo.hashCode());
		System.out.println(federico.hashCode());
		System.out.println(francisco.hashCode());
	}

}
