#pragma once

#include "item.h"

class MusicAlbum :
	public Item
{
public:
	MusicAlbum(void);
	MusicAlbum::MusicAlbum(const string& title, const string& author, const int nSongs);
	~MusicAlbum(void);
private:
	int numSongs;
};

