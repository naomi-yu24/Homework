public class Conditionals {
    public static void main(String[] args) {
        Conditionals myHomework = new Conditionals();

    }//main method

    public Conditionals() {
        String question = "Is today a weekday?";
        System.out.println(question);
        int randomInt = (int) (Math.random() * 11);
        if (randomInt == 1) {
            System.out.println("Doubtful. Very doubtful.");
        } else if (randomInt == 3) {
            System.out.println("Perhaps.");
        } else if (randomInt == 5) {
            System.out.println("Likelihood: high.");
        } else if (randomInt == 7) {
            System.out.println("Inconclusive.");
        } else if (randomInt == 9) {
            System.out.println("Certainly not.");
        } else {
            System.out.println("Not a chance.");
        }//constructor method

    }
}