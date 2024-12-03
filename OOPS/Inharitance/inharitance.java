


class  base{
    int x;

    public void setX(int n){
        x=n;
        
    }

    public int  getX(){
        System.out.println("this is set x");
        return x;
    }

}

class  drived extends base{

    int y;
    
    public void sety(int n){
        y=n;
        
    }

    public int  gety(){
        System.out.println("this is set y");
        return y;
    }
    
}
public class inharitance {
    public static void main(String[] args) {
        drived b=new drived();
        b.setX(23);
        b.sety(44);
        System.out.println(b.getX());
        System.out.println(b.gety());
        
    }
}
