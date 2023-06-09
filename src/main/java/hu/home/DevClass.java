package hu.home;

public class DevClass {
    public static void main(String[] args) {
        DevClass.printMessage("Hello Dev Class!");
    }
    public static void printMessage(String message){
        StringBuilder sb = new StringBuilder("Szabolcs,");
        sb.append(message);
        addingTwoNumbers(10, message.length() );
        decoratorPrinter(sb.toString());
        sb = null;
    }

    public static void decoratorPrinter(String message){
        System.out.println(message);
        new LogginService().loggingServiceDecorator(message);
    }

    public static void addingTwoNumbers(int a, int b){
        System.out.println(a + b);
    }

}
