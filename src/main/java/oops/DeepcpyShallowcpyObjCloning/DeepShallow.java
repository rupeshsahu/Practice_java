package oops.DeepcpyShallowcpyObjCloning;

public class DeepShallow {

    int x;
    int y;

    public void display(){
        System.out.println( x+"  "+y);

    }
    public static void main(String[] args) {
        DeepShallow deep1 =new DeepShallow();
        deep1.x=10;
        deep1.y=20;
        System.out.println("Deep1 object display:");
        deep1.display();


        DeepShallow deep2=new DeepShallow();
        deep2.x=deep1.x;
        deep2.y= deep1.y;
        System.out.println("Deep2 object display:");
        deep2.display();

        deep2.x=100;
        deep2.y=200;
        System.out.println("Deep2 object display:");
        deep2.display();
        DeepShallow shallow1=deep1;
        System.out.println("Shallow1 object display:");
        shallow1.display();
        deep1.x=100;
        deep1.y=200;
        System.out.println("Shallow1 object display:");
        shallow1.display();
        shallow1.x=1000;
        shallow1.y=2000;

        System.out.println("Deep1 object display:");
        deep1.display();



    }

}
