package snackbar;

public class Snacks
{
    // fields - attributes
    // value of all fields together -> state of the object

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;

    // constructor
    public Snacks(String name, double cost, int quantity, int vendid)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendId = vendId;
    }

    // methods / behaviors - getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    // methods
    public void addQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
    }
}