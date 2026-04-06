package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  public static final int MAX_SIZE = 12;
  public static final int EMPTY = -1;
  public static final int CONTAINER_SIZE = 11;
  private int[] number = new int[MAX_SIZE];

  public int total = EMPTY;

  public void countIn(int in) {
    if (!isFull()) number[++total] = in;
  }

  public boolean callCheck() {
    return total == EMPTY;
  }

  public boolean isFull() {
    return total == CONTAINER_SIZE;
  }

  protected int peekaboo() {
    if (callCheck()) return EMPTY;
    return number[total];
  }

  public int countOut() {
    if (callCheck()) return EMPTY;
    return number[total--];
  }
}
