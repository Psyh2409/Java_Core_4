package com.gmail.psyh2409.robots;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();
        
        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();
        System.out.println();
        
        Robot[] robots = new Robot[4];
        robots[0] = robot;
        robots[1] = coffeeRobot;
        robots[2] = robotDancer;
        robots[3] = robotCooker;
        
        for (Robot r : robots) {
            r.work();
        }
/* Output
I am Robot - I just work!
I am CoffeeRobot - I make coffee!
I am RobotDancer - I just dance!
I am RobotCooker - I just cook!

I am Robot - I just work!
I am CoffeeRobot - I make coffee!
I am RobotDancer - I just dance!
I am RobotCooker - I just cook!
 * */
	}

}
