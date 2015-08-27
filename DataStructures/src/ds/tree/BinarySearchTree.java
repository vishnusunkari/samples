package ds.tree;


class BinarySearchTree {

   private class BSTNode {
       public Comparable data;
       public BSTNode left;
       public BSTNode right;

       BSTNode(Comparable newdata) {
          data = newdata;
       }
   }

   private BSTNode root;

   public void insert(Comparable elem) 
   {
      root = insert(root, elem);
   }

   public boolean find(Comparable elem) 
   {
      return find(root,elem);
   }

   void delete(Comparable elem) 
   {
      root = delete(root, elem);
   }


   public void print() 
   {
      print(root);
   }

   boolean find(BSTNode tree, Comparable elem) 
   {
      if (tree == null)
         return false;
      if (elem.compareTo(tree.data) == 0) 
         return true;
      if (elem.compareTo(tree.data) < 0)
         return find(tree.left, elem);
      else
         return find(tree.right, elem);
   }

   Comparable minimum(BSTNode tree) 
   {
      if (tree == null)
         return null;
      if (tree.left == null)
         return tree.data;
      else
         return minimum(tree.left);
   }

   void print(BSTNode tree) 
   {
      if (tree != null) 
      {
         print(tree.left);
         System.out.println(tree.data);
         print(tree.right);
      }
   }

   BSTNode insert(BSTNode node, Comparable elem) 
   {
      if (node == null) 
      {
         return new BSTNode(elem);
      }
      if (elem.compareTo(node.data) < 0) 
      {
	  node.left = insert(node.left, elem);
	  return node;
      } 
      else 
      {
	  node.right = insert(node.right, elem);
	  return node;
      }
   }


   BSTNode delete(BSTNode tree, Comparable elem) 
   {
     if (tree == null) 
        return null;
     if (tree.data.compareTo(elem) == 0) 
     {
        if (tree.left == null)
	   return tree.right;
        else if (tree.right == null)
	   return tree.left;
        else 
        {
	   if (tree.right.left == null) 
           {
             tree.data = tree.right.data;
             tree.right = tree.right.right;
             return tree;
           } 
           else 
           {         
             tree.data = removeSmallest(tree.right);
             return tree;
            }
         }
      } 
      else  if (elem.compareTo(tree.data) < 0) 
      {
         tree.left = delete(tree.left, elem);
         return tree;
      } 
      else 
      {
         tree.right = delete(tree.right, elem);
         return tree;
      }
   }  
 
   Comparable removeSmallest(BSTNode tree) {
      if (tree.left.left == null) {
         Comparable smallest = tree.left.data;
         tree.left = tree.left.right;
         return smallest;
      } 
      else 
      {
         return removeSmallest(tree.left);
      }
   }
}



