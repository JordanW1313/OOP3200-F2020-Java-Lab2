package ca.durhmacollege;

import java.time.LocalDate;

public class WorkTicket
{
    // PRIVATE INSTANCE VARIABLES

    private int workTicketNumber;
    private String clientID;
    private LocalDate workTicketDate;
    private String issueDescription;

    // PUBLIC PROPERTIES (MUTATORS AND ACCESSORS)

    public int getWorkTicketNumber()
    {
        return workTicketNumber;
    }

    public void setWorkTicketNumber(int workTicketNumber)
    {
        this.workTicketNumber = workTicketNumber;
    }

    public String getClientID()
    {
        return clientID;
    }

    public void setClientID(String clientID)
    {
        this.clientID = clientID;
    }

    public LocalDate getWorkTicketDate()
    {
        return workTicketDate;
    }

    public void setWorkTicketDate(LocalDate workTicketDate)
    {
        this.workTicketDate = workTicketDate;
    }

    public String getIssueDescription()
    {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription)
    {
        this.issueDescription = issueDescription;
    }

    /*public WorkTicket setWorkTicket(int ticketNumber, String id, LocalDate date, String description)
    {


    }*/

    // CONSTRUCTORS

    WorkTicket()
    {
        workTicketNumber = 0;
        clientID = null;
        workTicketDate = null;
        issueDescription = null;
    }

    WorkTicket(int ticketNumber, String id, LocalDate date, String description)
    {
        workTicketNumber = ticketNumber;
        clientID = id;
        workTicketDate = date;
        issueDescription = description;
    }

    // PUBLIC METHODS

    @Override
    public String toString()
    {
        String output = "";

        output = ("Ticket Number: " + this.getWorkTicketNumber());
        output += ("\n----------------------");
        output += ("\nClient ID: " + this.getClientID());
        output += ("\nTicket Date: " + this.getWorkTicketDate());
        output += ("\nIssue Description: " + this.getIssueDescription());

        return output;
    }
}
