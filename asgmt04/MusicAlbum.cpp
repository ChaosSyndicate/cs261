#include "memoryleakdetect.h"		// needs to be first #include in the .cpp file
#include "MusicAlbum.h"

MusicAlbum::MusicAlbum(void)
{
}

MusicAlbum::MusicAlbum(const string& title, const string& author, const int nSongs) : Item(title, author)
{
	numSongs = nSongs;
}

MusicAlbum::~MusicAlbum(void)
{
}
