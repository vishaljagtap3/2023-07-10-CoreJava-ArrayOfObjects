public class Point {
    private int x;
    private int y;

    public Point() {
        x = y = 0;
    }

    public Point(int xc, int yc) {
        x = xc;
        y = yc;
    }

    public void display() {
        System.out.println("x = " + x + " y = " + y);
    }
}
