package library;

import java.util.*;

class MusicAlbum
	extends Item
{
    private String bandName;
    private int nSongs;
    private Set<String> bandMembers;

    MusicAlbum(String title, String band, int newNSongs, String... keywords) {
        super(title, keywords);
        bandName = band;
        nSongs = newNSongs;

    }

    public void editBandMembers(String... keywords) {
        bandMembers = new TreeSet<String>(Arrays.asList(keywords));
    }

    public Collection<String> getBandMembers() {
        return bandMembers;
    }

    public String getBandName() {
        return bandName;
    }


    @Override
    public String toString() {
        StringBuilder albumString = new StringBuilder();
        Iterator<String> it = keywords.iterator();
        Iterator<String> bandIterator = bandMembers.iterator();

        albumString.append("-Music Album- \n").append("band:    ").append(bandName).append('\n');
        albumString.append("# songs:  ").append(nSongs).append('\n');

        albumString.append("members:  ");
        while (bandIterator.hasNext()) {
            String s = bandIterator.next();
            albumString.append(s);
            if (bandIterator.hasNext()) {
                albumString.append(',');
            }
        }
        albumString.append('\n');

        albumString.append("title:    ").append(title).append('\n');

        albumString.append("keywords: ");
        while (it.hasNext()) {
            String s = it.next();
            albumString.append(s);
            if (it.hasNext()) {
                albumString.append(',');
            }
        }
        albumString.append('\n');
        albumString.append('\n');
        return albumString.toString();
    }

}
