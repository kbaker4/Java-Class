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
public class Rectangle extends Shape {
	private double _width, _length;
	
	public Rectangle(String color, double width, double length){
		super(color);
		_width = width;
		_length = length;
	}
	
	public double area(){
		return _width * _length;
	}
	
	public String toString(){
		return getColor() + " rectangle with length of " + _length + " and width of "
						+ _width + " and area of " + area();
	}
}
