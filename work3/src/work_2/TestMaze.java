package work_2;

public class TestMaze {
    public static void main(String[] args) {
        MazeProblem.map = new int[][]{
                {0, 0, 0, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 1, 1, 1},
                {1, 0, 0, 1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 1, 1, 1, 0, 1},
                {1, 1, 0, 1, 1, 1, 1, 1},
        };
        MazeProblem.runMaze(0, 0, 7, 2);
        MazeProblem.show();
    }
}
