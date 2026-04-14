package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	/**
	 * TODO
	 * Skoro mamy już działającą klasę listy dwukierunkowej, to po
	 * co powielać kod i doimplemontowywać, stos który nawet nie jest
	 * w jakimkolwiek przypatku zauwazalnie szybszy. Lepiej użyć zaimplementowaną
	 * wcześniej klasę.
	 */

  public static final int MAX_SIZE = 12;
  public static final int EMPTY = -1;
  public static final int RETURN = -1;
  public static final int CONTAINER_SIZE = 11;
  private final int[] NUMBERS = new int[MAX_SIZE];

  private int total = -1;

  public int getTotal() {
    return total;
  }

  public void countIn(int in) {
    if (!isFull()) NUMBERS[++total] = in;
  }

  public boolean callCheck() {
    return total == EMPTY;
  }

  public boolean isFull() {
    return total == CONTAINER_SIZE;
  }

  protected int peekaboo() {
    if (callCheck()) return RETURN;
    return NUMBERS[total];
  }

  public int countOut() {
    if (callCheck()) return RETURN;
    return NUMBERS[total--];
  }
}
