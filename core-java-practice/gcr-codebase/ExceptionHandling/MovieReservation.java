public class MovieReservation {
    // Array storing booked seat numbers
    static int[] seats = {101, 102, 103, 104, 105};
    public static int getSeat(int index) {
        try {
            
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            
            return -1;
        }
    }

    public static void main(String[] args) {
       
        int requestedIndex = 8;
        int result = getSeat(requestedIndex);
        
        System.out.println("Result for index " + requestedIndex + ": " + result);
    }
}