public class Invoice 
{
    private String partNUmber;//instance variable for the label of part
    private String description;//instance variable
    private int quantity=0; //instance variable
    private double pricePerItem=0.0;//instance variable

    public Invoice(String partNumber, String description, int quantity, double pricePerItem)
    {
        this.partNUmber = partNumber;//assign partNumber to instance variable partNumber
        this.description = description; //assign description to instance vairable description
        if (quantity > 0)
            this.quantity = quantity;//assign quantity to instance variable quantity
        if (pricePerItem > 0.0)
            this.pricePerItem = pricePerItem;//assign pricePerItem to instance variable pricePerItem

    }

    //method to set partNumber of object
    public void setPartNumber(String partNumber)
    {
        this.partNUmber = partNumber; //store partNumber
    }

    //method to get partNumber
    public String getPartNumber()
    {
        return partNUmber;//return value of partNumber to the caller
    }

    //method to set description
    public void setDescription(String description)
    {
        this.description = description; //store description
    }

    //method to get description
    public String getDescription()
    {
        return description; //return value description to the caller
    }

    //method to set quantity
    public void setQuantity(int quantity)
    {
        if (quantity > 0)
            this.quantity = quantity; //store quantity
    }

    //method to get quantity
    public int getQuantity()
    {
        return quantity; //return value quantity to the caller
    }

    //method to set the pricePeritem
    public void setPricePerItem(double pricePerItem)
    {
        if (pricePerItem > 0)
            this.pricePerItem = pricePerItem; //store the pricePerItem
    }

    //method to get the the priceperitem
    public double getPricePerItem()
    {
        
        return pricePerItem; //return pricePerItem to the caller
    }

    //method to get invoice amount
    public double getInvoiceAmount()
    {
        double total=pricePerItem * quantity;//evaluates the cost of that part wuantity
        return total; //return value total to caller
    }


    
}
