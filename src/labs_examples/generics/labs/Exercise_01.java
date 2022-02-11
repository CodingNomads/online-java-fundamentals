package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 * <p>
 * 1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 * 2.) Create a few objects of your generic class with different data types to demonstrate its dynamic usage.
 */

class GenericTuple<TL, TR> {

    private TL left;
    private TR right;

    public GenericTuple(TL left, TR right) {
        this.left = left;
        this.right = right;
    }

    public TL getLeft() {
        return left;
    }

    public void setLeft(TL left) {
        this.left = left;
    }

    public TR getRight() {
        return right;
    }

    public void setRight(TR right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "GenericTuple{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

class GenericsLab1 {

    public static void main(String[] args) {

        GenericTuple<String, Integer> age = new GenericTuple<>("age", 18);
        GenericTuple<Integer, Integer> range = new GenericTuple<>(5, 20);

        System.out.println(age);
        System.out.println(range);

    }
}
