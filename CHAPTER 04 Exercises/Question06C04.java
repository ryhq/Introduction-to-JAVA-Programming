public class Question06C04 {
    public static void main(String[] args) {
        final int RADIUS = 40;
        double x1, y1, x2, y2, x3, y3, a, b, c, A, B, C;
        x1 = RADIUS * Math.cos(Math.toRadians(Math.random() * Math.toDegrees(2 * Math.PI)));
        y1 = RADIUS * Math.sin(Math.toRadians(Math.random() * Math.toDegrees(2 * Math.PI)));
        x2 = RADIUS * Math.cos(Math.toRadians(Math.random() * Math.toDegrees(2 * Math.PI)));
        y2 = RADIUS * Math.sin(Math.toRadians(Math.random() * Math.toDegrees(2 * Math.PI)));
        x3 = RADIUS * Math.cos(Math.toRadians(Math.random() * Math.toDegrees(2 * Math.PI)));
        y3 = RADIUS * Math.sin(Math.toRadians(Math.random() * Math.toDegrees(2 * Math.PI)));
        a = Math.pow((Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0)), 0.5);
        b = Math.pow((Math.pow((x3 - x2), 2.0) + Math.pow((y3 - y2), 2.0)), 0.5);
        c = Math.pow((Math.pow((x3 - x1), 2.0) + Math.pow((y3 - y1), 2.0)), 0.5);
        A = Math.acos(((a * a) - (b * b) - (c * c)) / ( -2 * b * c));
        B = Math.acos(((b * b) - (a * a) - (c * c)) / ( -2 * a * c));
        C = Math.acos(((c * c) - (a * a) - (b * b)) / ( -2 * a * b));
        System.out.println("\nThree random angles of the triangle : " + A + ", " + B + " and " + C + "\n" );
    }
}
