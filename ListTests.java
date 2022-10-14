import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{ 
    @Test
    public void testFilter(){
        StringChecker sc = new findY();
        ArrayList<String> input1 = new ArrayList<String>();
            input1.add("yeah");
            input1.add("yuh");
            input1.add("yum");
            input1.add("yo");
        ArrayList<String> finalResult = new ArrayList<String>();
            finalResult.add("yeah");
            finalResult.add("yuh");
            finalResult.add("yum");
            finalResult.add("yo");
       // assertEquals(finalResult ,ListExamples.filter(input1,sc));
    }

    @Test
    public void testMerger(){ 
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();

        s1.add("apple");
        s2.add("applesauce");
        s1.add("bear");
        s2.add("cough");
        s1.add("ivor");
        s2.add("jack");
        s2.add("kevin");
        s2.add("myers");

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("applesauce");
        expected.add("bear");
        expected.add("cough");
        expected.add("ivor");
        expected.add("jack");
        expected.add("kevin");
        expected.add("myers");
        
        List<String> results = ListExamples.merge(s1,s2);
        assertEquals(expected,results);


    }


}