package ar.edu.unq.po2.tp3;



public class Rectangulo {
	private Punto origen;
	private int base;
	private int altura;
	
	public Rectangulo(Punto origen, int base, int altura) {
		origen = new Punto(origen.getX(), origen.getY());
		this.base = base;
		this.altura = altura;
	}
	
	public int area() {
		return base * altura;
	}
	
	public int perimetro() {
		return (altura + base) * 2;
	}
	
	public boolean esHorizontal() {
        return base > altura;
    }

    public boolean esVertical() {
        return altura > base;
    }
	
	
}
