import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args)
    {

        //variables
        int width = 0;
        int length = 0;
        int area;
        int perimeter;
        double diagonal;
        String wrongInput;
        Scanner in = new Scanner(System.in);

        //input prompt
        System.out.println("Enter length ");
        //input if is number if not go to else
        if(in.hasNextInt())
        {
            length = in.nextInt();
            in.nextLine();
        }
        //for any incorrect input
        else
        {
            wrongInput = in.nextLine();
            System.out.println("You said the Length was " + wrongInput);
            System.out.println("Run the program again and enter length in numbers");
            System.exit(0);//Terminates the program
        }

        System.out.println("Enter width ");
        //input if is number if not go to else
        if(in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine();
        }
        //for any incorrect input
        else
        {
            wrongInput = in.nextLine();
            System.out.println("you said the width was " + wrongInput);
            System.out.println("Run the program again and enter width in numbers");
            System.exit(0);//Terminates the program
        }

        if(length == width)
        //tells if it is a rectangle
        {
            System.out.println("A rectangle has different sized length and width. This is a square.");
            System.out.println("Rerun the program and please enter the dimensions of a rectangle");
            System.exit(0);//Terminates the program
        }
        else
        {
            //calculations
            area = length * width;
            perimeter = (length * 2) + (width * 2);
            diagonal = Math.sqrt ((length * length) + (width * width));

            //outputs
            System.out.println("The area is " + area);
            System.out.println("The perimeter is " + perimeter);
            System.out.printf("The diagonal is %.2f\n",+ diagonal);
        }

    }
}