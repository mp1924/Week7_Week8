public class Heights {

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr)
            if (x < m) m = x;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr)
            if (x > m) m = x;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 100) + 150;
        }

        System.out.println("Mean = " + (sum(heights) / heights.length));
        System.out.println("Min = " + min(heights));
        System.out.println("Max = " + max(heights));
    }
}
