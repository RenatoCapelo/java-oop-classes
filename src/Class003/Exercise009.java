package Class003;

public class Exercise009 {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2*(width+height);

        System.out.printf("Area is %.2f * %.2f = %.2f\n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f\n", width, height, perimeter);
    }
}
