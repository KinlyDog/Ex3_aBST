import java.util.*;

public class aBST {
    public Integer[] Tree;

    public aBST(int depth) {
        int tree_size = (int) Math.pow(2, depth);
        Tree = new Integer[tree_size];

        for (int i = 0; i < tree_size; i++) {
            Tree[i] = null;
        }
    }

    public Integer FindKeyIndex(int key) {

        return null;
    }

    public int AddKey(int key) {

        return -1;
    }

    public static void main(String[] args) {
        aBST bst = new aBST(10);


    }
}
