//Inheritance
public class Doctor extends Patient {
    //Constructor
    Doctor(String name,String dep)
    {
        this.name = name;
        this.dep = dep;
    }

    void Doctordisplay()
    {

        System.out.println("Name: "+name);
        System.out.println("Dep: "+dep);
        System.out.println("Visit: "+getVisitamount()+"Taka");
        System.out.println("_______________________________");
    }

    @Override
    void login() {

    }

}
