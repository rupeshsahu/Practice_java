package collectoins_pratice;

public class temp {

    int i;
    temp(int i ){
        this.i=i;
    }
    public int hashCode(){
        return i%9;
    }
    public String toString(){
        return i+"";
    }
}
