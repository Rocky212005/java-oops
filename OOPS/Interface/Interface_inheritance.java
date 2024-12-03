
interface sample{
    void math1();
   void  math2();

}
interface smaple2 extends sample{
    void   math3();
     void math4();
}

class hello implements smaple2{
          
   public void   math1(){
        System.out.println("hello");
      }
      public void   math2(){
        System.out.println("hello");
      }
      public void   math3(){
        System.out.println("hello");
      }
      public void   math4(){
        System.out.println("hello");
      }
}







public class Interface_inheritance {
    public static void main(String[] args) {
        hello d=new hello();
        d.math1();
    }
    
}
