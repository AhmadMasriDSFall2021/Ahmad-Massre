package Assignment1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of movies to be rated:");
        int nm = s.nextInt();
        for(int i=1;i<=nm;i++){
        System.out.println("Enter the name of movie "+i+"\n");
        String m = s.next();
        }
        String[] Movie= new String[nm];
        System.out.println("Enter the number of attendees");
        int na = s.nextInt();
        
        for(int i=1;i<=na;i++){
            System.out.println("Welcome to Cinema Critics");
            for(int j=1;j<=nm;j++){
           System.out.println("Please, enter a rating between 1 and 5 for ");
           int r = s.nextInt();
            }
            System.out.println("Thanks!");  
        }
        int sum=0;
        for(int i=0;i<nm;i++){
            
        }
        System.out.println(" Here are the results:\n Movie Name   Average   Min   Max\n ");
        
        
   
    }
    
}
