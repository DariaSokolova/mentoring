package com.epam.mentoring.tetris.shape.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.epam.mentoring.tetris.shape.Shape;

public class ShapeGeneratorTest {

	@Test
	public void testGetRandomShape_NotNull() {
		Shape shape = ShapeGenerator.getRandomShape();
		assertNotNull(shape);
	}
	
	@Test
	public void testGetRandomShape_DifferentResults() {
		List<Shape> shapes = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			shapes.add(ShapeGenerator.getRandomShape());
		}
		assertNotEquals(1, shapes.stream().distinct().count());
	}
}
