//Abstrct class--> abstact class which class with help of abstract class makes sub class whith abstact keyword 
//abstract method--> a method declered without implementation

 abstract class perent{
      public perent(){
        System.out.println(" i am constrcter of perent class");
      }
      public void hello(){
        System.out.println("hello");
      }

      abstract public void greet();  //abstract method
}

class chiled extends perent{
   @Override
    public void greet(){                   //override abstrct method
        System.out.println("hello sir");
    }
}
/*  class chiled2 extends perent{   ---->this not allowed because this class extend perent then perent classs is abstrct class so this case if are chiled class override abstrct method or define youself abstrct class
    

    public  void wishme(){
        System.out.println("good mornning sir");
    }
 }
    */
    abstract  class chiled2 extends perent{   //-->this is allowed
        public void wishme(){
            System.out.println("good mornning sir");
        }
    }








public class AbstractClass {

    public static void main(String[] args) {
    //   perent d=new perent(); not allowed because perent class is abstrct class
        chiled d=new chiled(); //-.allowed 
      
        
    }
}