
interface mycamera2{
    void takesnap();
    void recordvideo();
   private  void greet(){ //->defaul method
        System.out.println("hello sir");
    }
    default void recordvide4k(){ //->defaul method
        greet();//use private function
        System.out.println("recodeing 4k");
    }

}

interface mywifi2{
    String[] getnetwork();
    void cannect(String network);
}

class  mycellphone2{
    void callnumber(int number){
        System.out.println("calling.."+number);
    }
    void pick(){
        System.out.println("picked");
    }
}

class mysmartphone2 extends mycellphone2 implements mycamera2 ,mywifi2{


   public  void takesnap(){
        System.out.println("taking snap");
    }
    //@Override
    //public void recordvide4k() {  //defult method overrride 
      //  System.out.println("yes");
   // }
   public  void recordvideo(){
        System.out.println("video record");
    }
    public String[] getnetwork(){
            System.out.println("network list");
            String[] network={"herry","rkm","airtel"};
            return network;


    }
    public void cannect(String network){
          System.out.println("connecing ntwork"+network);
    }

}



public class polymor {
    public static void main(String[] args) {
        mycamera2 d= new mysmartphone2();
        d.takesnap();
        
    }
    
}
