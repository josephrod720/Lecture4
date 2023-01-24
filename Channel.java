/**
 *  Simple class that implements a single cable TV channel
 */

/**
 * @author tcortina
 *
 */
public class Channel implements Comparable<Channel> {
	
	private int number;
	private String name;
	
	/**
	 * Constructs a cable channel with a given number and name. No error
	 * checking is done.
	 * @param channelNumber the number of the channel
	 * @param channelName the name of the channel
	 */
	public Channel(int channelNumber, String channelName) {
		number = channelNumber;
		name = channelName;
	}
	
	/**
	 * Returns the number of this channel.
	 * @return the number of this channel
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Returns the name of this channel.
	 * @return the name of this channel
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the number of this channel to a new number. No error checking is done.
	 * @param newNumber the new number for this channel.
	 */
	public void setNumber(int newNumber) {
		number = newNumber;
	}

	/**
	 * Sets the name of this channel to a new name. 
	 * @param newName the new name for this channel.
	 */
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Returns the String representation of this channel.
	 * @return a string with the number and name of this channel
	 */
	public String toString() {
		return number + "---" + name;
	}

	/**
	 * Returns true if this channel is equal to another channel,
	 * false otherwise. If the supplied object is not a channel,
	 * false is returned.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Channel) {
			Channel otherChannel = (Channel)obj;
			return this.number == otherChannel.number &&
				   this.name == otherChannel.name;				
		}
		return false;
	}

	/**
	 * Compares by channel number
	 * Channel numbers were already sorted lexographically (by name)
	 */
	public int compareTo(Channel otherChannel){
		if(this.number > otherChannel.getNumber())
		{
			return 1;
		}
		else if(this.number < otherChannel.getNumber())
		{
			return -1;
		}
		else{
			return 0;
		}
	}

	/**
	 * Returns a hash code for this channel
	 */
	public int hashCode() {
		return name.hashCode();
	}

}