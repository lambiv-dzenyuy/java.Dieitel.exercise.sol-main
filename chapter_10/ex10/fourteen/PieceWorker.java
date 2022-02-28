package chapter_10.ex10.fourteen;

public class PieceWorker extends Employee{
    private double wage; // wage per piece sold
    private int pieces; // number of pieces of sold

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return wage*pieces;
    }

    @Override
    public String toString()
    {
        return String.format("Piece employee: %s%n%s: $%,.2f; %s: %,2d",
                super.toString(), "Wage per piece", getWage(),
                "pieces sold", getPieces());
    }
}
