public class TestClass {
    public static void main(String[] args){
        MathematicalOperations mathOperations = new MathematicalOperations();
        System.out.println("isEvenOrOdd test:");
        System.out.println("Number 2 is - " + (mathOperations.isEvenOrOdd(2)?"Even":"Odd"));
        System.out.println("Number 678 is - " + (mathOperations.isEvenOrOdd(678)?"Even":"Odd"));
        System.out.println("Number 7 is - " + (mathOperations.isEvenOrOdd(7)?"Even":"Odd"));
        System.out.println("Number 67 is - " + (mathOperations.isEvenOrOdd(67)?"Even":"Odd"));
        System.out.println();
        System.out.println("circleField test:");
        System.out.println("A circle field with a radius 3.20 is " + mathOperations.circleField(3.20));
        System.out.println("A circle field with a radius 16 is " + mathOperations.circleField(16));
        System.out.println();
        System.out.println("power test:");
        System.out.println("Power of number 2 is " + mathOperations.power(2));
        System.out.println("Power of number 32 is " + mathOperations.power(32));
    }
}
