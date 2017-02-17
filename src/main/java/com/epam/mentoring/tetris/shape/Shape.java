package com.epam.mentoring.tetris.shape;

import java.util.List;

import com.epam.mentoring.tetris.bean.Point;

public interface Shape {
	
	public List<Point> getCoordinates(Point currentLocation, int rota);
}
