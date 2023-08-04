package collectoins_pratice;
import  java.lang.Comparable;

public class Employee implements Comparable {



    String name;
    int id;
    Employee(String name,int id){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return name+","+id;
    }

    @Override
    public int compareTo(Object o) {
        int eid1=this.id;
        Employee e=(Employee) o;
        int eid2=e.id;

        return eid1<eid2?-1:eid2>eid1?1:0;

       /* if(eid1<eid2)
        {
            return -1;
        } else if (eid1>eid2) {
            return 1;
        }
        else return 0;*/

    }
}
