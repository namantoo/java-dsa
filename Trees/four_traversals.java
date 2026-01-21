
import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    public void inorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }
    public void preorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        result.add(root.val);
        preorder(root.left, result);
        preorder(root.right, result);
    }
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }
    public void postorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
    public List<List<Integer>>levelorderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++){
                  TreeNode curr = q.remove();
                  temp.add(curr.val);
                  if(curr.left != null){
                      q.add(curr.left);
                  }
                  if(curr.right != null){
                      q.add(curr.right);
                  }
            }
            result.add(temp);
        }
        return result;
    }
}
class Main {
    public static void main(String[] args) {
      /*
                10
               /  \
              5    15
             / \     \
            3   8     20
                 \
                  9
        */

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        root.right.right = new TreeNode(20);
        
        Solution sol = new Solution();
        List<Integer> inorder = sol.inorderTraversal(root);
        List<Integer> preorder = sol.preorderTraversal(root);
        List<Integer> postorder = sol.postorderTraversal(root);
        List<List<Integer>> levelorder = sol.levelorderTraversal(root);
        
        
         System.out.println(inorder); 
          System.out.println(preorder); 
           System.out.println(postorder); 
                   System.out.println(levelorder); 
    }
}
