package com.metacube.soap.service;

public class AreaService {
	public String sayHello()
	{
		return "Hello GET-2019";
	}
	
	public float area(int a,int b,int c)
	{
		float side;
		float area_is;
		side=(a+b+c)/2;
		area_is=(float) Math.sqrt(side*(side-a)*(side-b)*(side-c));
		return area_is;
	}
}
