package ex1;

public class Run extends Thread{
    public ShareObj share;

    public Run(ShareObj s) {
        this.share = s;
    }

    public synchronized void run() {
        String myName = Thread.currentThread().getName();
        while (true) {
            if (Thread.interrupted()) return;
            System.out.println("[" + myName + "] Number: " + share.getNumber()+ "(" + share.getName()+ ")");
        }
    }

    public void setShare(ShareObj s) {
        this.share = s;
    }
}
