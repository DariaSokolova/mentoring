package com.epam.mentoring.tetris.entity;

import java.util.List;

import com.epam.mentoring.tetris.constant.RotationConstants;
import com.epam.mentoring.tetris.util.ShapeGenerator;

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
		location.setX(location.getX() + movingDirection);
	}

	public void rotate() {
		rota = (rota + 1) % RotationConstants.ROTATION_NUMBER;
	}

	public void letDown() {
		location.setY(location.getY() - 1);
	}
}
