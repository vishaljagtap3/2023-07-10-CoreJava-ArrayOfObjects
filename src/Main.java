public class Main {
    public static void main(String[] args) {
        Point [] pts = new Point[4];

        for(int i = 0; i < pts.length; i++) {
            System.out.println(pts[i]);
        }

        pts[0] = new Point();
        pts[1] = new Point(100, 100);
        pts[2] = new Point(200, 200);
        pts[3] = new Point(300, 300);

        System.out.println();
        for(int i = 0; i < pts.length; i++) {
            //System.out.println(pts[i]);
            pts[i].display();
        }

        System.out.println();

        String [] cities = new String[5];
        for(int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        cities[0] = new String("Pune");
        cities[1] = "Mumbai";
        cities[2] = "Nagpur";
        cities[3] = "Nashik";
        cities[4] = "Nagar";

        for(int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }



        /*Point p1 = new Point();
        Point p2 = new Point(100, 100);
        Point p3 = new Point(200, 200);

        p1.display();
        p2.display();
        p3.display();*/

    }
}
