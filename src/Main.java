public class Main {
    public static void main(String[] args) {
       System.out.println("d");
       Employee x = new Employee("abc",80000, 1000,25082005);
       x.displaysal();;
       x.displayrole();

       Engineer y = new Engineer("xyz",80000,1000,2897989,9000);
       y.displaysal();;
       y.displayrole();
       System.out.println();
    }
}