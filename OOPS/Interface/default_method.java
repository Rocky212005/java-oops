/*default method->  drfault method is define in interface and use direct by object not in any class  but override in class 
 private method -> this method use in default method.

 * 
*/



interface mycamera{
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

interface mywifi{
    String[] getnetwork();
    void cannect(String network);
}

class  mycellphone{
    void callnumber(int number){
        System.out.println("calling.."+number);
    }
    void pick(){
        System.out.println("picked");
    }
}

class mysmartphone extends mycellphone implements mycamera ,mywifi{


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

public class default_method {
    public static void main(String[] args) {
        
        mysmartphone sh=new mysmartphone();
        sh.recordvide4k();

    }
}
