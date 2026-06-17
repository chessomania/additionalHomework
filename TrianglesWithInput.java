import java.util.Scanner;

public class TrianglesWithInput {
    public static int rectHeight(int height)
    {
        return height + height - 1;
    }
    public static void triangleLeftToRight(int height)
    {
        for (int i = 0; i <= height; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangleRightToLeft(int height)
    {
        for (int i = 0; i <= height; i++)
        {
            for (int j = height; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void centeredTriangleUp(int height)
    {
        int rectangleHeight = rectHeight(height); // finding height where position "height" will be centered
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j <= rectangleHeight; j++)
            {
                if(j <= height + i && j >= height - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void centeredTriangleBottom(int height)
    {
        int rectangleHeight = rectHeight(height); // finding height where position "height" will be centered
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j <= rectangleHeight; j++)
            {
                if(j > i && j <= rectangleHeight - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
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
        triangleLeftToRight(height);
        //second task
        System.out.print("\n");
        System.out.println("Second Task!");
        System.out.print("\n");
        triangleRightToLeft(height);
        //third task
        System.out.print("\n");
        System.out.println("Third Task!");
        System.out.print("\n");
        centeredTriangleUp(height);
        //fourth task
        System.out.print("\n");
        System.out.println("fourth Task!");
        System.out.print("\n");
        centeredTriangleUp(height);
        centeredTriangleBottom(height);
    }
}