class Problem {

    public static void main(String[] args) {
        int result = 0;
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        switch (args[0]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }
        System.out.println(result);
    }
}