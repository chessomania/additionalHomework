public class Triangles {
    public static void main(String[] args) {
        int height = 5;
        //first task
        System.out.println("First Task!");
        for (int i = 0; i <= height; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
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
        int rectangleHeight = height - 1 + height - 1 + 1; // finding height where position "height" will be centred
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