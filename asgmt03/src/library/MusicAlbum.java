package library;

class MusicAlbum
	extends Item
{
    private String bandName;
    private int nSongs;
    private String bandMembers[];

    MusicAlbum(String title, String band, int newNSongs, String... keywords) {
        super(title, keywords);
        bandName = band;
        nSongs = newNSongs;

    }

    public void get() {

    }

    public void add() {

    }

    public void remove() {

    }

    @Override
    public String toString() {
        return null;
    }

}
