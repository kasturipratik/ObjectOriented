public class Dog extends Animal {
    public Dog(){
        System.out.println("Woff Woff I am a dog");
    }

    @Override
    public String sleep() {
        return "A dog sleeps like a lazy guy";
    }

    @Override
    public String eat() {
        return "A dog eats chicken wings";
    }

    public String barks(){
        return "A dog barks loud";
    }
}
