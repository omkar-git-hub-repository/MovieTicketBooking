package com.practice.MovieTicketBooking;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entity.TicketBooking;
import com.Movie.Utility.HibernateUtility;
public class BookTicket {
    
    public void bookTicket(){

        System.out.println("Booking a movie ticket...");
        // Logic for booking a ticket can be added here
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        TicketBooking t = new TicketBooking();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Show ID ");
        t.setId(sc.nextInt());
        sc.nextLine(); // Consume newline

        System.out.println("Enter Movie Name ");
        t.setMovieName(sc.nextLine());

        System.out.println("Enter Customer Name ");
        t.setCustomerName(sc.nextLine());


        System.out.println("Enter Show Time ");
        t.setShowTime(sc.nextLine());

        System.out.println("Enter seat booked ");
        t.setSeatBooked(sc.nextInt());
        sc.nextLine(); // Consume newline

        session.persist(t);
        transaction.commit();   
        session.close();
        System.out.println("Ticket booked successfully!");

    }

}
