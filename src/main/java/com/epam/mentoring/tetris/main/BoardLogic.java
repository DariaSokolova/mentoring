package com.epam.mentoring.tetris.main;

import com.epam.mentoring.tetris.constant.BoardContants;

public class BoardLogic {
	private boolean movingRequried;
	private int movingDirection;
	private boolean rotationRequried;

	public void process(Board board) {
		if (movingDirection != BoardContants.DONT_MOVE) {
			board.moveFigure(movingDirection);
			movingDirection = BoardContants.DONT_MOVE;
		}

		if (rotationRequried) {
			board.rotateFigure();
			rotationRequried = false;
		}
		
		board.letFigureDown();
	}

	public boolean isMovingRequried() {
		return movingRequried;
	}

	public void setMovingRequried(boolean movingRequried) {
		this.movingRequried = movingRequried;
	}

	public boolean isRotationReqired() {
		return rotationRequried;
	}

	public void setRotationRequried(boolean rotationRequried) {
		this.rotationRequried = rotationRequried;
	}

	public int isMovingDirection() {
		return movingDirection;
	}

	public void setMovingDirection(int movingDirection) {
		this.movingDirection = movingDirection;
	}
}
