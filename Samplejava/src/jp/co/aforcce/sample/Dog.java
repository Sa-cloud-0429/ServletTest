package jp.co.aforcce.sample;

public class Dog extends Animal {
    public Dog(String name) {
        // 親クラスのコンストラクタを呼ぶ
        super(name); 
    }

    @Override
    public void speak() {
        System.out.println(name + " はワンワン！と吠えます。");
    }
}
