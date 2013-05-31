package controller;

/**
 * Interface for a Joystick controller.
 * @author fennell
 *
 */
public interface IJoystick {
	/**
	 * Handler to update a Joystick position
	 * @param excursion the amount of excursion in mm
	 * @param angle the angle of excursion in degrees
	 */
	public void updatePosition(int excursion, int angle);
	
	/**
	 * Handler for a Joystick button-press.
	 * @param b The pressed button.
	 */
	public void updateButtonPress(JSButton b);

}
