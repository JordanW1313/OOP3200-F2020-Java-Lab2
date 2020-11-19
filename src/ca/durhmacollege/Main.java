package ca.durhmacollege;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // DEFINED SCANNER AND DEFAULT WORKTICKET OBJECT

        Scanner keyboard = new Scanner(System.in);

        WorkTicket defaultTest = new WorkTicket();

        // DEFINED INPUT VARIABLES

        int ticketNumber;
        String clientID;
        LocalDate date;
        String description;

        // INPUT

        System.out.print("Enter the work ticket number: ");

        boolean isValidInput = false;

        while(!isValidInput)
        {
            try
            {
                ticketNumber = keyboard.nextInt();

                isValidInput = true;

                if(ticketNumber <= 0)
                {
                    throw new IllegalArgumentException();
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input. Whole number needed. Please try again.");
                System.out.print("Enter the work ticket number: ");
                keyboard.nextLine();
                isValidInput = false;
            }
            catch(IllegalArgumentException i)
            {
                System.out.println("Invalid input. Work ticket number must be non-negative whole number.");
                System.out.print("Enter the work ticket number: ");
                keyboard.nextLine();
                isValidInput = false;
            }
        }

        System.out.println();
        System.out.println(defaultTest.toString());

    }
}
