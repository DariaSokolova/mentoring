package com.epam.mentoring.tetris.entity;

import java.util.ArrayList;
import java.util.List;

import com.epam.mentoring.tetris.constant.RotationConstants;

public class IShape implements Shape {

	@Override
	public List<Point> getCoordinates(Point currentLocation, int rota) {
		List<Point> points = new ArrayList<>();
		switch (rota) {
		case RotationConstants.NORMAL:
		case RotationConstants.DGR_180:
			points.add(currentLocation); 
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 1)); 
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 2)); 
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 3)); 
			break;
		case RotationConstants.DGR_90:
		case RotationConstants.DGR_270: 
			points.add(currentLocation); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY())); 
			points.add(new Point(currentLocation.getX() + 2, currentLocation.getY()));
			points.add(new Point(currentLocation.getX() + 3, currentLocation.getY())); 
			break;	
		}
		return points;
	}

}
