public class CarpFish extends Animal {
    public CarpFish(){
        System.out.println("Carp Fish are bottom feeder. They love corn");
    }


    @Override
    public String sleep() {
        return "I dont remember carp fishing sleeping";
    }
    @Override
    public String eat(){
        return "Carp Fish Is vegetarian and loves to eat grass and corn";
    }
    public String swim(){
        return "Carp are very good swimmers";
    }
}
