import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите верхний ограничитель: ");
        double max = input.nextDouble();
        System.out.println("Введите исходное число: ");
        double x = input.nextDouble();
        double sum = 0;
        if (Math.abs(x) < max)
        {
            for (int n = 0; n <= max; n++)
            {
                sum += Math.pow(-1, n) * Math.pow(x, n) / factorial(n);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Error");
        }

    }
    public static int factorial ( int j)
    {
        int f = 1;
        for (int i = 1; i <= j; i++)
        {
            f *= i;
        }
        return f;
    }
}