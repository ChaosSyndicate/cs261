import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

// By default, this code will get its input data from the Java standard input,
// java.lang.System.in. To allow input to come from a file instead, which can be
// useful when debugging your code, you can provide a file name as the first
// command line argument. When you do this, the input data will come from the
// named file instead. If the input file is in the project directory, you will
// not need to provide any path information.
//
// In BlueJ, specify the command line argument when you call main().
//
// In Eclipse, specify the command line argument in the project's "Run Configuration."

public class Assignment1
{
    // returns an InputStream that gets data from the named file
    private static InputStream getFileInputStream(String fileName)
    {
        InputStream inputStream;

        try {
            inputStream = new FileInputStream(new File(fileName));
        }
        catch (FileNotFoundException e) {		// no file with this name exists
            System.err.println(e.getMessage());
            inputStream = null;
        }
        return inputStream;
    }

    public static void main(String[] args)
    {
        // Create an input stream for reading the data.  The default is
        // System.in (which is the keyboard).  If there is an arg provided
        // on the command line then we'll use the file instead.

        InputStream in = System.in;
        if (args.length >= 1) {
            in = getFileInputStream(args[0]);

        }

        Map<String, Map<String, Integer>> FinalFilteredMap = new TreeMap<String, Map<String, Integer>>();
        List<String> TextToList = new ArrayList<String>();
        Set<String> FilteredSet = new LinkedHashSet<String>();

        // Now that we know where the data is coming from we'll start processing.
        // Notice that getFileInputStream could have generated an error and left "in"
        // as null.  We should check that here and avoid trying to process the stream
        // data if there was an error.

        if (in != null) {

            // Using a Scanner object to read one word at a time from the input stream.

            Scanner sc = new Scanner(in);
            String word;

            System.out.printf("CS261 - Assignment 1 - Kevin Bui%n%n");

            // Continue getting words until we reach the end of input

            while (sc.hasNext()) {
                word = sc.next();
                if (!word.equals("---")) {
                   TextToList.add(word);
                   FilteredSet.add(word);
                }
            }

            for(String s : FilteredSet) {
                Map<String, Integer> PairCount = new TreeMap<String, Integer>();
                Iterator<String> iterator = TextToList.iterator();
                while (iterator.hasNext()) {
                   String DocString = iterator.next();
                   if (s.equals(DocString) && iterator.hasNext()) {
                       DocString = iterator.next();
                       if (!PairCount.containsKey(DocString))
                           PairCount.put(DocString, 1);
                       else {
                           PairCount.put(DocString, PairCount.get(DocString) + 1);
                       }
                   }
                }
                FinalFilteredMap.put(s, PairCount);
            }

            //Formatting for text output
            for (Map.Entry<String, List<String>> entry : FinalFilteredMap.entrySet()) {
                System.out.println(entry.getKey() + ":");

                //Retrieve the list to be Sorted
                List<String> UnFilteredPairs = entry.getValue();
                Collections.sort(UnFilteredPairs);

                // Count the number of unique instances in the list:
                Map<String, Integer> PairwordsMap = new LinkedHashMap<String, Integer>();
                List<String>words = entry.getValue();
                for(String s : words){
                    if(!PairwordsMap.containsKey(s)) {
                        PairwordsMap.put(s, 1);
                    }
                    else{
                        PairwordsMap.put(s, PairwordsMap.get(s) + 1);
                    }
                }

                // Print the occurrences of following symbols:
                for(String s : PairwordsMap.keySet()) {
                    System.out.println("   " + s + ", " + PairwordsMap.get(s));
                }

            }
            System.out.printf("%nbye...%n");
        }
    }
}
