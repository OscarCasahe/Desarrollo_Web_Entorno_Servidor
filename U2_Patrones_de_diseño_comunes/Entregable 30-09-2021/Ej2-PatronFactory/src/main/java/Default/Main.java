package Default;

public class Main {

	public static void main(String[] args) {
		Figura figura = FactoryFiguras.getFigura("Circulo");
		Figura figura2 = FactoryFiguras.getFigura("Triangulo");
		Figura figura3 = FactoryFiguras.getFigura("Cuadrado");
		Figura figura4 = FactoryFiguras.getFigura("Rectangulo");
		
		figura.dibujarFigura();
		System.out.println(figura.getColor());
		
		System.out.println();

		figura2.dibujarFigura();
		System.out.println(figura2.getColor());
		
		System.out.println();
		
		figura3.dibujarFigura();
		System.out.println(figura3.getColor());
		
		System.out.println();

		
		figura4.dibujarFigura();
		System.out.println(figura4.getColor());
	}
	
}
