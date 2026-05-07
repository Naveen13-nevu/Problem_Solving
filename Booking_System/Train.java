
import java.util.Scanner;


public class Train {

    static int [] seats = new int [10];

    public static void viewSeats(){
        System.out.println("Seat status is: ");
        for(int i=0;i<seats.length;i++){
            if(seats[i] == 0){
                System.out.println("the seatnumber "+(i+1)+"is available");
            }
            else{
                System.out.println("the seatnumber " + (i+1)+ "is not availble");
            }
        }
    }

    public static void bookSeat(int seatNumber){

        if(seatNumber<1 || seatNumber >10){
            System.err.println("invalid seat number");
            return;
        }

        if(seats[seatNumber -1] == 0){
            seats[seatNumber -1]=1;
            System.out.println("Seat booked successfully");
        }
        else{
            System.out.println("Seats already booked ");
        }
    }

    public static void cancelSeats(int seatNumber){

        if(seats[seatNumber-1] == 1){
            seats[seatNumber-1] =0;
            System.out.println("seat cancelled successfully");
        }
        else{
            System.out.println("Seat is already available ");
        }
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("1. view seats");
            System.out.println("2. book seats");
            System.out.println("3. cancel seats");
            System.out.println("4. exit");

            int choice = sc.nextInt();

           switch (choice) {
               case 1:
                   viewSeats();
                   break;
               case 2:
                System.out.println("Enter the seat number: ");
                int seatNumber =sc.nextInt();
                   bookSeat(seatNumber);
                   break;
               case 3:
                System.out.println("select the seat you want to cancel: ");
                    int cancel = sc.nextInt();
                   cancelSeats(cancel);
                   break;
               case 4:
                   System.exit(0);
                   


               default:
                System.out.println("Invalid choice ");
                break;
           }
            


        }

    }
}
