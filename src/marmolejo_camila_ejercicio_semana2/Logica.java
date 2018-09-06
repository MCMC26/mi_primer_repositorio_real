package marmolejo_camila_ejercicio_semana2;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private ArrayList<Cuadritos> cuadros;
	private int h,s,b,x,y;
	private Cuadritos c;

	public Logica(PApplet app) {
		this.app = app;
		int h=0;
		int s= 80;
		int b= 80;
		int x=0;
		int y=0;
		int tam= 20;
		//this.app.colorMode(app.HSB,360,100,100);

		cuadros= new ArrayList<Cuadritos>();
		for (int i = 0; i < 12; i++) {

			c= new Cuadritos(app,  x,  y,  h,  s,  b);
			cuadros.add(c);
			h += 30;
			x += 40;//??????
			//			System.out.println(h + " " + x);
		}
		app.fill(360);
		for(int i = 0; i < 4; i++ ) {

			cuadros.add(new Cuadritos(app, x, y, 360, 100, 0));
			x+=40;
		}



	}
	public void pintar() {

		app.background(360);
		int titulo = 2;
		for (int i = 0; i < 16; i++) {
			//cuadros.get(i).pintar();


			app.colorMode(app.HSB, 360, 100, 100);
			int color = app.color(cuadros.get(i).getR(), cuadros.get(i).getB(), cuadros.get(i).gets());

			app.fill(color);
			cuadros.get(i).pintar();
			if(i > 11) {
				//app.colorMode(app.HSB, 0, 100, 0);
				app.fill(0);
				app.textAlign(app.CENTER);
				app.textSize(18);
				switch(i) {

				case 12: 					
					app.text("2", 40*(i+1)-8,17);
					break;
				case 13:
					app.text("3", 40*(i+1)-8,17);
					break;
				case 14:
					app.text("4", 40*(i+1)-8,17);
					break;
				case 15:
					app.text("*", 40*(i+1)-8,17);
					break;



				default: 

				}
			}
		}

	}

	public void click() {

		for (int i = 0; i < cuadros.size(); i++) {
			Cuadritos b = cuadros.get(i);

			if(app.mouseX>=0 &&
					app.mouseX<=40 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){
				

			}
			if(app.mouseX>40 &&
					app.mouseX<=80 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>80 &&
					app.mouseX<=120 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>120&&
					app.mouseX<=160 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>160 &&
					app.mouseX<=200 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>200 &&
					app.mouseX<=240 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>240 &&
					app.mouseX<=280 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>320 &&
					app.mouseX<=360 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>360 &&
					app.mouseX<=400 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>400 &&
					app.mouseX<=440 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>440 &&
					app.mouseX<=480 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>480 &&
					app.mouseX<=520 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>520 &&
					app.mouseX<=560 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>560 &&
					app.mouseX<=600 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}
			if(app.mouseX>600 &&
					app.mouseX<=640 &&
					app. mouseY>=0 &&
					app.mouseY<=40
					){

			}



		}

	}
}