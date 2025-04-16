



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

        inorder(root);
     
    }
    
   
    
    
}
