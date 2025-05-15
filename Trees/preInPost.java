import java.util.*;



public class preInPost {
    public static class Node{

        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
    public static void preorder(Node root){
        // preorder is root left right
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val);

    }
    public static void nthLevel(Node root, int level){
        
        if (root == null) {
            return;
        }

        if (level == 1) {
            System.out.print(root.val + " ");
            return;
        }


        nthLevel(root.left, level - 1);
        nthLevel(root.right, level - 1);
    }
    public static void bfs(Node root){
        Queue<Node> q =  new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            System.out.print(temp.val + " ");
            q.remove();
        }

    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);

        root.left = a;
        root.right = b;

        Node c= new Node(6);
        Node d = new Node(5);

        a.left = c;
        a.right = d;

        Node e = new Node(11);
        Node f = new Node(4);


        b.right = e;
        e.left = f;

        // inorder(root);
        // nthLevel(root, 5); '
        bfs(root);
     
    }
    
   
    
    
}
