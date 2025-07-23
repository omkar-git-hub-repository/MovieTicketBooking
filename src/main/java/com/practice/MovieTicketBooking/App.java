package com.practice.MovieTicketBooking;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // add seitch case to call bookTicket method

        System.out.println("Welcome to Movie Ticket Booking System");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your choice:");
        System.out.println("1. Book Ticket" +
                "\n2. View Booked Tickets" +
                "\n3. Update Seat" +
                "\n4. Delete By customer name" +
                "\n5. Exit");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                BookTicket b = new BookTicket();
                b.bookTicket();
                break;

            case 2:
                ViewBooking v = new ViewBooking();  
                v.viewBooking();
                break;

            case 3:
                UpdateSeats u = new UpdateSeats();
                u.updateSeat();
                break;
            
            case 4:
                DeleteByID d = new DeleteByID();
                d.deleteByName();
                break;

            default:
                break;
        }

    }
}