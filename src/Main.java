import java.util.Scanner;

public class Main {
    public static final int FLOORS_COUNT = 20;
    public static final int SPEED = 5;
    public static final int DOOR_SPEED = 10;
    private static Lift lift;

    public static void main(String[] args) {
        lift = new Lift(FLOORS_COUNT, SPEED, DOOR_SPEED);
        Scanner scanner  = new Scanner(System.in);
        while (true) {
            System.out.println("Ожидаю ввода этажа (для завершения введите 0): ");
            int floorNumber = scanner.nextInt();
            if (floorNumber == 0) {
                System.out.println(lift.getFloors());
                System.out.println("Время в пути: " + lift.getTotalSeconds() + " сек.");
                return;
            } else {
                lift.addFloor(floorNumber);
            }
        }
    }
}
