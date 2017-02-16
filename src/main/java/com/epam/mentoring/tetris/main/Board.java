package com.epam.mentoring.tetris.main;

import java.util.Random;

import com.epam.mentoring.tetris.constant.BoardContants;
import com.epam.mentoring.tetris.entity.Figure;
import com.epam.mentoring.tetris.entity.Point;

public class Board {

	private boolean[][] area;
	private Figure currentFigure;
	private Random random;

	public Figure getFigure() {
		return currentFigure;
	}

	public boolean[][] getArea() {
		return area;
	}

	public void startGame() {
		createNewFigure();

		// Initialise the field
		// false - empty, true - filled.
		area = new boolean[BoardContants.BOARD_WIDTH][BoardContants.BOARD_HEIGHT];

		random = new Random();
	}

	private void createNewFigure() {
		int x = random.nextInt(BoardContants.BOARD_WIDTH
				- BoardContants.MAX_FIGURE_WIDTH);
		currentFigure = new Figure(new Point(x, BoardContants.BOARD_HEIGHT
				- BoardContants.MAX_FIGURE_HEIGHT));
	}

	public void moveFigure(int movingDirection) {
		// check if we can actually move the figure
		currentFigure.move(movingDirection);
	}

	public void rotateFigure() {
		// check if we can actually rotate the figure
		currentFigure.rotate();
	}

	public void letFigureDown() {

		boolean canFall = true;
		// check if the figure can fall

		if (canFall) {
			currentFigure.letDown();
		} else {

			// Modifying the field data

			boolean shouldDestroyLines = false;

			// figuring out if we should destroy line

			if (shouldDestroyLines) {
				destroyLines();
			}
			createNewFigure();
		}
	}

	private void destroyLines() {
		// destroy filled lines
	}

	public boolean isBoardFilled() {
		int offset = BoardContants.BOARD_HEIGHT - BoardContants.MAX_FIGURE_HEIGHT - 1;
		boolean filled = false;
		int i = 0;
		while (i < BoardContants.BOARD_WIDTH || filled) {
			filled = area[i++][offset];
		}
		return filled;
	}
}
