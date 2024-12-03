

class Employee2{
    int id;
    
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

  
}
public class cwh {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee2 harry = new Employee2(); // Instantiating a new Employee Object
        Employee2 john = new Employee2(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        
        harry.name = "CodeW";

        // Setting Attributes for John
        john.id = 17;
      
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
     
       
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
