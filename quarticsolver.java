public class quraticsolver {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 3;

        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("The roots are: " + root1 + " and " + root2);
    }
}
