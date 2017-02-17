package com.epam.mentoring.tetris.shape;

import java.util.ArrayList;
import java.util.List;

import com.epam.mentoring.tetris.bean.Point;
import com.epam.mentoring.tetris.constant.RotationConstants;

public final class LShape implements Shape {

	@Override
	public List<Point> getCoordinates(Point currentLocation, int rota) {
		List<Point> points = new ArrayList<>();
		switch (rota) {
		case RotationConstants.NORMAL:
			points.add(currentLocation); 
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 1)); 
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 2)); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY() - 2)); 
			break;
		case RotationConstants.DGR_90:
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 1)); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY() - 1)); 
			points.add(new Point(currentLocation.getX() + 2, currentLocation.getY() - 1)); 
			points.add(new Point(currentLocation.getX() + 2, currentLocation.getY())); 
			break;	
		case RotationConstants.DGR_180:
			points.add(currentLocation); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY())); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY() - 1)); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY() - 2));
			break;
		case RotationConstants.DGR_270: 
			points.add(new Point(currentLocation.getX(), currentLocation.getY() - 1)); 
			points.add(currentLocation); 
			points.add(new Point(currentLocation.getX() + 1, currentLocation.getY())); 
			points.add(new Point(currentLocation.getX() + 2, currentLocation.getY())); 
			break;
		}
		return points;
	}
	
}
