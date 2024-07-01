public class Main {
    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        int[] elements = {20, 15, 25, 10, 5, 1};

        for (int element : elements) {
            rbt.insert(element);
        }

        rbt.printTree();
    }
}
