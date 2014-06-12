#include "memoryleakdetect.h"		// needs to be first #include in the .cpp file
#include "Book.h"

Book::Book(void)
{
}

Book::Book(string newTitle, string newAuthor, int newNPages): Item(newTitle, newAuthor)
{
	int nPages = newNPages;
}


Book::~Book(void)
{
}

