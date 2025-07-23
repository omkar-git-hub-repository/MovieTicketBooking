package com.practice.MovieTicketBooking;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.Entity.TicketBooking;
import com.Movie.Utility.HibernateUtility;

public class ViewBooking {

    public void viewBooking() {
        System.out.println("Viewing booked tickets...");
        
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

       List<TicketBooking> t = session.createQuery("Select t from TicketBooking t", TicketBooking.class).getResultList();
        t.stream().forEach(k ->  System.out.println(k.toString()));

        transaction.commit();
        session.close();

    }
}
