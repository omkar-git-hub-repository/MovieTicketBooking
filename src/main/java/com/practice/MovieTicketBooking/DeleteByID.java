package com.practice.MovieTicketBooking;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entity.TicketBooking;
import com.Movie.Utility.HibernateUtility;

public class DeleteByID {

    public void deleteById(int showId)
    {
        System.out.println("Deleting Show with Show ID: " + showId);
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("Enter Show ID to delete: ");
        Scanner sc = new Scanner(System.in);
        int idToDelete = sc.nextInt();
        sc.nextLine(); // Consume newline

        
        TicketBooking ticket = session.find(TicketBooking.class, idToDelete);
        session.remove(ticket);
        System.out.println("Ticket with Show ID " + idToDelete + " deleted successfully!");
        
        if (ticket == null) {
            System.out.println("No ticket found with Show ID: " + idToDelete);
        } else {
            System.out.println("Ticket deleted successfully!");
        }

        transaction.commit();
        session.close();
    }
    
}
