// This is our game entrypoint
public class Game {

    public static void main(String[] args)
    {
        // Instantiate a Bear!
        Bear[] bears = {
                new Bear("Billy", 5, "brown", 8),
                new Bear("Sally", 2, "black", 4),
                new Bear("jacky", 4, "white", 6),
        };
        // Instantiate our reptiles
        Reptile[] crocodiles = {
                new Crocodile(),
        };

        // Lets create a habitat
        Habitat[] habitats = {
                new Habitat("FOREST", 5),
                new Habitat("FOREST", 6),
                new Habitat("MARSH", 3),
                new Habitat("WATER", 5)
        };

        // Let's loop through our bears printing out some details
        System.out.println("Our bears: ");
        for (Bear bear: bears){
            System.out.println(bear.getDetails());
        }

        // Let's print out our habitats
        System.out.println("Our habitats");
        for (Habitat habitat: habitats){
            System.out.println(habitat.getDetails());
        }
    }
}
