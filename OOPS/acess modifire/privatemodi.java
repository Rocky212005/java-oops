    

class Employee1{
   private String name;
   private int Id;

   public void setname(String n){   //setter 
         name=n;
   }
   public String getname(){       //getter
      return name;
}

  public void  setId(int i){
        Id=i;
  }
  public int getId(){
    return Id;
  }



    

}





public class privatemodi {
    public static void main(String[] args) {
        Employee1 rk=new Employee1();
        rk.setname("rahul");
        rk.setId(223);
        System.out.println(rk.getId());
        System.out.println(rk.getname());
    }
    
}
