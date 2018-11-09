public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,9);
        MovablePoint movablePoint1 = new MovablePoint(5,9);

        System.out.println(point.toString());

        System.out.println(movablePoint1.toString());

        movablePoint1.movable();
        System.out.println(movablePoint1.toString());
    }
}
