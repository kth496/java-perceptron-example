public class Perceptron {
    private double lr; // learning rate
    private double[] weight;
    private int num_iter;

    public Perceptron(double lr, int num_iter) {
        this.lr = lr;
        this.weight = new double[]{0, 0, 0};
        this.num_iter = num_iter;
    }

    public void fit(int[][] X, int[] Y) {
        for (int i = 0; i < num_iter; i++) {
            train(X, Y);
        }
    }

    public void train(int[][] X, int[] Y) {
        for (int i = 0; i < X.length; i++) {
            int y_hat = predict(new int[][]{X[i]})[0];
            int delta = Y[i] - y_hat;
            weight[0] += lr * delta;
            for (int j = 0; j < 2; j++) {
                weight[j + 1] += (lr * delta * X[i][j]);
            }
        }
    }

    public int[] predict(int[][] X) {
        int[] result = new int[X.length];
        for (int i = 0; i < X.length; i++) {
            double y_hat = weight[0];
            for (int j = 0; j < 2; j++) {
                y_hat += weight[j + 1] * X[i][j];
            }
            result[i] = activation_step(y_hat);
        }
        return result;
    }

    public int activation_step(double v) {
        if (v > 0) return 1;
        return 0;

    }
}
