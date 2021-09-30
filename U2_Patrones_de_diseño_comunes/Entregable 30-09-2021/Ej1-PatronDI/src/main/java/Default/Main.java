package Default;

public class Main {

	public static void main(String[] args) {
		
		Tejado tejado = new TejadoTejas();
		
		Pared p1 = new Pared(5.80);
		Pared p2 = new Pared(5.80);
		Pared p3 = new Pared(5.80);
		Pared p4 = new Pared(5.80);
		
		Casa casa1 = new Casa(120, p1, p2, p3, p4, tejado);
		
		
		Tejado tejado2 = new TejadoTejas();
		
		Pared p5 = new Pared(7.00);
		Pared p6 = new Pared(7.00);
		Pared p7 = new Pared(7.00);
		Pared p8 = new Pared(7.00);
		
		Casa casa2 = new Casa(250, p5, p6, p7, p8, tejado2);
		
		System.out.println(casa1);
		tejado.darSoporte();
		
		System.out.println(casa2);
		tejado2.darSoporte();
	}
	
}
