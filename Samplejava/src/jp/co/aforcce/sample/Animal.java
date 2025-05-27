package jp.co.aforcce.sample;

public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " は何かをしゃべっています。");
    }
}
