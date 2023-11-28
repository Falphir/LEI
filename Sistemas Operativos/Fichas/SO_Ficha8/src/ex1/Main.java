package ex1;

public class Main {
    public static void main(String[] args) {

        final BankAccount bank = new BankAccount();

        Thread Alice = new Thread(new JobAliceBruno(bank), "[Alice]");
        Thread Bruno = new Thread(new JobAliceBruno(bank), "[Bruno]");

        Alice.start();
        Bruno.start();

        try {
            Alice.join();
            Bruno.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
