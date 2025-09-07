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
		return this.getBase() * this.getAltura();
	}
	
	public int perimetro() {
		return (this.getAltura() + this.getBase()) * 2;
	}
	
	public boolean esHorizontal() {
        return this.getBase() > this.getAltura();
    }

    public boolean esVertical() {
        return this.getAltura() > this.getBase();
    }

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}
    
    
	
	
}
