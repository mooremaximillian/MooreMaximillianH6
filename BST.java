public class BST
{
  
  public BSTNode root;
  
  
  public BST()
  {
    root = null;
  }
  
  public boolean isEmpty()
  {
    return root == null;
  }
  
  public BSTNode getRoot()
  {
    return root;
  }
  
  public void insert(int data)
  {
    insert(root, data);
  }
   private void insert(BSTNode node, int data)
     {
       
      if(data <= node.getData())
      {
        if(node.getLeft() != null)
        {
        insert(node.getLeft(),data);
        }
      else
      {
        node.setLeft(new BSTNode(data));
      }
      }
      else
      {
        if(node.getRight() != null)
        {
          insert(node.getRight(), data);
        }
        else
        {
          node.setRight(new BSTNode(data));
        }
      }
     }
   
   public void search(int data)
  {
    search(root, data);
  }
   
   public BSTNode search(BSTNode root, int data)
{
    
    if (root==null || root.getData()==data)
        return root;
    
 
    
    if (root.getData() > data)
        return search(root.left, data);
 
    
    return search(root.right, data);
      
    
}
   
     
   
       
   
   public void inorder()
     {
         inorder(root);
     }
     private void inorder(BSTNode r)
     {
       if(r != null)
       {
         inorder(r.getLeft());
         System.out.println(r.getData());
         inorder(r.getRight());
       }
     }
     
     public void setRoot(int data){
         root = new BSTNode(data);
     }
}