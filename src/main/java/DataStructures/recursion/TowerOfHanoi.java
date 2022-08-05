package DataStructures.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        move(3,'A','C','B');

    }

    public static void move(int n,char a,char c,char b){
        if(n==1){
            System.out.println("Moving disc "+n+" from "+a+" to "+c);
        }
        else {
            move(n - 1, a, b, c);
            System.out.println("Moving disc " + n + " from " + a + " to " + c);
            move(n - 1, b, c, a);
        }
    }
}
