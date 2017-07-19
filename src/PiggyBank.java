/**
 * PiggyBank class models a piggy bank.
 * It does not store actual coins, but it keeps track of balance and
 * the number of coins in the piggy bank.
 * @author HS
 */
public class PiggyBank {
/**
   * Constructs a new piggy bank object.
   */
  public PiggyBank() {
    coinCount = 0;
    balance = 0;
  }

  /**
   * Inserts a coin into the piggybank. Coin count and balance
   * are updated accordingly.
   * @param coin a coin object to insert
   */
  public void insert(Coin coin) {
    ++coinCount;
    balance += coin.getValue();
  }

  /**
   * Checks the number of coins in the piggy bank.
   * @return number of coins
   */
  public int getCoinCount() {
    return coinCount;
  }

  /**
   * Checks balance in the piggy bank.
   * @return balance
   */
  public int getBalance() {
    return balance;
  }

  /**
   * Due to financial crisis, the piggy bank has to be sacrificed ;)
   */
  public void disect() {
    coinCount = 0;
    balance = 0;
  }

  private int coinCount; // number of coins in the piggy bank.
  private int balance;   // how much in the piggy bank.


}
