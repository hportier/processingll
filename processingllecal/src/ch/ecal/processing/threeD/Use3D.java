package ch.ecal.processing.threeD;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public class Use3D extends PApplet {
	private static final long serialVersionUID = 1L;
	PatternBox pb;
	ArrayList<PatternBox> patternboxes;

	public void setup() {
		int c = 0;
		patternboxes = new ArrayList<PatternBox>();
		for (int i = 0; i < 10; i++) {
			PatternBox p = new PatternBox(this);
			patternboxes.add(p);

			c += 20;
			p.color = new PVector(c, 100, 20);
		}
		pb = new PatternBox(this);
		size(300, 300, P3D);
		background(200, 200, 30);

	}

	public void draw() {

		lights();
		pushMatrix();
		rotateY(PI / 6);
		translate(width / 2, height / 2);
		scale(100, 100, 100);
		translate(0, 1, 0);
		fill(20, 20, 150);
		noStroke();
		for (int i = 0; i < patternboxes.size(); i++) {
			translate(1, 0, 0);
			patternboxes.get(i).draw();
		}
		pb.draw();

		popMatrix();

	}

}
