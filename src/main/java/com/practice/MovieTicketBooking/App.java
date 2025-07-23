package com.practice.MovieTicketBooking;

import org.hibernate.SessionFactory;

import com.Movie.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SessionFactory factory = HibernateUtility.getSessionFactory();
       
    }
}
