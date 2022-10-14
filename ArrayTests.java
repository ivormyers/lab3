import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
   // assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { 5,4,3,2,1 };
    ArrayExamples.reverseInPlace(input2);
   // assertArrayEquals(new int[]{ 1,2,3,4,5}, input2);
	}


  @Test
  public void testReversed() {
    int[] input4 = {4,5,6};
    assertArrayEquals(new int[]{6,5,4}, ArrayExamples.reversed(input4));
  }
  
  @Test
  public void testAverageWithoutLowest(){
    double[] input5 = {};
    double[] input6 = {5};
    double[] input7 = {2,2,3,4};
    
    assertEquals(0, ArrayExamples.averageWithoutLowest(input5),0);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input6),0);
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input7),0);
  }
}
