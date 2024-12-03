

class base{
    int x;
    int y;
    public  base(){
        System.out.println("i am constucter in base class");

    }
    public  base(int x){   //constructer with pera meter
        System.out.println("i am constucter in base class"+x);

    }


}
class drived extends base{
    int y;
    public drived(){
        System.out.println(" i am constructer of drived class");
    }
    public drived(int x ,int y){  //constructer with perametr 
        super(x);
        System.out.println(" i am constructer of drived class"+y);
        System.out.println(" i am constructer of drived class"+x);
    }

}

public class constructer_inheritance {

    public static void main(String[] args) {
        drived d= new drived(45,46);
        System.out.println(d);        

    }
}