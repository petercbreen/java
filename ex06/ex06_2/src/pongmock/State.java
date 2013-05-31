/**
 * 
 */
package pongmock;

import pongstate.IState;

/**
 * @author fennell
 * 
 */
public class State implements IState {
	/**
	 * Represents the position and size of the ball
	 * 
	 * @author fennell
	 * 
	 */
	public class Ball {
		private final int x;
		private final int y;
		private final int diameter;

		/**
		 * 
		 * @param x
		 *            the x position (pixels)
		 * @param y
		 *            the y position
		 * @param diameter
		 *            the diameter
		 */
		private Ball(int x, int y, int diameter) {
			super();
			this.x = x;
			this.y = y;
			this.diameter = diameter;
		}

		/**
		 * Move a ball
		 * 
		 * @param xInc
		 *            number of pixels to move in x-direction
		 * @param yInc
		 *            number of pixels to move in y-direction
		 * @return The moved Ball
		 */
		private Ball move(int xInc, int yInc) {
			return new Ball(this.x + xInc, this.y + yInc, this.diameter);
		}

		/**
		 * 
		 * @return x coordinate
		 */
		public int getX() {
			return x;
		}

		/**
		 * @return y coordinate
		 */
		public int getY() {
			return y;
		}

		/**
		 * 
		 * @return the diameter
		 */
		public int getDiameter() {
			return diameter;
		}
	}

	/**
	 * Position and size of a racket.
	 * 
	 * @author fennell
	 * 
	 */
	public class Racket {
		private final int top;
		private final int length;

		/**
		 * @param top
		 *            the top position on the y axis (pixels)
		 * @param length
		 *            the length of the racket (pixels)
		 */
		private Racket(int top, int length) {
			super();
			this.top = top;
			this.length = length;
		}

		/**
		 * @return the top position
		 */
		public int getTop() {
			return top;
		}

		/**
		 * @return the length
		 */
		public int getLength() {
			return length;
		}

		/**
		 * Move a racket on the y-axis
		 * 
		 * @param i
		 *            number of pixels to move it
		 * @return the moved racket
		 */
		private Racket move(int i) {
			return new Racket(this.top + i, this.length);
		}

	}

	private Ball ball = new Ball(0, 0, 20);
	private Racket racket = new Racket(0, 50);

	/**
	 * 
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * 
	 * @return the racket
	 */
	public Racket getRacket() {
		return racket;
	}

	/**
	 * Move the current ball
	 * 
	 * @return the moved Ball
	 */
	public IState moveBall() {
		ball = ball.move(5, 1);
		return this;
	}

	/**
	 * Move the current racket
	 * 
	 * @return the moved racket
	 */
	public Racket moveRacketUp() {
		racket = racket.move(5);
		return racket;
	}

	@Override
	public int getBallX() {
		return ball.getX();
	}

	@Override
	public int getBallY() {
		return ball.getY();
	}

	@Override
	public void init(int ballX, int ballY, int ballDiameter, int racketTop,
			int racketLength, int playgroundWidth, int playgroundHeight,
			int speedX, int speedY) {
		ball = new Ball(ballX, ballY, ballDiameter);
		racket = new Racket(racketTop, racketLength);
	}
}
