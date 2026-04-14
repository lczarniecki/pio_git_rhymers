package edu.kis.vh.nursery;


public class FifoRhymer extends DefaultCountingOutRhymer {
	/**
	 * TODO
	 * Funkcjonalność FIFO możemy łatwo osiągnąć przy użyciu listy dwukierunkowej
	 * zamiast tworzyć dodatkowy obiekt powinniśmy zmienić sposób przechowywania danych
	 * i uczynić count in and out metodami abstrakcyjnymi
	 */
  private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

  public int countOut() {
    while (!callCheck()) temp.countIn(super.countOut());

    int ret = temp.countOut();

    while (!temp.callCheck()) countIn(temp.countOut());

    return ret;
  }
}
