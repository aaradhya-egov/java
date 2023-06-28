import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Employee {
    private String name;
    protected   double base;
    protected double gratuity;
    private long joining;

    public Employee(String name, double base, double gratuity, long joining) {
        this.name = name;
        this.base = base;
        this.gratuity = gratuity;
        this.joining = joining;
    }
     public void displaysal(){
        double sal= base+gratuity;
         System.out.println("total salary is:" + sal);
     }
     public void displayrole(){
        System.out.println("i am an instance of type employee, i can do anything");
     }
}
