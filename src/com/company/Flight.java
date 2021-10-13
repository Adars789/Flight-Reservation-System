package com.company;

public class Flight {


    private String flightName;
    private String airline;
    private int capacity;
    private int noOfSeatsBooked = 0;
    private String dateOfDeparture;
    private String dateOfArrival;
    private String timeOfDeparture;
    private String timeOfArrival;


    public Flight(Flight flight) {
        this(flight.flightName, flight.airline, flight.capacity, flight.dateOfDeparture, flight.dateOfArrival,
                flight.timeOfDeparture, flight.timeOfArrival);
    }

    public Flight(String flightName, String airline, int capacity, String dateOfDeparture, String dateOfArrival,
                  String timeOfDeparture, String timeOfArrival) {
        this.flightName = flightName;
        this.airline = airline;
        this.capacity = capacity;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    public Flight() {

    }

    //   check the no of available Seats
    public int availableSeats() {
        return capacity - noOfSeatsBooked;
    }

    //    returns the flight details
    public String getFlightDetails() {
        return "Flight Name: " + flightName + ", Airline Name: " + airline + ", no of Seats: " +
                capacity + ", available no of seats: " + availableSeats();
    }

//    getters and setters of the private attributes.

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfSeatsBooked() {
        return noOfSeatsBooked;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.noOfSeatsBooked = noOfSeatsBooked;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }
}
