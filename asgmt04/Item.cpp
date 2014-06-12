#include "memoryleakdetect.h"		// needs to be first #include in the .cpp file
#include "Item.h"

Item::Item(const string& title, const string& artist)
{
	this->title = title;
	this->artist = artist;
	keywords = new set < string > ;
}

Item::Item()
{
	title = "";
	artist = "";
	keywords = new set < string > ;
}

Item::~Item()
{
	keywords->clear();
	delete keywords;
}

string Item::getTitle() const { return title; }
string Item::getArtist() const { return artist; }
set<string>* Item::getKeywords() const { return keywords; }

void Item::addKeywords(int nKeywords, ...)
{
	va_list varargs;
	char *keyword;

	va_start(varargs, nKeywords);
	for (int i = 0; i < nKeywords; i++) 
	{
		keyword = va_arg(varargs, char*);
		string currentKeyword = va_arg(varargs, string);
		keywords->insert(currentKeyword);
	}
	va_end(varargs);
}

bool operator<(const Item& i1, const Item& i2)
{
	bool lessThan = false;
	if (i1.getTitle() < i2.getTitle())
		lessThan = true;
	return lessThan;
}

bool operator<(const ItemPtr& ip1, const ItemPtr& ip2)
{
	bool lessThan = false;
	if (ip1.getPtr()->getTitle() < ip2.getPtr()->getTitle())
		lessThan = true;
	return lessThan;
}

ostream& operator<<(ostream& out, const Item* const item)
{
	// your code here
	return out;
}
