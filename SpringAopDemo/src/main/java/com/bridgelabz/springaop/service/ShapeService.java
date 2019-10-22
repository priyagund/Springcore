package com.bridgelabz.springaop.service;

import com.bridgelabz.springaop.model.Circle;
import com.bridgelabz.springaop.model.Triangel;

public class ShapeService
{
	private Circle circle;
    private Triangel triangel;
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangel getTriangel() {
		return triangel;
	}
	public void setTriangel(Triangel triangel) {
		this.triangel = triangel;
	}
	
}
