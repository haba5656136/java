
import java.util.Arrays;

/**
 * расставить 8 ферзей на доске что бы не били друг друга
 */
public class QueensProblem {
  public static void main(String[] args) {
    QueensProblem QueenP1 = new QueensProblem();
    QueenP1.findSolution(1); // аргумент кол-во решений после которого останавливаться, 0 - вывод и поиск
                             // всех решений

  }

  /*
   * общие переменные, занятости общий размер поля,
   * занимаемые Ферзями колонки (так как выставляем построчно),
   * занятые колонки,
   * занятые диагонали прямые,
   * занятые диагонали обратные,
   * номер решения
   */
  public static int size = 8;
  private int[] queensPositions;
  private Boolean[] occupiedCols;
  private Boolean[] occupiedDi1;
  private Boolean[] occupiedDi2;
  private int count = 0;

  // создание класса и формирование базовых перменных
  public QueensProblem() {
    // size = N;
    queensPositions = new int[size];
    occupiedCols = new Boolean[size];
    occupiedDi1 = new Boolean[2 * size - 1];
    occupiedDi2 = new Boolean[2 * size - 1];
    Arrays.fill(queensPositions, 0);
    Arrays.fill(occupiedCols, false);
    Arrays.fill(occupiedDi1, false);
    Arrays.fill(occupiedDi2, false);
  }

  // устанавливаем занято/освобождено
  private void setOccupation(int rowIdx, int colIdx, Boolean status) {
    occupiedCols[colIdx] = status;
    occupiedDi1[rowIdx + colIdx] = status;
    occupiedDi2[rowIdx - colIdx + size - 1] = status;
  }

  // печатаем найденое решение
  private void printSolution() {

    System.out.println("Найдено " + count + " решение:");

    for (int i = 0; i < size; i++) {

      System.out.println(i + 1 + " Ферзь на позиции: " + i + ", " + queensPositions[i] + " |");
    }

    System.out.println();

    // System.out.println(arr[i][queensPositions[i]]);

  }

  // проверяем занятость
  private Boolean isOccupied(int row, int col) {
    if (occupiedCols[col] || occupiedDi1[row + col] || occupiedDi2[row - col + size - 1]) {
      return true;
    }
    return false;
  }

  // ставим Ферзей, методом поиска с возвратом
  private void placing(int row, int limit) {
    for (int col = 0; col < size; col++) {
      if (!isOccupied(row, col)) {
        queensPositions[row] = col;
        setOccupation(row, col, true);

        if (row < size - 1) {
          placing(row + 1, limit);
        } else {
          if (limit > 0 && count > limit - 1) {
            return;
          } // останавливаемся при нахождении предельного кол-ва решений, если убрать будет
            // искать все рещения
          count++;
          printSolution();

        }
        setOccupation(row, col, false);
      }
    }
  }

  // запус поиска решения
  public void findSolution(int limit) {
    placing(0, limit);
  }

}