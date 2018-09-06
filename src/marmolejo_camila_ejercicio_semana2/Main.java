package marmolejo_camila_ejercicio_semana2;

import processing.core.PApplet;

public class Main extends PApplet {

	public Logica log;

	public static void main(String[] args) {
		
		

		PApplet.main("marmolejo_camila_ejercicio_semana2.Main");

	}
	@Override
	public void settings() {

		size(640, 500);

	}
	@Override
	public void setup() {
	
	}
	@Override
	public void draw() {
		log = new Logica(this);
		background(255);
		log.pintar();
		}
}