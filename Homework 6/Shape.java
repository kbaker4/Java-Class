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
public class Shape {
	private String _color;
	
	public Shape(String color){
		_color = color;
	}
	
	public String getColor(){
		return _color;
	}
	
	public double area(){
		return 0.0;
	}
	
	public String toString(){
		return "generic shape";
	}
}
