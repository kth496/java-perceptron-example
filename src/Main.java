public class Main {
    public static void main(String[] args) {
        int[][] X = new int[][]{
                {0, 0}, {0, 1}, {1, 0}, {1, 1},
        };

        int[] AND_Y = new int[]{
                0, 0, 0, 1
        };

        int[] OR_Y = new int[]{
                0, 1, 1, 1
        };

        int[] NAND_Y = new int[]{
                1, 1, 1, 0
        };

        int[] XOR_Y = new int[]{
                1, 1, 1, 0
        };

        Perceptron AND_model = new Perceptron(0.1, 200);
        AND_model.fit(X, AND_Y);
        int[] predict = AND_model.predict(X);
        System.out.println("AND");
        for (int e : predict) System.out.print(e + " ");
        System.out.println('\n');

        Perceptron OR_model = new Perceptron(0.1, 200);
        OR_model.fit(X, OR_Y);
        predict = OR_model.predict(X);
        System.out.println("OR");
        for (int e : predict) System.out.print(e + " ");
        System.out.println('\n');

        Perceptron NAND_model = new Perceptron(0.1, 200);
        NAND_model.fit(X, NAND_Y);
        predict = NAND_model.predict(X);
        System.out.println("NAND");
        for (int e : predict) System.out.print(e + " ");
        System.out.println('\n');

        Perceptron XOR_model = new Perceptron(0.1, 200);
        XOR_model.fit(X, XOR_Y);
        predict = XOR_model.predict(X);
        System.out.println("XOR");
        for (int e : predict) System.out.print(e + " ");
        System.out.println('\n');
    }
}
