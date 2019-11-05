package movieBooking;

public class Cinema {

    private int rows = 9;
    private int columns = 8;
    private double totalAmount;
    private double frontRowPrice = 25.00;
    private double middleRowPrice = 35.00;
    private double backRowPrice = 31.00;
    private int totalSales;

    private String[][] cinema = new String [rows][columns];

    public Cinema(){
        this.clear();
    }

    boolean isSeatBooked(int row, int seat) {
        if(cinema[row][seat].equals("X")){
            System.out.println("BOOKED!");
            return true;
        }
        else {
            System.out.println("NOT BOOKED!");
            return false;
        }
    }

    boolean bookSeat(int row, int seat) {

        if (cinema[row][seat].equals("#") ) {
            cinema[row][seat] = "X";
            totalSales ++;

            System.out.println("SUCCESSFULLY BOOKED! ");
            return true;
        } else  {
            System.out.println("ALREADY BOOKED!");
            return false;
        }

    }

    public boolean book(int tickets, String location){

       return  true;
    }

    public void show() {
        System.out.println("----Screen----");
        for(int i = 0; i < cinema.length;  i++){

            for(int x = 0 ; x < cinema[i].length; x++){
                System.out.print(cinema[i][x]);

            }
            System.out.println();
        }


    }

    double totalIncome(){
        int front = 0;
        int middle= 0;
        int back= 0;

        for(int i = 0; i < cinema.length; i++){
            for(int j = 0; j < cinema[i].length; j++){
                if(cinema[i][j].equals("X")){
                    if(0 <= i && i <= 2){
                        front ++;
                    }
                    else if(3 <= i && i <= 5){
                        middle ++;
                    }
                    else {
                        back ++;
                    }

                }
            }
        }

        totalAmount =  (back * backRowPrice)+ (middle * middleRowPrice) + (front * frontRowPrice);

        return totalAmount;
    }

    int totalBookings(){
        return totalSales;
    }


    public void clear(){
       for(int i = 0; i < cinema.length;  i++){

           for(int x = 0 ; x < cinema[i].length; x++){
               System.out.print(cinema[i][x] = "#");

           }
           System.out.println();
       }


    }

}

