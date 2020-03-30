public class ArrayTraining {


	
    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
	
    public int[] emptyIntArray(int n) {
        
        int[] array = new int[n];
        return array;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
        String[] array = new String[n];
        return array;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
        int[] array = {a,b,c};
        return array;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return a String array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
        String [] array = {a,b,c};
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {

        return array.length;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {

        return array[0];
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {

        return array[-1];
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {

        return array[position];
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
        array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6 
     */
    public int sum(int[] array) {
        //methode foreach
        int sum=0;
        
        for (int value:array){
            sum= sum+value;
        }
            
        
        return sum;
        //ou
        //int sum = 0;
        //for (int i = 0; i < value.length ; i++) {
            //sum= sum + value[i];
        //}
        //return sum;

    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
        for (int i=0;i<array.length;i++){
            if (array[i] == search){
                return true;
            }
        }

        return false;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"} 
     */
    public String[] capitalize(String[] array) {
        for (int i=0;i<array.length;i++){
            array[i]=array[i].substring(0,1).toUpperCase() + array[i].substring(1);
        }
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false BBBBBBBB
     */
    public boolean equals(int[] first, int[] second) {
        for (int i=0; i<first.length;i++) {
            while (first[i]!=second[i]){
                return false;
            }
            
        }
        return true;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
        for (int i = 0; i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]= temp;
            
        }
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    public int[] concat(int[] first, int[] second) {
        int[] concat= new int[first.length + second.length];
        for (int i=0; i<first.length;i++){
            concat[i]=first[i];
        }
        for (int i=0; i<concat.length-first.length;i++){
            concat[i-first.length]=second[i];
        }
        return concat;
    }
    /**
     * @param values, eg: {"a", "b", "c"}
     * @return the concatenation of all values values, eg: "abc"
     */
    public static String concat(String[] values) {
        String concat = "";
        for (int i = 0 ; i < values.length; i++) {
            concat = concat + values[i];
        }
        return concat;
    }

    /**
     * @param values, eg: {1, 3, 5}
     * @return if the array contains an even value, eg: false
     */
    public static boolean hasEven(int[] values) {
        for (int i = 0; i< values.length; i++) {
            if (values[i]%2 == 0){
                return true;
            }
        }
        return false;
    }

    /**
     * @param values, eg: {1, 2, 3}
     * @param search, eg: 2
     * @return the index of the searched value or -1 if the value isn't present, eg: 1
     */
    public static int indexOf(int[] values, int search) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == search ) {
                return i;
            }
        }
        return -1;
    }

     /**
     * @param values, eg: {1, 2, 3, 1, 2}
     * @param search, eg: 2
     * @return how many times the searched value occurred, eg: 2
     */
    public static int count(int[] values, int search) {
        return 0;
    }

    /**
     * @param values, eg: {1, 2, 3}
     * @param increment, eg: 2
     * @return add the increment to each value of the array, eg: {3, 4, 5}
     */
    public static int[] incrementEach(int[] values, int increment) {
        return null;
    }

}
