package library;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Library
{
	// general methods
    private Map<String, Item> itemCollection = new TreeMap<String, Item>();
	
    private Map<String, TreeSet<Item>> keywordIndex;
    private Map<String, TreeSet<Item>> authorIndex;
    private Map<String, TreeSet<Item>> bandIndex, musicianIndex;
    private Map<String, TreeSet<Item>> directorIndex, actorIndex;
    private TreeMap<String,Item> aBookIndex, aMovieIndex, aAlbumIndex;

    public Library() {
        keywordIndex = new HashMap<String, TreeSet<Item>>();
        authorIndex = new HashMap<String, TreeSet<Item>>();
        bandIndex = new HashMap<String, TreeSet<Item>>();
        musicianIndex = new HashMap<String, TreeSet<Item>>();
        directorIndex = new HashMap<String, TreeSet<Item>>();
        actorIndex = new HashMap<String, TreeSet<Item>>();
        aBookIndex = new TreeMap<String, Item>();
        aMovieIndex = new TreeMap<String, Item>();
        aAlbumIndex = new TreeMap<String, Item>();
    }

    // general methods
    public void index(Map<String, TreeSet<Item>> index, Item newItem, String... varags) {
        for(String s: varags) {
            if(!(index.containsKey(s))) {
                TreeSet<Item> tempSet = new TreeSet<Item>();
                tempSet.add(newItem);
                index.put(s, tempSet);
            }
            else {
                TreeSet<Item> temp = index.get(s);
                temp.add(newItem);
                index.put(s, temp);
            }
        }

    }

	// returns all of the items which have the specified keyword
	public Collection<Item> itemsForKeyword(String keyword)
	{
		return keywordIndex.get(keyword);
	}
	
	// print an item from this library to the output stream provided
	public void printItem(PrintStream out, Item item)
	{
        out.print(item.toString());
	}
	
	// book-related methods
	
	// adds a book to the library
	public Item addBook(String title, String author, int nPages, String... keywords)
	{
		Item newBook = new Book(title, author, nPages, keywords);
        itemCollection.put(title, newBook);
        return newBook;
	}
	
	// removes a book from the library
	public boolean removeBook(String title)
	{
        itemCollection.remove(title);
        return true;

	}
	
	// returns all of the books by the specified author
	public Collection<Item> booksByAuthor(String author)
	{
		return null;
	}
	
	// returns all of the books in the library
	public Collection<Item> books()
	{
		return null;
	}
	
	// music-related methods
	
	// adds a music album to the library
	public Item addMusicAlbum(String title, String band, int nSongs, String... keywords)
	{
		return null;
	}

	// adds the specified band members to a music album
	public void addBandMembers(Item album, String... members)
	{
        Item editAlbum;
        editAlbum = itemCollection.get(album);
        (MusicAlbum) editAlbum.editTitle(members);
    }
	
	// removes a music album from the library
	public boolean removeMusicAlbum(String title)
	{
		return false;
	}

	// returns all of the music albums by the specified band
	public Collection<Item> musicByBand(String band)
	{
		return null;
	}
	
	// returns all of the music albums by the specified musician
	public Collection<Item> musicByMusician(String musician)
	{
		return null;
	}
	
	// returns all of the music albums in the library
	public Collection<Item> musicAlbums()
	{
		return null;
	}
	
	// movie-related methods
	
	// adds a movie to the library
	public Item addMovie(String title, String director, int nScenes, String... keywords)
	{
		return null;
	}

	// adds the specified actors to a movie
	public void addCast(Item movie, String... members)
	{
	}

	// removes a movie from the library
	public boolean removeMovie(String title)
	{
		return false;
	}
	
	// returns all of the movies by the specified director
	public Collection<Item> moviesByDirector(String director)
	{
		return null;
	}
	
	// returns all of the movies by the specified actor
	public Collection<Item> moviesByActor(String actor)
	{
		return null;
	}
	
	// returns all of the movies in the library
	public Collection<Item> movies()
	{
		return null;
	}	
}
