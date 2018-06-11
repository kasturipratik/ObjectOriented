/*
* All Birds are Animals but all Animals are not Birds
*/
public class Bird extends Animal {

public Bird()
{
//super();
System.out.println("A bird is hatched...");
}

// override the default methods from the Animal class
@Override
public String sleep() {
return "A bird sleeps soundly...";
}

//override the default eat method from the animal class
@Override
public String eat() {
return "A bird eats...";
}

// unique method for the bird class only
public String fly()
{
//Birds can fly but other animals can't so this method
//is unique to the Bird class
return "A bird flies...";
}
}

 