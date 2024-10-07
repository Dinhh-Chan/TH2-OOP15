import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double khoangcach(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
    public static double khoangcach(Point p1, Point p2) {
        return p1.khoangcach(p2);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class chuvitamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            double a = Point.khoangcach(p1, p2);
            double b = Point.khoangcach(p2, p3);
            double c = Point.khoangcach(p3, p1);

            if (a + b > c && b + c > a && c + a > b) {
                double perimeter = a + b + c;
                System.out.printf("%.3f\n", perimeter);
            } else {
                System.out.println("INVALID");
            }
        }

        scanner.close();
    }
}
