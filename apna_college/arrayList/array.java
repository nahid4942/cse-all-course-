public class array {

    public static void zigzag(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.print(matrix[i][j] + "-->");

                }

            }
            System.out.println(" ");

        }

    }

    public static void matrix(String matrix[][]) {
        String temp[] = new String[6];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                temp[row] = matrix[row + 1][col];

                matrix[row + 1][col] = matrix[row][col];

            }

            System.out.println(" ");

        }

    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        String arr2[][] = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        matrix(arr2);

    }
}
