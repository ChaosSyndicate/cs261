package library;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class Movie
	extends Item
{
    private String director;
    private int sceneNum;
    private Set<String> bandMembers;

    public void get() {

    }

    public void addBandMembers(String... members) {
        bandMembers = new TreeSet<String>(Arrays.asList(members));
    }

    public void remove() {

    }

    @Override
    public String toString() {
        StringBuilder movieString = new StringBuilder();
        Iterator<String> it = keywords.iterator();
        Iterator<String> actorIterator = actorList.iterator();

        movieString.append("-Movie- \n").append("director: ").append(director).append('\n');
        movieString.append("# scenes: ").append(sceneNum).append('\n');

        movieString.append("cast:   ");
        while (actorIterator.hasNext()) {
            String s = actorIterator.next();
            movieString.append(s);
            if (actorIterator.hasNext()) {
                movieString.append(',');
            }
        }
        movieString.append('\n');

        movieString.append("title:    ").append(title).append('\n');

        movieString.append("keywords: ");
        while (it.hasNext()) {
            String s = it.next();
            movieString.append(s);
            if (it.hasNext()) {
                movieString.append(',');
            }
        }
        movieString.append('\n');
        movieString.append('\n');
        return movieString.toString();
    }
}
