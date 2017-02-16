package com.epam.mentoring.tetris.entity;

import java.util.List;

public interface Shape {
	
	public abstract List<Point> getCoordinates(Point currentLocation, int rota);
}
