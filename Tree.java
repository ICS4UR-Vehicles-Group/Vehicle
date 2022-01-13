public class Tree {
    TreeNode root;
    int height;
    
    
    public Tree() {
        this.root = null;
        this.height = 0;
    }

    public Tree (TreeNode r) {
        this.root = r;
        this.height = 1;
    }

    public void insert (Vehicle vehicle){
        if(this.root == null){
            this.root = new TreeNode(vehicle);
        }
        else {
            insertHelper(this.root, vehicle);
        }
    }

    public void insertHelper(TreeNode node, Vehicle vehicle) {
        if (vehicle.price < node.cargo.price) {
            if (node.lChild != null) {
                insertHelper(node.lChild, vehicle);
            } else {
                System.out.println("Inserted " + vehicle+ " to left of Node " + node.cargo);
                node.lChild= new TreeNode(vehicle);
            }
        } else if (vehicle.price > node.cargo.price) {
            if (node.rChild != null) {
                insertHelper(node.rChild, vehicle);
            } else {
                System.out.println("Inserted " + vehicle+ " to right of Node " + node.cargo);
                node.rChild = new TreeNode(vehicle);
            }
        }
    }

    public Vehicle element (TreeNode n) {
        return n.cargo;
    }

    public TreeNode root () {
        return root;
    }

    public TreeNode leftchild (TreeNode n) {
        return n.lChild;
    }

    public TreeNode rightChild (TreeNode n) {
        return n.rChild;
    }

    /**
     * Inorder (Left, Root, Right)
     */
    public void inOrder() {
        TreeNode current = this.root;

        if(current != null){
            inOrderHelper(current.lChild);
            System.out.println(current);
            inOrderHelper(current.rChild);
        }
    }

    private static void inOrderHelper (TreeNode temp) {
        if(temp != null) {
            inOrderHelper(temp.lChild);
            System.out.println(temp);
            inOrderHelper(temp.rChild);
        }
    }

    /**
     * Preorder (Root, Left, Right)
     */
    public void preOrder() {
        TreeNode temp = this.root;

        if(temp != null) {
            System.out.println(temp);
            preOrderHelper(temp.lChild);
            preOrderHelper(temp.rChild);
        }
    }
    private static void preOrderHelper (TreeNode temp) {
        if(temp != null) {
            System.out.println(temp);
            preOrderHelper(temp.lChild);
            preOrderHelper(temp.rChild);
        }
    }

    /**
     * Postorder (Left, Right, Root)
     */
    public void postOrder() {
        TreeNode temp = this.root;

        if(temp != null) {
            postOrderHelper(temp.lChild);
            postOrderHelper(temp.rChild);
            System.out.println(temp);
        }
    }

    private static void postOrderHelper(TreeNode temp) {
        if(temp != null) {
            postOrderHelper(temp.lChild);
            postOrderHelper(temp.rChild);
            System.out.println(temp);
        }
    }
}
