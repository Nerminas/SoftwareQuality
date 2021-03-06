package org.se.lab;

abstract class Entity
{

	private int id;

	int getId()
	{
		return id;
	}

	void setId(int id)
	{
		if(id < 0)
		{
			throw new IllegalArgumentException();
		}
		this.id = id;
	}

	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}

		Entity entity = (Entity) o;

		return id == entity.id;
	}

	@Override
	public int hashCode()
	{
		return id;
	}
}
