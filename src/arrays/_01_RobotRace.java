package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean isRacing = true;
	//1. make a main method
public static void main(String[] args) {
	Robot[] robot = new Robot[5];
	for(int i = 0; i <5; i++) {
		robot[i] = new Robot();
		robot[i].setX(100+100*i);
		robot[i].setY(500);
		robot[i].setSpeed(25);
	}
	Random r = new Random();
	while(isRacing == true) {
	for(int i = 0; i <5; i++) {
		int rr = r.nextInt(50);
		robot[i].move(rr);
		if(robot[i].getY() <=25) {
			isRacing =false;
		}
		if(robot[i].getY() <= 25) {
			robot[i].moveTo(300, 300);
			robot[i].penDown();
			isRacing = false;
			robot[i].turn(160);
			robot[i].move(100);
			robot[i].turn(-120);
			robot[i].move(100);
			robot[i].turn(120);
			robot[i].move(100);
			robot[i].turn(-120);
			robot[i].move(100);
		}
		
	}
	}
	
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen,
//side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
