public class MadLib{
    public static void main(String[] args) {
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    }// main method
public MadLib(){
        System.out.println("hallo yarld");
        String story = "This weekend I am going camping with "
                +classmate+". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ". The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees Fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " "+pluralAnimal +" which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";
        System.out.println(story);
}
public String classmate = "Anna";
    public String city = "Boston";
    public String noun = "chicken";
    public String adjective = "little";
    public String pluralNoun = "trees";
    public String pluralAnimal = "turtles";
    public boolean trueOrFalse = true;
    public double decimalBiggerThan1 = 1.4;
    public int number1 = 7;
    public int number2 = 1085;
    public int wholeNumberBetween1And4 = 3;
    public String miltonTeacher = "Ms. Lockwood";
    public String miltonDean = "Mr. Ruiz";
    public String letterGrade = "A";
    public String season = "fall";
}
