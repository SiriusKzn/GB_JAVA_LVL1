import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args){
        mass0to1();
        arrayTo100();
        arrayMultiply();
        squadArray();
        System.out.println(Arrays.toString(initialArray(10, 5)));
    }

    public static void mass0to1(){
        int[] array = new int[]{1,1,0,1,0,1,0,1,1,0,0};
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayTo100(){
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayMultiply(){
        int[] array = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void squadArray(){
        int s = 10;
        int[][] array = new int[s][s];
        for (int i = 0; i < s; i++){
            for(int j = 0; j < s; j++){
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < s; i++) {
            array[i][i] = 1;
            array[i][s - i - 1] = 1;
        }

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initialArray(int len, int initialValue){
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
}
