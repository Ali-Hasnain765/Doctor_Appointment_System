// Abstraction
public abstract class Patient{
    String name;
    String dep;

    private int visitamount;
    // Encapsulation
    public int getVisitamount()
    {
        return visitamount;
    }
    public void setVisitamount(int visitamount)
    {
        this.visitamount = visitamount;
    }
    void Doctordisplay()
    {
        System.out.println("Back To main Menu");
    }
    abstract void login();



}
