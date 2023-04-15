import java.util.*;

class aBST {
    public Integer[] Tree;

    public aBST(int depth) {
        int tree_size = 0;

        while (depth >= 0) {
            tree_size += (int) Math.pow(2, depth);
            depth--;
        }

        Tree = new Integer[tree_size];

        for (int i = 0; i < tree_size; i++) {
            Tree[i] = null;
        }
    }

    public Integer FindKeyIndex(int key) {
        if (Tree != null) {
            return FindKeyIndexRec(key, 0);
        }

        return null;
    }

    private Integer FindKeyIndexRec(int key, int i) {
        if (i >= Tree.length) {
            return null;
        }

        if (Tree[i] == null) {
            return -i;
        }

        if (Tree[i] == key) {
            return i;
        }

        if (key < Tree[i]) {
            return FindKeyIndexRec(key, 2 * i + 1);
        } else {
            return FindKeyIndexRec(key, 2 * i + 2);
        }
    }

    public int AddKey(int key) {
        Integer i = FindKeyIndex(key);

        if (i == null) {
            return -1;
        }

        if (Tree[0] == null) {
            Tree[0] = key;
            return 0;
        }

        if (i < 0) {
            Tree[-i] = key;
        }

        return -i;
    }
}
