// Implement Multiple Inheritance using interface
interface Shop{
    void name();
}
interface Owner{
    void own();
}
class  Store implements Shop, Owner{
    public void name()
    {
        System.out.println("Shop name is Only.");
    }
    public void own()
    {
        System.out.println("Owner is Reena.");
    }
}
public class Interface {
    public static void main(String[] args){
        Store s = new Store();
        s.name();
        s.own();
    }
}