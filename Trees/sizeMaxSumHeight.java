
public class sizeMaxSumHeight {

    //global variable
    static int size = 0;
    public static class Node{

        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + "->");
        if(root.left != null){
            System.out.print(root.left.val + ",");
        }
        if(root.right != null){
        System.out.print(root.right.val);
        }
        System.out.println("");
        display(root.left);
        display(root.right);
    }

    public static void preorder(Node root){
        if(root == null) return;

        size++;
        preorder(root.left);
        preorder(root.right);
        
    }
    public static int size(Node root){

        if(root == null){
            return 0;
        }

        return 1 + size(root.left) + size(root.right); 
    }
    public static int sum(Node root){

        if(root == null){
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right); 
    }
    public static int maxNode(Node root){

        if(root == null){
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = maxNode(root.left);
        int c = maxNode(root.right);
        return Math.max(a, Math.max(b,c)); 
    }
    public static int height(Node root){

        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
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

        display(root);  
        System.out.println("");
        preorder(root);
        System.out.println(size);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(maxNode(root));
        System.out.println(height(root));
    }
    
   
    
}
