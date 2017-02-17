package com.epam.mentoring.tetris.shape.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.epam.mentoring.tetris.shape.IShape;
import com.epam.mentoring.tetris.shape.JShape;
import com.epam.mentoring.tetris.shape.LShape;
import com.epam.mentoring.tetris.shape.OShape;
import com.epam.mentoring.tetris.shape.Shape;

public class ShapeGenerator {

	private static List<Shape> shapes;
	private static Random random;

	static {
		random = new Random();

		shapes = new ArrayList<Shape>();
		shapes.add(new JShape());
		shapes.add(new LShape());
		shapes.add(new OShape());
		shapes.add(new IShape());
	}

	public static Shape getRandomShape() {
		int index = random.nextInt(shapes.size());
		return shapes.get(index);
	}
}
