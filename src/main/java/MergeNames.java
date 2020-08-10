import java.util.*;

public class MergeNames {

    public String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> set1 = new HashSet<String>(Arrays.asList(names1));
        Set<String> set2 = new HashSet<String>(Arrays.asList(names2));
        Set<String> union = new HashSet<String>(set1);
        //union.addAll(set2);
        set1.addAll(set2);
        return set1.toArray(String[]::new);
        //return union.toArray(String[]::new);
        //return union.toArray(new String[union.size()]);
    }

    public static void main(String[] args) {
        MergeNames merge = new MergeNames();
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ",merge.uniqueNames(names1,names2)));
    }
}
