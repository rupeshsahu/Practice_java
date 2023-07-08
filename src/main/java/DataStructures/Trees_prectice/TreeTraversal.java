package DataStructures.Trees_prectice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TreeTraversal {

    public static void main(String[] args) {
        TreeNode treeNode4=new TreeNode(5,null,null);
        TreeNode treeNode5=new TreeNode(6,null,null);
        TreeNode treeNode6=new TreeNode(7,null,null);
        TreeNode treeNode7=new TreeNode(8,null,null);

        TreeNode treeNode2=new TreeNode(3,treeNode4,treeNode5);
        TreeNode treeNode3=new TreeNode(4,treeNode6,treeNode7);
        TreeNode treeNode1=new TreeNode(2,treeNode2,treeNode3);
        System.out.println("BFS of tree:-");
        traverseBFS(treeNode1);

        System.out.println("DFS of tree:-");
        traverseDFS(treeNode1);


    }


    public static void  traverseBFS(TreeNode root){
       // Comparator<TreeNode> c=(o1,o2)->o1.value<o2.value?-1:o1.value>o2.value?1:0;


        Queue<TreeNode> q = new PriorityQueue<>((o1,o2)->o1.value<o2.value?-1:o1.value>o2.value?1:0);
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            System.out.println(current.value);

            if (current.leftnode != null)
                q.offer(current.leftnode);

            if (current.rightnode != null)
                q.offer(current.rightnode);
        }


    }

    public static void traverseDFS(TreeNode root){

        if(root==null)
            return;

        System.out.println(root.value);
        traverseDFS(root.leftnode);
        traverseDFS(root.rightnode);



    }
}
