package model;

public class MarshmallowMonster
{	
	//data member section 
	//always private
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	
	
	public MarshmallowMonster()
	{
		//default values are 0 or null or false 
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		
	}
	
	
	public String toString()
	{
		String description = "My monster's name is " + name + " , he has " 
							  + legCount + " legs" 
							  + ", " + eyeCount + " eye" + " and " + armCount + " legs";
		
		return description;
	}
}
