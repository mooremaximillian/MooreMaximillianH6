public class Main
{
 public static void main(String[] args) {
        BST bst = new BST();  
        bst.setRoot(10);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root data " + bst.getRoot().getData());
        bst.insert(6);
        bst.insert(8);
        bst.insert(7);
        bst.insert(3);
        bst.insert(9);
        System.out.println("Traversing tree in order");
        bst.inorder();
        System.out.println();
    } 
  
}