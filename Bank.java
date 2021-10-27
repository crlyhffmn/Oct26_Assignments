package Oct26_Assignments;

public abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    int balance;
    public BankA(int initialDeposit) {
        balance = initialDeposit;
    }
    public int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    int balance;
    public BankB(int initialDeposit) {
        balance = initialDeposit;
    }
    public int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    int balance;
    public BankC(int initialDeposit) {
        balance = initialDeposit;
    }
    public int getBalance() {
        return balance;
    }
}

class bankDemo {
    public static void main(String[] args) {
        Bank A = new BankA(100);
        Bank B = new BankB(150);
        Bank C = new BankC(200);
        System.out.println("Bank A balance: " + A.getBalance());
        System.out.println("Bank B balance: " + B.getBalance());
        System.out.println("Bank C balance: " + A.getBalance());
    }
}