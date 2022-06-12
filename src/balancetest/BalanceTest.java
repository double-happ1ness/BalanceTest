package balancetest;

public class BalanceTest {

    static void applyCharge() {
        Integer balance;
        Integer charge = 10;
        do {
            balance = Input.getInteger("Balance: ");
            if (balance > 0) {
                System.out.println("Good for you.");
            } else if (balance < 0) {
                System.out.println("Original balance: " + balance);
                balance = balance - charge;
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Nil balance.");
            }

        } while (Repeat.repeat());
    }

    public static void main(String[] args) {
        applyCharge();
    }

}
