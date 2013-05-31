package monopoly;

/**
 * Groups of streets. Each group is represented by a color.
 */
public enum Group {
	SADDLEBROWN(2),
	SKYBLUE(3),
	DARKORCHID(3),
	ORANGE(3),
	RED(3),
	YELLOW(3),
	GREEN(3),
	BLUE(2);
	
	private final int nrInGroup;

        /**
         * Construct a group.
         * @param nrInGroup The number of streets that can belong to this group (according to the monopoly board)
         */
	private Group (int nrInGroup) {
		this.nrInGroup = nrInGroup;
	}

        /**
         * Getter for the nrInGroup property.
         * @return The number of streets that can belong to that group.
         */
	public int getNrInGroup() {
		return nrInGroup;
	}
}
