package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {

    private long pnrNumber;
    private String departureLoc;
    private String destinationLoc;
    private boolean confirmed;
    Flight flight = new Flight();
    Passenger passenger;
    private int price;

    public Ticket(long pnrNumber, String departureLoc, String destinationLoc,
                  boolean confirmed, Flight flight, Passenger passenger, int price) {
        this.pnrNumber = pnrNumber;
        this.departureLoc = departureLoc;
        this.destinationLoc = destinationLoc;
        this.confirmed = confirmed;
        this.flight = flight;
        this.passenger = passenger;
        if (confirmed == true)
            updateSeats();
        this.price = price;
    }

    public boolean getTicketStatus() {
        return confirmed;
    }

    public Flight getFlight() {
        return flight;
    }

// calculate the duration of the journey

    public String durationOfJourney() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time1 = format.parse(flight.getTimeOfDeparture());
        Date time2 = format.parse(flight.getTimeOfArrival());

        long duration = Math.abs(time1.getTime() - time2.getTime());
        long diffSeconds = duration / 1000 % 60;
        long diffMinutes = duration / (60 * 1000) % 60;
        long diffHours = duration / (60 * 60 * 1000) % 24;
        return "Duration of journey : " + diffHours + " hours " + diffMinutes + " minutes " + diffSeconds + " seconds";
    }

    //    update's the no of the seats booked attribute in the flight by 1.
    public void updateSeats() {
        if (confirmed == true)
            flight.setNoOfSeatsBooked(flight.getNoOfSeatsBooked() + 1);
    }

    // cancel a ticket and decrease the no of seats booked attribute in the flight class
    public void cancelTicket() {
        confirmed = false;
        flight.setNoOfSeatsBooked(flight.getNoOfSeatsBooked() - 1);
    }

    public void confirmTicket() {
        confirmed = true;
    }

    //getter's and setter's of the private attributes

    public long getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(long pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLoc() {
        return departureLoc;
    }

    public void setDepartureLoc(String departureLoc) {
        this.departureLoc = departureLoc;
    }

    public String getDestinationLoc() {
        return destinationLoc;
    }

    public void setDestinationLoc(String destinationLoc) {
        this.destinationLoc = destinationLoc;
    }

    public boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
