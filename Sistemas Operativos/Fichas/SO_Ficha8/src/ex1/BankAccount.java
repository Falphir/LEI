package ex1;

public class BankAccount {

    int saldo;

    public synchronized void putMoney(int amount, String name) {
        saldo += amount;

        System.out.println("Adicionado: " + amount + " por " + name + " || Saldo Final: " + saldo);
    }

    public synchronized boolean getMoney(int amount, String name) {

        if(saldo >= amount) {
            saldo -= amount;

            System.out.println("Despesa: " + amount + " por " + name + " || Saldo Final " + saldo);

            return true;
        } else {
            System.out.println("Impossivel realizar a operacao, saldo insuficiente. " + "Saldo Atual: " + saldo + " despesa: " + amount);
            return false;
        }
    }

}
