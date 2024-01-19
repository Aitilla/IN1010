

public class person {
    String pObject;
    bil3 myCar;

    public person(String pObject, bil3 myCar){
        this.pObject = pObject;
        this.myCar = myCar;
    }

    public void call(){
        myCar.call();
    }

    public void personName(){
        System.out.println("My name is " + pObject + ". My car is:");
    }
}
