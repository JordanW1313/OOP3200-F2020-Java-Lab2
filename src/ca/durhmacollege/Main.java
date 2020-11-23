/*
 * File Name     : OOP3200-F2020-Java-Lab2
 * Student Names : Ahmed Rizvi[100698429], Jordan Wriker[]
 * Date          : 2020-11-22
 */
package ca.durhmacollege;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // work ticket that uses default constructor
        WorkTicket defaultTicket = new WorkTicket();
        System.out.println(defaultTicket.toString());

        // work ticket that uses parameterized constructor (NO PARAMETER ERROR)
        WorkTicket testTicket1 = new WorkTicket(1, "TT01", LocalDate.now(), "There should be no errors with this ticket.");
        System.out.println(testTicket1.toString());

        // work ticket with incorrect ticket number (ERROR HERE)
        try
        {
            WorkTicket testTicket2 = new WorkTicket(-5, "TT02", LocalDate.now(), "Incorrect ticket number.");
        }
        catch (IllegalArgumentException illegalArgumentException)
        {
            System.out.println(illegalArgumentException.toString());
        }

        // work ticket with incorrect date (ERROR HERE)
        try
        {
            WorkTicket testTicket3 = new WorkTicket(3, "TT02", LocalDate.of(1999,10,10), "incorrect date");
        }
        catch (IllegalArgumentException illegalArgumentException)
        {
            System.out.println(illegalArgumentException.toString());
        }

        // mutating a work ticket correctly
        testTicket1.SetWorkTicket(1, "TT01", LocalDate.of(2000,1,6), "This ticket was successfully revised");
        System.out.println("\n" + testTicket1.toString());

        // mutating a work ticket incorrectly
        boolean ticketHasChanged;
        ticketHasChanged = testTicket1.SetWorkTicket(-1, "TT01", LocalDate.of(1997,1,6), "");
        if (ticketHasChanged)
        {
            System.out.println("The ticket was successfully altered.");
            ticketHasChanged = false;
        }
        else
            System.out.println("The ticket could not be altered.");
        System.out.println("\n" + testTicket1.toString());

        // mutating a work ticket to an empty description (not possible)
        ticketHasChanged = testTicket1.SetWorkTicket(1, "TT01", LocalDate.now(), "");
        if (ticketHasChanged)
        {
            System.out.println("The ticket was successfully altered.");
            ticketHasChanged = false;
        }
        else
            System.out.println("The ticket could not be altered.");
        System.out.println("\n" + testTicket1.toString());

        /*// DEFINED INPUT VARIABLES

        int ticketNumber = 0;
        String clientID = "";
        String datePrompt = "";
        LocalDate date = null;
        String description = "";*/

        /*// INPUT

        System.out.print("Enter the work ticket number: ");

        boolean isValidInput = false;

        while(!isValidInput)
        {
            try
            {
                ticketNumber = keyboard.nextInt();

                if(ticketNumber <= 0)
                {
                    throw new IllegalArgumentException("Invalid input. Work ticket number must be non-negative whole number.");
                }

                System.out.print("Enter the client ID: ");

                clientID = keyboard.next();

                while(!isValidInput)
                {
                    if(clientID.length() == 0) // this validation will work for 0 string length but the but keyboard.next() won't allow empty input and keyboard.nextLine() doesn't pause for input
                    {
                        System.out.println("Invalid input. Client ID must be at least one character. Please try again.");
                        System.out.print("Enter the work ticket number: ");
                        clientID = keyboard.next();
                        isValidInput = false;
                    }
                    else
                    {
                        isValidInput = true;
                    }
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
                System.out.println(i.getMessage());
                System.out.print("Enter the work ticket number: ");
                keyboard.nextLine();
                isValidInput = false;
            }
        }

        if(isValidInput)
        {
            isValidInput = false;

            System.out.print("Enter work ticket date YYYY-MM-DD: ");

            while(!isValidInput)
            {
                try
                {
                    datePrompt = keyboard.next();
                    var values = datePrompt.split("-");

                    if(Integer.parseInt(values[0]) < 2000 || Integer.parseInt(values[0]) > 2099)
                    {
                        throw new IllegalArgumentException();
                    }

                    date = LocalDate.of(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
                    isValidInput = true;
                }
                catch(IllegalArgumentException i)
                {
                    System.out.println("Invalid input. Year must be between 2000 and 2099 with YYYY-MM-DD format. Please try again.");
                    System.out.print("Enter work ticket date YYYY-MM-DD: ");
                    keyboard.nextLine();
                    isValidInput = false;
                }
                catch(DateTimeException d)
                {
                    System.out.println("Invalid date entered. Please try again.");
                    System.out.print("Enter work ticket date YYYY-MM-DD: ");
                    keyboard.nextLine();
                    isValidInput = false;
                }
                catch(Exception e)
                {
                    System.out.println("There was an error entering the date. Please try again.");
                    System.out.print("Enter work ticket date YYYY-MM-DD: ");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
        }

        System.out.print("Enter the issue description: ");
        //description = keyboard.nextLine();
        description = keyboard.next();
        isValidInput = false;

        while(!isValidInput)
        {
            if (description.length() == 0)
            {
                System.out.println("Invalid input. Issue Description must be at least one character. Please try again.");
                System.out.print("Enter the issue description: ");
                description = keyboard.next();
                isValidInput = false;
            }
            else
            {
                isValidInput = true;
            }
        }

        WorkTicket parameterTest = new WorkTicket(ticketNumber, clientID, date, description);

        System.out.println();
        System.out.println(defaultTest.toString());
        System.out.println();
        System.out.println(parameterTest.toString());*/
    }
}
