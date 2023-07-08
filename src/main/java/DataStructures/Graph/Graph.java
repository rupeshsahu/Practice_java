package DataStructures.Graph;

import java.util.ArrayList;

public class Graph {
    int v;
    ArrayList<ArrayList<Integer>> adjacentList;

    public Graph(int v){
        this.v=v;
        this.adjacentList=new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adjacentList.add(new ArrayList<>());
        }
    }
    public void addEdge(int source,int destination){
        adjacentList.get(source).add(destination);
        adjacentList.get(destination).add(source);
    }

    public void printGraph(){
        for(int i=0;i<v;i++){
            System.out.println("Vertex "+i+" is connected to");
            for(int j:adjacentList.get(i)){
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int v=5;
        Graph graph=new Graph(v);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }




}
