package hu.home;

public class DevClass {
    public static void main(String[] args) {
        DevClass.printMessage("Hello Dev Class!");
    }
    public static void printMessage(String message){
        StringBuilder sb = new StringBuilder("Szabolcs,");
        sb.append(message);
        decoratorPrinter(sb.toString());
        sb = null;
    }

    public static void decoratorPrinter(String message){
        System.out.println(message);
    }

}
