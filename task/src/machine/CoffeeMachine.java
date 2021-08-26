package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        String[] instructions = {"Starting to make a coffee",
                "Grinding coffee beans",
                "Boiling water",
                "Mixing boiled water with crushed coffee beans",
                "Pouring coffee into the cup",
                "Pouring some milk into the cup",
                "Coffee is ready!"};

        for(String s : instructions)
            System.out.println(s);
    }
}
