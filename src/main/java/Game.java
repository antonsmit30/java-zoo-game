// This is our game entrypoint
public class Game {

    public static void main(String[] args)
    {
        // Instantiate a Bear!
        Bear bear1 = new Bear("Billy", 5, "brown", 11);
        System.out.println("The bear: " + bear1.getName() + "has joined the party!");
    }
}
