public class BinaryTreesYT {

    static class Node {
 
        int data;
 
        Node left;
 
        Node right;
 
 
        Node(int data) {
 
            this.data = data;
 
            this.left = null;
 
            this.right = null;
 
        }
 
    }
 
 
    static class BinaryTree {
 
        static int idx = -1;
 
        public  Node buildTree(int nodes[]) {
 
            idx++;
 
            if(nodes[idx] == -1) {
 
                return null;
 
            }
 
            Node newNode = new Node(nodes[idx]);
 
            newNode.left = buildTree(nodes);
 
            newNode.right = buildTree(nodes);
 
            return newNode;
 
        }
       
 
    }
    public static void preOrder(Node node){
        if(node == null)
           return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static void inOrder(Node node){
        if(node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
 
    // public static void Print(Node root){
    //     if(root == null)
    //         return;
    //     System.out.print(root.data+" ");
    //     Print(root.left);
    //     Print(root.right);
          
    // }
    public static void main(String args[]) {
 
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
 
        BinaryTree tree = new BinaryTree();
 
        Node root = tree.buildTree(nodes);
        System.out.print("preOrder ");
        preOrder(root);
        System.out.println();
        System.out.print("postOrder ");
        postOrder(root);
        System.out.println();
        System.out.print("inOrder ");
        inOrder(root);
        System.out.println();
        // Print(root);
        // System.out.println(root.data);
 
    }
}