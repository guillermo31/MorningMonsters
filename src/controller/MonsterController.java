package controller;

import java.util.Scanner;

import model.MarshmallowMonster;

public class MonsterController
{	
	//data member section
	//private MarshmallowMonster myMonster; 
	private MarshmallowMonster userMonster;
	
	
	//constructor section
	public MonsterController()
	{
		//job1 initialize members
		//myMonster = new MarshmallowMonster("will", 2.5, 1, false, 3 );
		userMonster = new MarshmallowMonster();
	}
	
	//methods section
	public void start()
	{
		//System.out.println(myMonster);
		//myMonster.setArmCount(999999);
		//System.out.println("my monster has this many arms: " + myMonster.getArmCount());
		
		userInput();
		System.out.println(userMonster);
	}
	
	private void userInput()
	{	
		Scanner monsterScanner;
		
		monsterScanner = new Scanner(System.in);
		
		System.out.println("what is the name of your monster?");
		userMonster.setName(monsterScanner.next());
		
		System.out.println("how many legs does it have?");
		userMonster.setLegCount(monsterScanner.nextDouble());
		
		System.out.println("how many eyes does it have?");
		userMonster.setEyeCount(monsterScanner.nextInt());
		
		System.out.println("does it have any noses?");
		userMonster.setHasNoses(monsterScanner.nextBoolean());
		
		System.out.println("how many arms does it have?");
		userMonster.setArmCount(monsterScanner.nextInt());
		
		monsterScanner.close();
	}
}
