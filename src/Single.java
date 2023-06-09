public class Single {
    private static Single Instance;
    private Single(){}

    public static synchronized Single getInstance() {
        if (Instance == null) {
            Instance = new Single();
        }
        return Instance;
    }
    public double Calculate(int x, int y){
        return 2.0 * x + 3.0 / y;
    }
}
