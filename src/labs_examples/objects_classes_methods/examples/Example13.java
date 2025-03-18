package labs_examples.objects_classes_methods.examples;

/*
   Demonstrate garbage collection and the finalize() method.
*/

class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // called when object is recycled
    @Override
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    // generates an object that is immediately destroyed
    void generator(int i) {
        FDemo o = new FDemo(i);
    }

}

class Finalize {
    public static void main(String args[]) {
        int count;

        FDemo ob = new FDemo(0);

    /* Now, generate a large number of objects.  At
       some point, garbage collection will occur.
       Note: you might need to increase the number
       of objects generated in order to force
       garbage collection. */

        for(count=1; count < 100000; count++)
            ob.generator(count);
    }
}
