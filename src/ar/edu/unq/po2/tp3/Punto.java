package ar.edu.unq.po2.tp3;

public class Punto {
	private int x;
	private int y;
	
	public Punto() {
		this(0,0);
	}

	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void moverA(Punto p) {
		this.setX(p.getX());
		this.setY(p.getY());
	}
	
	public Punto sumar(Punto p) {
		int newX = this.getX() + p.getX();
		int newY = this.getY() + p.getY();
		Punto r = new Punto(newX, newY);	
		return r;
	}
	
	public Punto sumar2(Punto p) {
		Punto r = new Punto();
		r.setX(this.getX() + p.getX());
		r.setY(this.getY() + p.getY());
		return r;
	}
	
	public Punto sumar3(Punto p) {
		Punto r = new Punto(x+p.getX(), y+p.getY());
		return r;
	}
	
	public Punto sumar4(Punto p) {
		return new Punto(x+p.getX(), y+p.getY());
	}
	
	public Punto sumar5(Punto p) {
		return new Punto(x+p.x, y+p.y);
	}
}