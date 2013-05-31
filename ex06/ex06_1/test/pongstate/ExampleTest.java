/**
 * 
 */
package pongstate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pongstate.IState;

/**
 * @author jakobro
 * 
 */
public class ExampleTest {

	/**
	 * Tests a simple step.
	 */
	@Test
	public void simpleStep() {
		IState state = getStub(); // TODO Replace with a construction of your real state.
		state.init(50, 50, 1, 1, 10, 100, 100, 1, 1);
		IState newState = state.moveBall();
		assertEquals(51,newState.getBallX());
		assertEquals(51,newState.getBallY());
	}

	/**
	 * Creates a simple IState stub which doesn't do anything.
	 * @return Empty IState implementation.
	 */
	private IState getStub() {
		return new IState() {
			
			@Override
			public IState moveBall() {
				return this;
			}
			
			@Override
			public int getBallY() {
				return 51;
			}
			
			@Override
			public int getBallX() {
				return 51;
			}


			@Override
			public void init(int ballX, int ballY, int ballDiameter,
					int racketTop, int racketLength, int playgroundWidth,
					int playgroundHeight, int speedX, int speedY) {
				
			}
		};
	}
}
