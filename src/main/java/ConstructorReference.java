
interface  Inter{
    public Sample get();
}
class Sample
{
    Sample(){
        System.out.println("sampe class constructor execution");
    }
}


public class ConstructorReference {



/*when we should go for consructor references:-
* Classname::new*/

    public static void main(String[] args) {
        Inter i= Sample::new;
        i.get();

    }

}
