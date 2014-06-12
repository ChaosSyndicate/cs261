#pragma once

#include "item.h"

class Movie :
	public Item
{
public:
	Movie(void);
	Movie::Movie(const string& title, const string& author, const int nScenes);
	~Movie(void);
	int Movie::getScenes();
private:
	int nScenes;
};

