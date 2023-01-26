public class ISBNValidator{

    private String[] validNums = {}; // initialize to hold 1000 items
    private String[] invalidNums = {}; // initialize to hold 1000 items

    public ISBNValidator(){
        
    }

    public static void main(String[] args){
    ISBNValidator app = new ISBNValidator ();
    System.out.println("* ISBN Validator Program *");
    System.out.println("...Importing data...");
    app.importData(); // imports data from the text file
    app.runProgram(); // runs using a while loop; see examples
    System.out.println("* End of Program *");
    }

    public boolean isValidISBN(String ISBN){
        return true;
    }
}