package controller;

import model.MarshmallowMonster;

public class MonsterController
{	
	//data member section
	private MarshmallowMonster myMonster; 
	
	
	//constructor section
	public MonsterController()
	{
		//job1 initialize members
		myMonster = new MarshmallowMonster("will", 2.5, 1, false, 3 );
	}
	
	//methods section
	public void start()
	{
		System.out.println(myMonster);
	}
}
