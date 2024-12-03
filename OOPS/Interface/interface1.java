/*  Interfaces-> interface is a group of method with empty body
   what should be allowed in interface->
     1. creting mutiple interface and implement one class
     2. creting properties in interface.
     
 *   what should not allowed->
 *    1. dose not overrride interface method.
 *    2. dose not chenge interface properties.
 *    3. not use public in define interfce method but public keyword use n define interface method in class
 * 
 */


interface bicycle{
    int a=23;   //properties

    void speed(int increment);
    void breack(int decrement);
}


class herocycle implements bicycle{


    public void speed(int increment){
        System.out.println(increment);
    }
    public void breack(int decrement){
        System.out.println(decrement);
    }


}


public class interface1 {
    public static void main(String[] args) {
        herocycle d= new herocycle();
        d.speed(23);
        d.breack(99);
        System.out.println(d.a);
        
    }
}
