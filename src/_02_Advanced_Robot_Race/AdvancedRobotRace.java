package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot t1 = new Robot(100, 900);
		Robot t2 = new Robot(500, 900);
		Robot t3 = new Robot(900, 900);
		Robot b1 = new Robot(300, 900);
		Robot b2 = new Robot(700, 900);
		t1.setPenColor(Color.BLUE);
		t3.setPenColor(Color.RED);
		b1.setPenColor(Color.YELLOW);
		b2.setPenColor(Color.GREEN);
		t1.setSpeed(5);
		t2.setSpeed(5);
		t3.setSpeed(5);
		b1.setSpeed(5);
		b2.setSpeed(5);
		Random ram = new Random();
		Thread m1 = new Thread(() -> {while (t1.getY() != 100) {
			t1.setSpeed(ram.nextInt(10));
			t1.move(300);
		}});
		Thread m2 = new Thread(() -> {while (t2.getY() != 100) {
			t2.setSpeed(ram.nextInt(10));
			t2.move(300);
		}});
		Thread m3 = new Thread(() ->{while (t3.getY() != 100) {
			t3.setSpeed(ram.nextInt(10));
			t3.move(300);
		}});
		Thread m4 = new Thread(() ->{while (b1.getY() != 100) {
			b1.setSpeed(ram.nextInt(10));
			b1.move(300);
		}});
		Thread m5 = new Thread(() ->{while (b2.getY() != 100) {
			b2.setSpeed(ram.nextInt(10));
			b2.move(300);
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
