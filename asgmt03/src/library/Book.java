package library;

class Book
	extends Item
{
    private String author;
    private int pageNum;

    Book(String title, String newAuthor, int nPages, String... keywords) {
        super(title, keywords);
        author = newAuthor;
        pageNum = nPages;

    }

    public void get() {

    }


    public void remove() {

    }


    public String toString() {
        System.out.println("-Book-");
        System.out.println("author: " + author);
        System.out.println("# pages: " + pageNum);
        System.out.println("title: " + title);
        System.out.print("keywords: ");
        for (String s: keywords) {
            System.out.print(", " + s);
        }
        return null;
    }

}
