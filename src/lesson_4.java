import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class lesson_4 {

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map = new char[SIZE][SIZE];
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }
    private static int[] getNextCellToWin(char symbol) {
        for (int rowIndex = 0; rowIndex < map.length; rowIndex++) {
            for (int colIndex = 0; colIndex < map[rowIndex].length; colIndex++) {
                if (map[rowIndex][colIndex] == DOT_EMPTY && isGameMoveWinning(rowIndex, colIndex, symbol)) {
                    return new int[]{rowIndex, colIndex};
                }
            }
        }

        return null;
    }

    private static boolean isGameMoveWinning(int rowIndex, int colIndex, char symbol) {
        setCell(rowIndex, colIndex, symbol);
        boolean result = checkWin(symbol);
        setCell(rowIndex, colIndex, DOT_EMPTY);
        return result;
    }

    private static void setCell(int rowIndex, int colIndex, char symbol) {
        map[rowIndex][colIndex] = symbol;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    private static void aiTurn() {
        int[] cell = getNextCellToWin(DOT_O);
        if (cell == null) {
            cell = getNextCellToWin(DOT_X);
            if (cell == null) {
                cell = getRandomEmptyCell();
            }
        }
        int rowIndex = cell[0];
        int colIndex = cell[1];

        setCell(rowIndex, colIndex, DOT_O);
    }

    private static int[] getRandomEmptyCell() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (map[x][y] != DOT_EMPTY);

        return new int[] {x, y};
    }
    /*public static Random rand = new Random();
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }*/
   /* public static boolean checkWin(char symb) {
     if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
     if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
    if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
    if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
     if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
     if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
      if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }*/

   public static boolean checkWin(char symbol) {
       if (checkRowsAndCols(symbol)) {
           return true;
       } else {
           return checkDiagonals(symbol);
       }
   }

    public static boolean checkDiagonals(char symbol) {
        int firstDiagCounter = 0;
        int secondDiagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            firstDiagCounter = (map[i][i] == symbol) ? firstDiagCounter + 1 : 0;
            secondDiagCounter = (map[i][map.length - 1 - i] == symbol) ? secondDiagCounter + 1 : 0;
            if (firstDiagCounter == DOTS_TO_WIN || secondDiagCounter == DOTS_TO_WIN ) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRowsAndCols(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
                colCounter = (map[j][i] == symbol) ? colCounter + 1 : 0;
                if (rowCounter == DOTS_TO_WIN || colCounter == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}

