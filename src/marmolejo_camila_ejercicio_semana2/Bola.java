package marmolejo_camila_ejercicio_semana2;

import processing.core.PApplet;

public abstract class Bola {
	protected PApplet app;

	
protected int x,y;
protected int radio;
protected int color;


public Bola (PApplet app, int x, int y,int h, int s, int b) {
	this.app=app;
	this.x=x;
	this.y=y;
	color = app.color(h,s,b);

}
public abstract void pintar();
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getRadio() {
	return radio;
}
public void setRadio(int radio) {
	this.radio = radio;
}
/*public int geth() {
	return h;
}
public void seth(int h) {
	this.h = h;
}
public int gets() {
	return s;
}
public void sets(int s) {
	this.s = s;
}
public int getb() {
	return b;
}
public void setb(int b) {
	this.b = b;
}*/

}
