package _01_Olympic_Rings;

import java.awt.Graphics;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot t1 = new Robot(400, 500);
		Robot t2 = new Robot(800, 500);
		Robot t3 = new Robot(1200, 500);
		Robot b1 = new Robot(600, 700);
		Robot b2 = new Robot(1000, 700);
		b2.setPenWidth(100);
		b2.setRandomPenColor();
		b2.hide();
		Thread m1 = new Thread(() ->t1.move(360));
		Thread m2 = new Thread(() -> t2.move(360));
		Thread m3 = new Thread(() ->t3.move(360));
		Thread m4 = new Thread(() ->b1.move(360));
		Thread m5 = new Thread(() ->{b2.penDown();b2.move(100); b2.penUp(); });
	
		Thread tu1 = new Thread(() -> t1.turn(360));
		Thread tu2 = new Thread(() ->t2.turn(360));
		Thread tu3 = new Thread(() ->t3.turn(360));
		Thread tu4 = new Thread(() ->b1.turn(360));
		Thread tu5 = new Thread(() ->{b2.turn(360);});

		m1.start();
		tu1.start();
		m2.start();
		tu2.start();
		m3.start();
		tu3.start();
		m4.start();
		tu4.start();
		m5.start();
		tu5.start();

	}
}
