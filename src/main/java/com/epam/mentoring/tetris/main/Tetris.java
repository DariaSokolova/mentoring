package com.epam.mentoring.tetris.main;

import com.epam.mentoring.tetris.board.Board;
import com.epam.mentoring.tetris.board.BoardLogic;
import com.epam.mentoring.tetris.handler.IGraphicHandler;
import com.epam.mentoring.tetris.handler.IInputHandler;

public class Tetris 
{
	private static IGraphicHandler graphicHandler;
	private static IInputHandler inputHandler;
	
	private static Board board;
	private static BoardLogic logic;
	
    public static void main(String[] args)
    {
    	inititialize();
    	board.startGame();
    	while (!board.isBoardFilled()) {
    		handleInput();
    		logic.process(board);
    		graphicHandler.draw(board);
    	}
    }
    
    private static void handleInput() {
    	logic.setMovingDirection(inputHandler.getMovingDirection());
    	logic.setRotationRequried(inputHandler.isRotationReqired());
    	//handle other user inputs e.g. close window
    }
    
    private static void inititialize() {
    	//initialize graphicHandler
    	//initialize inputHandler
    	board = new Board();
    	logic = new BoardLogic();
    }
}
