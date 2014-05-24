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

    public void print() {

    }
}
