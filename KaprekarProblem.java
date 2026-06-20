import java.util.Scanner;
import java.util.Arrays;

public class KaprekarProblem {
    public static int makeAscending (String number)
    {
        int i = 0; int j = 0;
        int result = 0;
        int[] arrayToBeSorted = {0,0,0,0};
        number = String.format("%04d", Integer.parseInt(number));
        while (i < 4)
        {
            arrayToBeSorted[i] = number.charAt(i) - '0';
            i++;
        }
        i = 1000;
        Arrays.sort(arrayToBeSorted);
        while (j < 4)
        {
            result += arrayToBeSorted[j] * i;
            i /= 10;
            j++;
        }
        return result;
    }
    public static int makeDescending (String number)
    {
        int i = 0; int j = 0;
        int result = 0;
        int[] arrayToBeSorted = {0,0,0,0};
        number = String.format("%04d", Integer.parseInt(number));
        while (i < 4)
        {
            arrayToBeSorted[i] = number.charAt(i) - '0';
            i++;
        }
        Arrays.sort(arrayToBeSorted);
        for (int k = 0; k < arrayToBeSorted.length / 2; k++) {
            int temp = arrayToBeSorted[k];
            arrayToBeSorted[k] = arrayToBeSorted[arrayToBeSorted.length - 1 - k];
            arrayToBeSorted[arrayToBeSorted.length - 1 - k] = temp;
        }
        i = 1000;
        while (j < 4)
        {
            result += arrayToBeSorted[j] * i;
            i /= 10;
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int inputNumber = scanner1.nextInt();

        String numberStringRepresentation = String.valueOf(inputNumber);

        if (inputNumber < 1000 || inputNumber > 9999)
        {
            System.out.println("Input must be 4 digit number only!");
            return;
        }

        boolean checkSimilarity = false;

        for (int i = 0; i < numberStringRepresentation.length(); i++)
        {
            for (int j = 0; j < numberStringRepresentation.length(); j++)
            {
                if (numberStringRepresentation.charAt(i) == numberStringRepresentation.charAt(j) && i != j)
                {
                    checkSimilarity = true;
                    break;
                }
            }
        }

        if (!checkSimilarity)
        {
            System.out.println("At least 2 digits of input number must be similar!");
            return;
        }

        int moves = 0;

        System.out.println(makeAscending(numberStringRepresentation));
        System.out.println(makeDescending(numberStringRepresentation));
        int ascending = makeAscending(numberStringRepresentation);
        int descending = makeDescending(numberStringRepresentation);
        int max; int min; int dif;
        boolean flag = true;
        while(flag)
        {
            moves++;
            if (ascending > descending)
                dif = ascending - descending;
            else
                dif = descending - ascending;
            if (dif == 6174)
                flag = false;
            ascending = makeAscending(String.valueOf(dif));
            descending = makeDescending(String.valueOf(dif));
        }
        System.out.println("Moves count to get 6174` " + moves);
    }
}