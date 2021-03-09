package ParveenKaur_C0793411_Classwork;

public class activity {
    public static void main(String[] args) {
        int[] array = {25, 11, 19, 36, 12, 2, 44, 34, 84, 66};
        System.out.print("Array in correct order: ");
        for (int p : array) {
            System.out.print(p + "  ");
        }

        System.out.print("\n\nArray in reverse order: ");
        for (int p = array.length - 1 ; p >= 0 ; p-- )  {
            System.out.print(array[p] + "  ");
        }

        System.out.print("\n\nArray in ascending order: ");
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(array[i] < array[j]){
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        for (int p : array) {
            System.out.print(p + "  ");
        }

        System.out.print("\n\nArray in descending order: ");
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(array[i] > array[j]){
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        for (int p : array) {
            System.out.print(p + "  ");
        }

        System.out.print("\n\nDisplaying only odd elements: ");
        for(int p: array){
            if(p % 2 != 0){
                System.out.print(p +"  ");
            }
        }

        System.out.print("\n\nDisplaying only even elements: ");
        for(int p: array){
            if(p % 2 == 0){
                System.out.print(p +"  ");
            }
        }

        System.out.print("\n\nSum of all elements: ");
        int total = 0;
        for(int p: array){
            total += p;
        }
        System.out.println(total);
    }
}

