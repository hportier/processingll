package ch.ecal.processing.hello;

import processing.core.PApplet;

public class UseHelloProcessing extends PApplet {

	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int a;
	
	
	public void setup() {
		size(400, 400);
		y = height/2;
		a = 1;
		
	}
	
	public void draw() {
		background(0);
		x+=a;
		fill(0, 0, 255);
		ellipse(x, y, 30, 30);
		
		if(x >= width || x<= 0){
			a *= -1;
			
		}
	}

}

