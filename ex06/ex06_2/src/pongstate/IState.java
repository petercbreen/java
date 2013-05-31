/**
 * 
 */
package pongstate;

/**
 * @author jakobro
 * 
 * TODO This interface is definitely too small, you have to extend it!
 */
public interface IState {

	/**
	 * Creates a new abstract state. The position of the paddle is in the middle
	 * of the area. Initial ball position is the center of the area. Initial
	 * speed is 1,1.
	 * 
	 * TODO This is definitely not enough, you have to extend it!
	 * 
	 * @param ballX
	 *            Initial position.
	 * @param ballY
	 *            Initial position.
	 * @param playgroundWidth
	 *            The width of the playground.
	 * @param playgroundHeight
	 *            The height of the playground.
	 * @param racketTop
	 *            Initial position.
	 * @param racketLength
	 *            The height of the racket.
	 * @param ballDiameter
	 *            Diameter of the ball.
	 * @param speedX
	 *            Initial speed.
	 * @param speedY
	 *            Initial speed.
	 */
	public void init(int ballX, int ballY, int ballDiameter, int racketTop,
			int racketLength, int playgroundWidth, int playgroundHeight,
			int speedX, int speedY);

	/**
	 * 
	 * @return Returns the current x coordinate of the ball.
	 */
	public int getBallX();

	/**
	 * 
	 * @return Returns the current y coordinate of the ball.
	 */
	public int getBallY();

	/**
	 * Moves the ball according to the current speed.
	 * 
	 * @return Returns the new state, as this might result in a Game Over.
	 */
	public IState moveBall();
}
