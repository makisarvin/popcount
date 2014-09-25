package hello;

/**
 *
 * Created by jerry on 25/09/14.
 */
public class PopCount {

  public static int population_count(int number) {
    assert (number >= 0);
    char[] binaryRepr = Integer.toBinaryString(number).toCharArray();

    int sum = 0;
    for( char c: binaryRepr) {
      if ( c == '1') {
        sum++;
      }
    }

    return sum;
  }
}
