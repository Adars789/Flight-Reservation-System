package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Flight flight1 = new Flight("Mark1", "Indigo", 200, "10/sept/2021",
                "11/sept/2021", "16:30:00", "10:00:00");
        Flight flight2 = new Flight("Mark2", "Air India", 210, "13/sept/2021",
                "14/sept/2021", "10:50:00", "21:10:00");
        Passenger passenger1 = new Passenger("Babu Rao", "+91 9458343867", "baburao123@gmail.com",
                "Raju Gali Shayam Market Gadpat Nagar", "Greater Noida", "Uttar Pradesh");
        Passenger passenger2 = new Passenger("Raju Rastogi", "+91 9798798856", "raju345@gmail.com",
                "Chachad Market near Photografer Gali", "Gaziyabad", "Uttar Pradesh");
        String[] touristLocation = {"Hawa Mahal", "Red Fort", "Agra", "India Gate", "Lotus Temple"};
        touristTicket ticket1 = new touristTicket(463737737546L, "Raju International airport",
                "Shayam International Airport", true, flight1, passenger1, "Greater Noida",
                touristLocation, 10000);
        regularTicket ticket2 = new regularTicket(43346346564547L, "Delhi", "Mumbai",
                true, flight2, passenger2, "Mutton Biriyani", "Water", "Chilli Potato", 20000);


        System.out.println(flight1.getFlightName());
        System.out.println(passenger1.getContactDetails());
        System.out.println(passenger2.getAddressDetails());
        System.out.println(ticket1.durationOfJourney());
        System.out.println(ticket2.durationOfJourney());
        System.out.println(flight1.getFlightDetails());
        // System.out.println(ticket1.addTouristLocation(touristLocation));
        System.out.println(ticket2.getPnrNumber());
    }
}

