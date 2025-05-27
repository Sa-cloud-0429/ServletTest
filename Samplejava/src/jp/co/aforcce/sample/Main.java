package jp.co.aforcce.sample;

public class Main {
    public static void main(String[] args){
                BankAccount account = new BankAccount("山田太郎", 10000.0);

                // 間違った方法（直接アクセス）
                // account.balance = 5000000;
        
                // 残高表示
                System.out.println("残高: " + account.getBalance());
        
                // 預け入れ
                account.deposit(5000.0);
                System.out.println("預け入れ後の残高: " + account.getBalance());
        
                // 不正な預け入れ
                account.deposit(-200.0);
        
                // 引き出し
                account.withdraw(3000.0);
                System.out.println("引き出し後の残高: " + account.getBalance());
        
                // 残高を超える引き出し
                account.withdraw(20000.0);


                // カプセル化-----------------------------------------------------------------------------------------
                Animal generic = new Animal("生き物");
                Dog dog = new Dog("ポチ");
                Cat cat = new Cat("タマ");
        
                generic.speak();  // 生き物 は何かをしゃべっています。
                dog.speak();      // ポチ はワンワン！と吠えます。
                cat.speak();      // タマ はニャー！と鳴きます。

                // 継承----------------------------------------------------------------------------------------------
                Animal[] animals = {
                    new Dog("ポチ"),
                    new Cat("タマ"),
                    new Dog("シロ"),
                    new Cat("ミケ")
                };
        
                for (Animal animal : animals) {
                    animal.speak();  // 実際の中身（Dog/Cat）に応じて適切な speak() が呼ばれる
                }
                // ポリモフィズム-------------------------------------------------------------------------------------
            }
    }

