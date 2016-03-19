package junit;

public class triangle 
{
private static int equilateral = 1;
private static int isosceles = 2;
private static int scalene = 3;
private static int error = 4;

public int getEquilateral()
{
	return equilateral;
	
}


public int getIsosceles()
{
	return isosceles;
	
}

public int getScalene()
{
	return scalene;
	
}

public int getError()
{
	return error;
	
}

public int type(int a, int b, int c)
{
	if(a<=0||b<=0||c<=0)
	{
		return error;
	}
	else if(a+b<c||a+c<b||b+c<a)
	{
		return error;
	}
	else if(a!=b&&b!=c&&a!=c)
	{
		return scalene;
	}
	else if(a==b&&b==c)
	{
		return equilateral;
	}
	else if(a==b||a==c||b==c)
	{
		return isosceles;
	}
	return 0;
}

}
