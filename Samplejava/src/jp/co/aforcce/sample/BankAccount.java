package jp.co.aforcce.sample;

public class BankAccount {
    // フィールドはprivateにして、外部から直接アクセスできないようにする
    private String accountHolder;
    private double balance;

    // コンストラクタ
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 口座名義を取得
    public String getAccountHolder() {
        return accountHolder;
    }

    // 残高を取得
    public double getBalance() {
        return balance;
    }

    // お金を預ける（正の値のみ）
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("預け入れ額は正の値でなければなりません。");
        }
    }

    // お金を引き出す（残高を超えないようにする）
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("引き出しできません。金額が不正か、残高不足です。");
        }
    }
}