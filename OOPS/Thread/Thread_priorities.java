
/*
 * thread prorities are three type
 *    1. MAX_PRIORITIES
 *    2. NORMAL_PRIORITIES
 *    3. MIN_PRIORITIES
 */

class mythr2 extends Thread{

    public mythr2(String name){
        super(name);
    }
    public void run(){
        int i=6;
        while(i>0){

        
          System.out.println("the name is "+this.getName());
          i--;
        }
    }



}



public class Thread_priorities {

    public static void main(String[] args) {
        mythr2 t1=new mythr2("rkm ");
        mythr2 t2=new mythr2("mishra ");
        mythr2 t3=new mythr2("rocky");
        mythr2 t4=new mythr2("ram");

        
        //set priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        
        
    }
}