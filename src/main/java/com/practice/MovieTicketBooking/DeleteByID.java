package com.practice.MovieTicketBooking;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Entity.TicketBooking;
import com.Movie.Utility.HibernateUtility;

public class DeleteByID {

    public void deleteByName() {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name to delete: ");
        String nameToDelete = sc.nextLine();

        // Use the exact case-sensitive field name: 'CustomerName'
        List<TicketBooking> tickets = session
                .createQuery("FROM TicketBooking WHERE CustomerName = :name", TicketBooking.class)
                .setParameter("name", nameToDelete)
                .getResultList();

        if (tickets.isEmpty()) {
            System.out.println("No records found with the name: " + nameToDelete);
        } else {
            System.out.println("Deleting the following record(s):");
            for (TicketBooking ticket : tickets) {
                System.out.println(ticket);
                session.remove(ticket); // deletes from database
            }
        }

        transaction.commit();
        session.close();
        sc.close();
    }

}