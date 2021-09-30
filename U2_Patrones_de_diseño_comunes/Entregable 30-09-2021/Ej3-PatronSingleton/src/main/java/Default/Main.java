package Default;

public class Main {

	public static void main(String[] args) {
		Presidente presidente = Presidente.getPresidente("Joe", "Bidden", 2021);
		
		System.out.println(presidente);
		
		Presidente presidente2 = Presidente.getPresidente("Pepe", "Casas", 2021);

		System.out.println(presidente);

		
	}
	
}
