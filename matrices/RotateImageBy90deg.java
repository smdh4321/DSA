package matrices;

public class RotateImageBy90deg {
    static void rotateImage(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            int t = arr.length - 1;
            for(int j = 0; j < arr[i].length / 2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][t];
                arr[i][t] = temp;
                t--;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage(arr);
    }
}
