// Each book, music album, or movie will be an instance of a subclass of this class.
// Instances of this class should not be created. Specifying it as 'abstract' ensures
// that they cannot.

package library;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public abstract class Item
{
    protected String title;
    protected Set<String> keywords;

    Item(String newTitle, String... newKeywords) {
        title = newTitle;
        keywords = new TreeSet<String>(Arrays.asList(newKeywords));
    }

    public String getTitle() {
        return title;
    }

    public void editTitle(String newTitle) {
        title = newTitle;
    }


}
