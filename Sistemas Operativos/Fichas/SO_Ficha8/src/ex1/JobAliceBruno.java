package ex1;

import java.util.Random;

public class JobAliceBruno implements Runnable{

    protected BankAccount bank = null;

    public JobAliceBruno(BankAccount bank) {
        this.bank = bank;
    }
    public void run() {
        Random random = new Random();

        for(int i = 0; i < 6; i++) {
            bank.putMoney(1250, Thread.currentThread().getName());
            for (int j = 0; j < 10; j++) {
                int expense = random.nextInt(201) + 150; // Valor aleatório entre 150 e 350 euros
                bank.getMoney(expense, Thread.currentThread().getName());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
