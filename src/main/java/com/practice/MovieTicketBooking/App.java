package com.practice.MovieTicketBooking;

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
        HibernateUtility.getSessionFactory();
    }
}
