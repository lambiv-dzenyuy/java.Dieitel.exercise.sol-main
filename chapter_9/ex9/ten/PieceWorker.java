

public class PieceWorker extends Employee{

    //calling Employee class constructor
    public PieceWorker(String firstName, String lastName, int socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    // calling Employee class toString method in PieceWorker
    public String toString(){
        return super.toString();
    }   
}