package controller;

/**
 * 
 * @author Peter C. Breen
 *
 */
public abstract class AController implements IController {
	private boolean enabled = true;
	private int assignedPlayer = 0;
			
	/**
	 * Enable this controller.
	 */
	public void enable() {
		this.enabled = true;
	}
	
	/**
	 * Disable this controller.
	 */
	public void disable() {
		this.enabled = false;
	}
	
	/**
	 * 
	 * @return whether or not the controller is enabled.
	 */
	public boolean isEnabled() {
		return this.enabled;
	}
	
	/**
	 * Assign the controller to a player
	 * @param player The player id to which to assign the controller.
	 */
	public void setPlayer(int player) {
		this.assignedPlayer = player;
	}
	
	/**
	 * 
	 * @param player The player to check against.
	 * @return if the device is assigned to the player.
	 */
	public boolean isMyPlayer(int player) {
		return player == assignedPlayer;
	}

}
