import java.util.Scanner;

class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Radius Here : ");
        int radius = sc.nextInt();
        float pi = 3.14f;
        double area = pi * radius * radius;
        System.out.println("Area of a Circle : " + area);
    }

}
