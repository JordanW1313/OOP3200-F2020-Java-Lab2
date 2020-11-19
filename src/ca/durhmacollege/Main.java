package ca.durhmacollege;

import java.time.LocalDate;

public class Main
{

    public static void main(String[] args)
    {
        WorkTicket defaultTest = new WorkTicket();
        WorkTicket test = new WorkTicket(1, "A0001", LocalDate.of(2020, 1, 13), "Test Description");

        System.out.print(defaultTest.toString());
        System.out.println();
        System.out.println();
        System.out.print(test.toString());
    }
}
