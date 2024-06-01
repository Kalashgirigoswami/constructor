
class Kk{
    private  int l,b,h;
    public Kk()
    {
        l=10;
        b=9;
        h=7;
    }
    public void display()
    {
        System.out.println("length:"+l+"beadth:"+b+"heigth:"+h);
    }
    public  static void main(String args[])
    {
        Kk k1=new Kk();
        k1.display();
    }
}