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
public class Square extends Shape {
	private double _length;
	
	public Square(String color, double length){
		super(color);
		_length = length;
	}
	
	public double area(){
		return _length * _length;
	}
	
	public String toString(){
		return getColor() + " square with length of " + _length + " and area of " + area();
	}
}
