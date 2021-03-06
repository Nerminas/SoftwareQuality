package org.se.lab;

public class Cd extends Article
{

	public Cd(int id, String description, double price)
	{
		super(id, description, price);
	}

	@Override
	public String toString()
	{
		return getClass().getSimpleName().toUpperCase() + ":\t" + super.toString();
	}

	@Override
	public String toXml()
	{
		return "\t<" + getClass().getSimpleName().toLowerCase() + super.toXml();
	}


}
