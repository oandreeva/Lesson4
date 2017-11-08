package by.htp.lesson4;

public class Task4 {

	public static void main(String[] args) {

        int[][] da = new int[6][4];
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                da[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Прямой порядок: \n");
        printArr(da);

        int[] reserve = new int[da[1].length];
        reserve = da[1];
        da[1] = da[2];
        da[2] = reserve;

        
        System.out.println("Обратный порядок: \n" );
        printArr(da);

    }

    private static void printArr(int[][] da) {
        for (int i = 0; i < da.length; i++) {
            for (int j = 0; j < da[i].length; j++) {
                System.out.print(da[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
