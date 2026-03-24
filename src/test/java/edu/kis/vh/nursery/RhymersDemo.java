package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

  public static final int INT = 15;
  public static final int INT1 = 3;
  public static final int BOUND = 20;
  public static final int I = 1;
  public static final int I1 = 0;

  public static void main(String[] args) {
    Rhymersfactory factory = new DefaultRhymersFactory();

    DefaultCountingOutRhymer[] rhymers = {
      factory.getStandardRhymer(),
      factory.getFalseRhymer(),
      factory.getFIFORhymer(),
      factory.getHanoiRhymer()
    };

    for (int i = I; i < INT; i++) for (int j = I1; j < INT1; j++) rhymers[j].countIn(i);

    java.util.Random rn = new java.util.Random();
    for (int i = I; i < INT; i++) rhymers[INT1].countIn(rn.nextInt(BOUND));

    for (int i = I1; i < rhymers.length; i++) {
      while (!rhymers[i].callCheck()) System.out.print(rhymers[i].countOut() + "  ");
      System.out.println();
    }

    System.out.println("total rejected is " + ((HanoiRhymer) rhymers[INT1]).reportRejected());
  }
}
