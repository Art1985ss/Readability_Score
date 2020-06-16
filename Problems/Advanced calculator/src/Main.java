/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] arr = new int[0];
        try {
            arr = toInt(args);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        int result = 0;
        switch (operator) {
            case "MAX":
                result = Integer.MIN_VALUE;
                for (int element : arr) {
                    result = Math.max(result, element);
                }
                break;
            case "MIN":
                result = Integer.MAX_VALUE;
                for (int item : arr) {
                    result = Math.min(result, item);
                }
                break;
            case "SUM":
                for (int value : arr) {
                    result += value;
                }
                break;
            default:
        }
        System.out.println(result);
    }

    public static int[] toInt(String[] args) {
        int[] arr = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            arr[i - 1] = Integer.parseInt(args[i]);
        }
        return arr;
    }
}