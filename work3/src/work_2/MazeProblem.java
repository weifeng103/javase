package work_2;

public class MazeProblem {
    static Stack stack = new Stack();
    static Stack tempStack = new Stack();
    static int[][] modifiedMap;
    static int[][] map;

    public static void runMaze(int startY, int startX, int endY, int endX) {
        modifiedMap = new int[map.length + 2][map[0].length + 2];
        for (int i = 0; i < modifiedMap.length; i++) {
            for (int j = 0; j < modifiedMap[0].length; j++) {
                if (j == 0 || j == modifiedMap[0].length - 1 || i == 0 || i == modifiedMap.length - 1) {
                    modifiedMap[i][j] = 1;
                } else if (i != modifiedMap.length - 1 && j != modifiedMap[0].length - 1) {
                    modifiedMap[i][j] = map[i - 1][j - 1];
                }
            }
        }
        int[] y = {-1, 0, 1, 0};
        int[] x = {0, 1, 0, -1};
        stack.push(new Node(startY + 1, startX + 1));
        modifiedMap[startY + 1][startX + 1] = 2;
        while (!stack.isEmpty()) {
            Node cur = stack.peek();
            if (cur.y == endY + 1 && cur.x == endX + 1) {
                printResult();
                System.out.println("-----------------");
                break;
            }
            int i;
            for (i = 0; i < 4; i++) {
                int row = cur.y + y[i];
                int column = cur.x + x[i];
                if (modifiedMap[row][column] == 0) {
                    stack.push(new Node(row, column));
                    modifiedMap[row][column] = 2;
                    break;
                }
            }
            if (i == 4) {
                cur = stack.pop();
                modifiedMap[cur.y][cur.x] = -1;
            }
        }
    }

    public static void show() {
        while (stack.top != stack.base) {
            tempStack.push(stack.pop());
        }
        while (tempStack.top != tempStack.base) {
            System.out.println(tempStack.pop());
        }
    }

    public static void printResult() {
        for (int i = 1; i < modifiedMap.length - 1; i++) {
            for (int j = 1; j < modifiedMap[i].length - 1; j++) {
                if (modifiedMap[i][j + 1] == -1) {
                    System.out.print(modifiedMap[i][j] + " ");
                } else {
                    System.out.print(modifiedMap[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}

