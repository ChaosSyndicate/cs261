package library;

import java.util.Iterator;

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

    public String getAuthor() {
        return author;
    }

    public String toString() {
        StringBuilder bookString = new StringBuilder();
        Iterator<String> it = keywords.iterator();

        bookString.append("-Book- \n").append("author:  ").append(author).append('\n');
        bookString.append("# pages:  ").append(pageNum).append('\n');
        bookString.append("title:    ").append(title).append('\n');

        bookString.append("keywords: ");
        while (it.hasNext()) {
            String s = it.next();
            bookString.append(s);
            if (it.hasNext()) {
                bookString.append(',');
            }
        }
        bookString.append('\n').append('\n');
        return bookString.toString();
    }

}
