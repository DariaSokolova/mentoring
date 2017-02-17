package com.epam.mentoring.tetris.figure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.epam.mentoring.tetris.bean.Point;
import com.epam.mentoring.tetris.constant.BoardContants;
import com.epam.mentoring.tetris.constant.RotationConstants;

public class FigureTest {
	
	private Figure figure;
	private Point point;
	
	@Before
	public void before() {
		point = new Point(10, 10);
		figure = new Figure(point);
	}
	
	@Test
	public void testGetCoordinates() {
		figure.getCoordinates();
	}
	
	@Test
	public void move_left() {
		int movingDirection = BoardContants.MOVE_LEFT;	
		int x = figure.getLocation().getX();
		
		figure.move(movingDirection);

		assertTrue(x > figure.getLocation().getX());
	}

	@Test
	public void move_right() {
		int movingDirection = BoardContants.MOVE_RIGHT;		
		int x = figure.getLocation().getX();
		
		figure.move(movingDirection);
		
		assertTrue(x < figure.getLocation().getX());
	}

	@Test
	public void move_withoutDirection() {
		int movingDirection = BoardContants.DONT_MOVE;	
		int x = figure.getLocation().getX();
		
		figure.move(movingDirection);
		
		assertEquals(x, figure.getLocation().getX());
	}
	
	@Test
	public void rotate() {		
		figure.rotate();
		assertEquals(RotationConstants.DGR_90, figure.getRota());
		
		figure.rotate();
		assertEquals(RotationConstants.DGR_180, figure.getRota());
		
		figure.rotate();
		assertEquals(RotationConstants.DGR_270, figure.getRota());
		
		figure.rotate();
		assertEquals(RotationConstants.NORMAL, figure.getRota());
	}
	
	public void letDown() {
		int y = figure.getLocation().getY();
		
		figure.letDown();

		assertTrue(y > figure.getLocation().getY());
	}
}
