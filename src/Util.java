public class Util {
    public static void sort(Comparable [] arr) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(arr[j].compare(arr[j+1]) == 1) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
