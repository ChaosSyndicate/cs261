#include "memoryleakdetect.h"		// needs to be first #include in the .cpp file
#include "Movie.h"

Movie::Movie(void)
{
}

Movie::Movie(const string& title, const string& author, const int nScenes) : Item(title, author)
{
	this->nScenes = nScenes;
}

Movie::~Movie(void)
{
}

int Movie::getScenes() { return nScenes; }
