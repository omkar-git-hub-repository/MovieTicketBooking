package com.practice.MovieTicketBooking;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entity.TicketBooking;
import com.Movie.Utility.HibernateUtility;

public class UpdateSeats {
    

    public void updateSeat() {
        System.out.println("Updating seat ");
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Show ID to update seat : ");
        
        Scanner sc = new Scanner(System.in);
        int showId = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.println("Enter new seat number: ");
        int newSeat = sc.nextInt();
        sc.nextLine(); // Consume newline

        TicketBooking ticket = session.find(TicketBooking.class, showId);
        ticket.setSeatBooked(newSeat);

        transaction.commit();
        session.close();
        System.out.println("Seat updated successfully for Show ID: " + showId);    
    }

}
