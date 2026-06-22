public class SmartLibrarySystem {
    static String[] books = {"Java", "Python", null, "C++"};

    public static void getBookLength(int index) {
        try {
            
            System.out.println("Length of book: " + books[index].length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The index " + index + " is invalid for this library.");
        } catch (NullPointerException e) {
            System.out.println("Error: The book entry at index " + index + " is null.");
        }
    }

    public static void main(String[] args) {
        
        System.out.println(" Testing Invalid Index ");
        getBookLength(10); 
        
        System.out.println("\n Testing Null Entry ");
        getBookLength(2);
        
        System.out.println("\n Testing Valid Entry ");
        getBookLength(0);
    }
}