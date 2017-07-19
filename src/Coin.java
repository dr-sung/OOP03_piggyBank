/**
 * A simple Coin class to represent several types of coins;
 * penny, nickel, dime, quarter, etc
 * @author HS
 */
public class Coin {

  /**
   * Constructs a new coin object.
   * @param value face value of the coin
   * @param name name of the coin
   */
  public Coin(int value, String name) {
    // keyword 'this' holds reference to the object which is
    // calling the current method
    this.value = value;
    this.name = name;
  }

  /**
   * Retrieves face value of the coin.
   * Lines following the first line will show up in <b>detailed</b>
   * description of the method of the API document.
   * @return face value of the coin
   */
  public int getValue() {
    return value;
  }

  /**
   * Retrieves name of the coin.
   * @return name of the coin.
   */
  public String getName() {
    return name;
  }

  private final int value;	// face value
  private final String name;	// coin name

}
