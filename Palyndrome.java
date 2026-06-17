public class Palyndrome {
    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("No input");
            return;
        }
        if (args[0].charAt(0) == '-')
        {
            System.out.println("- at first, so it is not palyndrome");
            return;
        }
        else if (args[0].charAt(0) == '+')
        {
            int length = args[0].length();
            for (int i = 1; i < (length - 1)/2; i++)
            {
                if (args[0].charAt(i) != args[0].charAt(length - 1 - i))
                {
                    System.out.println("input number it is not palyndrome");
                    return;
                }
            }
        }
        else
        {
            int length = args[0].length();
            for (int i = 0; i < length/2; i++)
            {
                if (args[0].charAt(i) != args[0].charAt(length - 1 - i))
                {
                    System.out.println("input number it is not palyndrome");
                    return;
                }
            }
        }
        System.out.println("input is palyndrome");
    }
}
