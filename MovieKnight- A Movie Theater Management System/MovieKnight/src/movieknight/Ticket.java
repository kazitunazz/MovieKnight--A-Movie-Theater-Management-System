/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieknight;

/**
 *
 * @author User
 */
public class Ticket {

    String theaterName, time, day;
    int price;
    Movie watchedMovie;

    public Ticket() {
    }

    public Ticket(String theaterName, String time, Movie watchedMovie) {
        this.theaterName = theaterName;
        this.time = time;
        this.watchedMovie = watchedMovie;
    }
    
    double calculatePrice(int count){
        return setTicketPrice()* count;
    }
    
    int setTicketPrice(){
        if(theaterName.equalsIgnoreCase("Joy"))
            return 220;
        
        else if(theaterName.equalsIgnoreCase("Fury")){
            return 170;
        }
        
        else if(theaterName.equalsIgnoreCase("Vivid")){
            return 190;
        }
        else if(theaterName.equalsIgnoreCase("Lost")){
            return 230;
        }
        else if(theaterName.equalsIgnoreCase("Venture")){
            return 280;
        }
        else
            return 350;
        
    }
}
