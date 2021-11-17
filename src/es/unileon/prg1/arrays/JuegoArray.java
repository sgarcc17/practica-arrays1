package es.unileon.prg1.arrays;

public class JuegoArray {

    /**
     * Constructor for class JuegoArray
     */
    public JuegoArray() {
    }

    /**
     * Return the smallest of the numbers of a given array.
     * @param array An argument
     * @return The smallest of the numbers in the parameter array
     */
    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    /**
     * Return the greater of the numbers of a given array.
     * @param array An argument
     * @return The greatest of the numbers in the parameter array.
     */
    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    /**
     * Shows in console the value of each position of a given array.
     * @param array
     */
    public void showArrayValues(int[] array) {
        System.out.println("Valores del array introducido como parametro");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]: " + array[i]);
        }
    }
}