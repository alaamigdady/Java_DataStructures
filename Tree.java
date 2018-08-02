public class Tree {
    Node root;

    private class Node {
        public int value;
        public Tree[] children=new Tree[5];
        public int counter=0;
    }

    public boolean addChild(int val) {
        //your code is here
          Tree child = new Tree();
          child.root.value=val;
          this.root.children[this.root.counter]=child;
          this.root.counter++;
          if(this.root.counter==this.root.children.size())
//        this. = new Tree.Node[child.counter];
//
//        child.value= val;
//        child.children[child.counter-1]= child;




    }

    public boolean contains(int val) {
        //your code is here
    }

    public void display() {
        //your code is here
    }

}
