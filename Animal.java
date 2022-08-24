public class Animal {
    String species;
    int age;
    public void eat() {
        System.out.println("Eat");
    }
    }
class Dog extends Animal {    //overriding
    public void eat() {
        System.out.println("eat");}
    public void bark() {
        System.out.println("bark");
    }
}
class Test{

    public static void main(String[] args) {
        Dog pug = new Dog();
        pug.eat();
        pug.bark();
    }
}