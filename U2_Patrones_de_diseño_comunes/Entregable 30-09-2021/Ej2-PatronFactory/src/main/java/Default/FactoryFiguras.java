package Default;

public class FactoryFiguras {
	
	public static Figura getFigura(String figura) {
		
	if(figura.equals("Triangulo") ) {
		
		return new Triangulo ("Rojo");
		
	}else if  (figura.equals("Cuadrado")){
		
		return new Cuadrado ("Azul");
		
	}else if (figura.equals("Rectangulo")){
		
		return new Rectangulo ("Verde");
		
	}else {
		return new Circulo ("Amarillo");
		}
	
	
	}
}
