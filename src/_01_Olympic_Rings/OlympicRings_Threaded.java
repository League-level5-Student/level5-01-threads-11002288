package _01_Olympic_Rings;

import java.awt.Graphics;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot t1 = new Robot(400, 700);
	Robot t2 = new Robot(800, 700);
	Robot t3 = new Robot(1200, 700);
	Robot b1 = new Robot(600, 700);
	Robot b2 = new Robot(1000, 700);
	t1.setSpeed(10);
	for (int i = 0; i < 120; i++) {
	t1.move(9);
	t1.turn(3);
	t2.move(9);
	t2.turn(3);
	t3.move(9);
	t3.turn(3);
	b1.move(9);
	b1.turn(3);
	b2.move(9);
	b2.turn(3);
	
	}
	
}
}

