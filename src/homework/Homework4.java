package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static char human = 'X';
    public static char ai = 'O';
    public static char emptyField = '•';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int mapSizeX;
    public static int mapSizeY;

    public static int winLength;
    public static char[][] map;

    public static void initMap() {
        mapSizeX = 5;
        mapSizeY = 5;
        winLength = 4;
        map = new char[mapSizeY][mapSizeX];

        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                map[i][j] = emptyField;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");
        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " " : i / 2 + 1);
        }
        System.out.println();

        for (int i = 0; i < mapSizeY; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < mapSizeX; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.print(i + 1);
            System.out.println();
        }

        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Enter your coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        map[y][x] = human;
    }

    public static void aiTurn() {
        if (turnAIWinCell()) {
            return;
        }
        if (turnHumanWinCell()) {
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        map[y][x] = ai;
    }

    public static boolean turnAIWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = ai;
                    if (checkWin(ai)) {
                        return true;
                    }
                    map[i][j] = emptyField;
                }
            }
        }
        return false;
    }

    public static boolean turnHumanWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = human;
                    if (checkWin(human)) {
                        map[i][j] = ai;
                        return true;
                    }
                    map[i][j] = emptyField;
                }
            }
        }
        return false;
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < mapSizeX; i++) {
            for (int j = 0; j < mapSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, player)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, winLength, player)) {
                    return true;
                }
                if (checkLine(i, j, 0, 1, winLength, player)) {
                    return true;
                }
                if (checkLine(i, j, 1, -1, winLength, player)) {
                    return true;
                }
            }
        }
        return false;
    }

    // проверка линии
    public static boolean checkLine(int x, int y, int vX, int vY, int len, char player) {

        int endX = x + (len - 1) * vX;
        int endY = y + (len - 1) * vY;
        if (!isValidCell(endX, endY)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vY][x + i * vX] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFullMap() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (map[i][j] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == emptyField;
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(human)) {
                System.out.println("Человек выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
            System.out.println();
            aiTurn();
            printMap();
            if (checkWin(ai)) {
                System.out.println("Компьютер выиграл!!!");
                break;
            }
            if (isFullMap()) {
                System.out.println("Ничья");
                break;
            }
        }
    }
}

/**
 * 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
 * 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
 * 3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
 * 4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */