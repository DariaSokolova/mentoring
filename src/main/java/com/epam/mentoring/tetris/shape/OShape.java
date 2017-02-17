package com.epam.mentoring.tetris.shape;

import java.util.ArrayList;
import java.util.List;

import com.epam.mentoring.tetris.bean.Point;

public class OShape implements Shape {

	@Override
	public List<Point> getCoordinates(Point currentLocation, int rota) {
		List<Point> points = new ArrayList<>();
		points.add(currentLocation); 
		points.add(new Point(currentLocation.getX(), currentLocation.getY() - 1)); 
		points.add(new Point(currentLocation.getX() + 1, currentLocation.getY() - 1)); 
		points.add(new Point(currentLocation.getX() + 1, currentLocation.getY())); 
		return points;
	}

}
