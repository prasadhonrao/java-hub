public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Question 13!");

        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
        // line 1
        // acct.amount = 0;
        // acct.setAmount(0);
        acct.changeAmount(-acct.amount);

        System.out.println(acct.getAmount());

    }
}

class CheckingAccount {
    public int amount;
    public CheckingAccount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void changeAmount(int x) {
        amount += x;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}