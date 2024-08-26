package main;

public class TareaUno {

    /**
     * Returns a random generated array with fixed size
     * 
     * @param size the size of the array result
     * @return the result array with random numbers
     */
    public static int[] generateList(int size) {
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        return list;
    }

    /**
     * Prints an array
     * 
     * @param list the array to print
     */
    public static void print(int[] list) {
        String data = "";
        for (int i : list) {
            data += i + ",";
        }
        System.out.println(data);
    }

    /**
     * This resolve the max value of the array, the minimun value and the sum of the
     * array.
     * Looks for the square root and its round and the pow
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] a = generateList(5);
        int m = a[0];
        int n = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (m > a[i]) {
                m = a[i];
            }
            if (n < a[i]) {
                n = a[i];
            }
            sum += a[i];

            int v = a[i];

            v = (int) (Math.sqrt(a[i]));
            System.out.println(a[i] + "     " + Math.pow(a[i], 2) + "     " + Math.round(v));
        }
        System.out.println("min" + "=" + m + " " + "max" + "=" + n + " " + "suma" + "=" + sum);
        System.out.println(getMax(a));
        System.out.println(getSum(a));
    }

    public static int getMax(int[] list) {
        int a = list[0];
        for (int i = 1; i < list.length; i++) {
            a = Math.max(a, list[i]);
        }
        return a;
    }

    public static int getSum(int[] list) {
        int a = list[0];
        for (int i = 1; i < list.length; i++) {
            a = Math.addExact(a, list[i]);
        }
        return a;
    }
}