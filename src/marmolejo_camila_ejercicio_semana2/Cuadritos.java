package marmolejo_camila_ejercicio_semana2;

import processing.core.PApplet;

public class Cuadritos {

		protected PApplet app;
		
		
	protected int x,y;
	protected int h, s, b;
	protected int tam=40;


	public Cuadritos (PApplet app,int x, int y,int h,int s,int b) {
		this.app=app;
		this.x=x;
		this.y=y;
		this.h=h;
		this.s=s;
		this.b=b;
		
	}
	
	public void pintar() {
		app.rect(x,y,tam,tam);

		}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return h;
	}
	public void setR(int h) {
		this.h = h;
	}
	public int gets() {
		return s;
	}
	public void setG(int s) {
		this.s = s;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
