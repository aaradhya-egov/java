public class Engineer extends Employee{
    public double benefits;

    public Engineer(String name, double base, double gratuity, long joining, double benefits) {
        super(name, base, gratuity, joining);
        this.benefits = benefits;
    }

    @Override
    public void displaysal(){
        double sa= benefits + super.base + super.gratuity;
        System.out.println("total salary is:" + sa);
    }
    @Override
    public  void displayrole(){
        System.out.println("i am an instance of engineer and i build stuff");
    }
}
