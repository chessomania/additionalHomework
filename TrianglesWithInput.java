import java.util.Scanner;

public class TrianglesWithInput {
    public static int rectHeight(int height)
    {
        return height + height - 1;
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int height = scanner1.nextInt();

        if (height <= 1) {
            System.out.println("Impossible to create triangles with your input!");
            return;
        }
        //first task
        System.out.println("First Task!");
        for (int i = 0; i <= height; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //second task
        System.out.print("\n");
        System.out.println("Second Task!");
        System.out.print("\n");
        for (int i = 0; i <= height; i++)
        {
            for (int j = height; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //second task
        System.out.print("\n");
        System.out.println("Third Task!");
        System.out.print("\n");
        int rectangleHeight = rectHeight(height); // finding height where position "height" will be centred
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j <= rectangleHeight; j++)
            {
                if(j <= height + i && j >= height - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}