public class TreeNode {
    Vehicle cargo;
    TreeNode lChild, rChild;

    public TreeNode (Vehicle c) {
        this.cargo = c;
        this.lChild = null;
        this.rChild = null;
    }

    public TreeNode (Vehicle c, TreeNode l, TreeNode r) {
        this.cargo = c;
        this.lChild = l;
        this.rChild = r;
    }

    public String toString()
    {
        String s = this.cargo + "";
        return s;
    }

    public boolean isEquals (TreeNode that) {
        if(this.cargo == that.cargo && this.lChild == that.lChild && this.rChild == that.rChild){
            return true;
        }
        return false;
    }
}
