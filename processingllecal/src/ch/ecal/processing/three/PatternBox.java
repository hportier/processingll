package ch.ecal.processing.three;

import processing.core.PApplet;
import processing.core.PVector;

public class PatternBox {
	PVector color;
	PApplet p;
	
	public PatternBox(PApplet p) {
		this.p = p;
		color = new PVector(255, 255, 255);
	}
	
	public void draw() {
		p.fill(color.x, color.y, color.z);
		p.box(1);
	}
	
}
