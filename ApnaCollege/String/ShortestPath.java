package ApnaCollege.String;

public class ShortestPath {

    public static float getShortestPath(String Path) {

        int x = 0, y = 0;

        for (int i = 0; i < Path.length(); i++) {

            char dir = Path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }
            // North
            if (dir == 'N') {
                y++;
            }
            // East
            if (dir == 'E') {
                x++;
            }
            // West
            if (dir == 'W') {
                x--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String Path = "WNEENESENNN";
        System.out.println(getShortestPath(Path));
    }

}
