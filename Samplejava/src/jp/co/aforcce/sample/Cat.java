package jp.co.aforcce.sample;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " はニャー！と鳴きます。");
    }
}
