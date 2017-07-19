/**
 * To test PiggyBank and Coin classes
 * @author HS
 */
public class PiggyBankTest {

  public static void main(String[] args) {

    PiggyBank p1 = new PiggyBank();
    Coin c1 = new Coin(1, "penny");
    Coin c2 = new Coin(25, "quarter");
    p1.insert(c1);
    
    p1.insert(c2);
    p1.insert(new Coin(10, "dime"));
    System.out.println("p1 has "+p1.getCoinCount()+" coins with balance of "
      + p1.getBalance());

    p1.disect();
    System.out.println("After disect....");
    System.out.println("p1 has "+p1.getCoinCount()+" coins with balance of "
      + p1.getBalance());
    System.out.println("Well, coins are hardly found after disect...");

  }

}
