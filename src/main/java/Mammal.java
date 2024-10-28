// Using this file to showcase inheritance and abstraction i.e methods are only declared.
// it is up to the subclass to implement these methods.

public abstract class Mammal {

    protected String diet;
    protected String name;
    protected int age;
    protected String color;
    protected int size;

    protected abstract String getDiet();
    protected abstract String getName();
    protected abstract int getAge();
    protected abstract String getColor();

    protected int getSize(){
        return this.size;
    }

}
