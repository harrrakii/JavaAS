import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки(градусы):");
        System.out.println("Широта:");
        double shir1 = scanner.nextDouble();
        System.out.println("Долгота");
        double dol1 = scanner.nextDouble();

        System.out.println("Введите координаты второй точки:");
        System.out.println("Широта:");
        double shir2 = scanner.nextDouble();
        System.out.println("Долгота");
        double dol2 = scanner.nextDouble();

        double result = getResult(shir1, dol1, shir2, dol2);

        System.out.println("Расстояние в км =" + result);
        scanner.close();
    }
    private static double degreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }
    private static double getResult(double shir1, double dol1, double shir2, double dol2){
        final double RADIUS_EARTH = 6371;
        double shirota1 = degreesToRadians(shir1);
        double dolgota1 = degreesToRadians(dol1);
        double shirota2 = degreesToRadians(shir2);
        double dolgota2 = degreesToRadians(dol2);

        double rasShir = shirota2 - shirota1;
        double rasDol = dolgota2 - dolgota1;

        double sinShir = Math.pow(Math.sin(rasShir / 2), 2);
        double sinDol = Math.pow(Math.sin(rasDol / 2), 2);

        double koren = Math.sqrt(sinShir + Math.cos(shirota1) * Math.cos(shirota2) * sinDol);
        double result = 2 * RADIUS_EARTH * (Math.asin(koren));
        return result;
    }
}