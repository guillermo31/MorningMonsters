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
	
	//getters 
	
	public String getName()
	{	
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount() 
	{
		return armCount;
	}
	
	//setters 
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNoses(boolean noses)
	{
		this.hasNoses = noses;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	
	
	public String toString()
	{
		String description = "My monster's name is " + name + " , he has " 
							  + legCount + " legs" 
							  + ", " + eyeCount + " eye" + " and " + armCount + " legs";
		
		return description;
	}
}
