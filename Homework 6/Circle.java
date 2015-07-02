/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework6;

/**
 *
 * @author Kevin
 */
public class Circle extends Shape {
	private static final double PI = 3.14159;
	private double _radius;
	private String color;
	
	public Circle(String color, double radius){
		super(color);
		_radius = radius;
	}
	
	public double area(){
		return PI * (_radius * _radius);
	}
	
	public String toString(){
				return getColor() + " circle with radius of " + _radius + " and area of " + area();
	}
}
