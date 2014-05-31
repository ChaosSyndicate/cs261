package library;

import java.util.*;

class Movie
	extends Item
{
    private String director;
    private int sceneNum;
    private Set<String> actorList;

    Movie(String title, String director, int nScenes, String... keywords) {
        super(title, keywords);
        this.director = director;
        sceneNum = nScenes;
    }

    public String getDirector() {
        return director;
    }

    public Collection<String> getActors() {
        return actorList;
    }
    public void editActors(String... actors) {
        actorList = new TreeSet<String>(Arrays.asList(actors));
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
