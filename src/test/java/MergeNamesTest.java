import org.hamcrest.core.StringContains;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeNamesTest {

    @Test
    public void uniqueNames() {
        MergeNames merge = new MergeNames();
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        String[] expected = new String[] {"Olivia", "Ava", "Emma", "Sophia"};
        assertTrue(Arrays.equals(expected,merge.uniqueNames(names1,names2)));
    }
}