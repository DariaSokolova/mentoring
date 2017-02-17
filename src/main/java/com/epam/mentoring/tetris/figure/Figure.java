package com.epam.mentoring.tetris.figure;

import java.util.List;

import com.epam.mentoring.tetris.bean.Point;
import com.epam.mentoring.tetris.constant.FigureConstants;
import com.epam.mentoring.tetris.constant.RotationConstants;
import com.epam.mentoring.tetris.shape.Shape;
import com.epam.mentoring.tetris.shape.util.ShapeGenerator;

public class Figure {

	private Shape shape;
	private Point location;
	private int rota;

	public Figure(Point location) {
		this.location = location;
		rota = RotationConstants.NORMAL;
		shape = ShapeGenerator.getRandomShape();
	}

	public List<Point> getCoordinates() {
		return shape.getCoordinates(location, rota);
	}

	public void move(int movingDirection) {
		location.setX(location.getX() + FigureConstants.X_OFFSET * movingDirection);
	}

	public void rotate() {
		rota = (rota + 1) % RotationConstants.ROTATION_NUMBER;
	}

	public void letDown() {
		location.setY(location.getY() - FigureConstants.Y_OFFSET);
	}

	public Point getLocation() {
		return location;
	}

	public int getRota() {
		return rota;
	}	
}
