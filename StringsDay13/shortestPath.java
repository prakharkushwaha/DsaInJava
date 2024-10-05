public class shortestPath {
    public static int getShortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'W') {
                x = x - 1;
            } else if (dir == 'E') {
                x = x + 1;
            } else if (dir == 'N') {
                y = y + 1;
            } else
                y = y - 1;

        }
        int x1 = x * x;
        int y1 = y * y;
        return (int) Math.sqrt(x1 + y1);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int result = getShortestPath(str);
        System.out.println(result);

    }

}
