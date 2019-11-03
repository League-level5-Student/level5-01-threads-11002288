package _01_Olympic_Rings;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot t1 = new Robot(10, 320);
		Robot t2 = new Robot(510, 320);
		Robot t3 = new Robot(1010, 320);
		Robot b1 = new Robot(270, 700);
		Robot b2 = new Robot(750, 700);
		t1.setPenColor(Color.BLUE);
		t3.setPenColor(Color.RED);
		b1.setPenColor(Color.YELLOW);
		b2.setPenColor(Color.GREEN);
		t1.setSpeed(10);
		t2.setSpeed(10);
		t3.setSpeed(10);
		b1.setSpeed(10);
		b2.setSpeed(10);
		
		Thread m1 = new Thread(() -> {for (int i = 0; i < 72; i++) {
			t1.penDown();
			t1.move(25);
			t1.turn(5);
		}});
		Thread m2 = new Thread(() -> {for (int i = 0; i < 72; i++) {
			t2.penDown();
			t2.move(25);
			t2.turn(5);
		}});
		Thread m3 = new Thread(() ->{for (int i = 0; i < 72; i++) {
			t3.penDown();
			t3.move(25);
			t3.turn(5);
		}});
		Thread m4 = new Thread(() ->{for (int i = 0; i < 72; i++) {
			b1.penDown();
			b1.move(25);
			b1.turn(5);
		}});
		Thread m5 = new Thread(() ->{for (int i = 0; i < 72; i++) {
			b2.penDown();
			b2.move(25);
			b2.turn(5);
		}});
		
		m1.start();
		//tu1.start();
		m2.start();
		//tu2.start();
		m3.start();
		//tu3.start();
		m4.start();
		//tu4.start();
		m5.start();
		//tu5.start();

	}
}
