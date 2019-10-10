package app;

class Train{
    int mileageX;
    int mileageY;
    int mileageZ;
    int fuel;
    public Train()
    {
        mileageX=0;
        mileageY=0;
        mileageZ=0;
        fuel=10;
    }
    public void Run(){
        mileageY+=1;
        fuel-=1;
    }
    public void Jump(){
        mileageZ+=2;
        fuel=-2;
    }
    public void RunAround(){
        mileageX+=1;
        fuel-=-2;
    }
    public void refuel(){
        fuel=10;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("乗りたい乗り物");
    }
}