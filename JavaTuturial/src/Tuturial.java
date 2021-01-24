public class Tuturial {

    public static void printme () {
        System.out.println("hello world");
        int a = 9;
        int b = 2;
        float c = a%b;
        int d;
        String myname = "Hunter";
        myname += " \"Blake\" ";
        myname += "and ";
        myname += "mackenzie.";

        System.out.println("a + b = " + c);
        System.out.println(myname);
        if (a != 9 && b == 2){
            System.out.println(a);
        } else if (b == 2){
            System.out.println("payton");
        } else {
            System.out.println("kenzie");
        }
        if (a == 9){
            b = 3;
        } else {
            b = 4;
        }
        myname = (a ==9) ? "hunter" : "Mack";

        System.out.println(myname);
    }
    public static void main (String args[]){
        printme();
    }
}
