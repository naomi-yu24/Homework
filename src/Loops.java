public class Loops {
    public static void main(String[] args) {
        Loops myCount= new Loops();
    }//main method
    public Loops(){
        countUp();
        countByThrees();
        countDown();

    }//constructor method
    public void countUp() {
        for(int x=1; x<6; x=x+1) {
            System.out.println(x);
        }
    }

    public void countByThrees() {
        for(int x=3; x<16; x=x+3) {
            System.out.print(x);
        }
        System.out.println(" ");
    }

    public void countDown() {
        for(int x=10; x>0; x=x-1) {
            System.out.print(x);
        }
        System.out.println(" ");
        System.out.println("Happy Loop Year!");
    }
    //DEFINE counting methods here
}
