
class mainEmp{

    private String name;
   private  int Id;
    public mainEmp(){

       name= "rahul";
        Id=23;
    }
    public mainEmp(int Id,String name){
        System.out.println(name);
        System.out.println(Id);
    }
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
}


public class constructer {


    public static void main(String[] args) {

        mainEmp rk= new mainEmp(34,"rahul");
       // System.out.println(rk.getname());
        

    }
}