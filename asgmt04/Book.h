#pragma once

#include "item.h"

class Book :
	public Item
{
public:
	Book(void);
	~Book(void);
	Book(string newTitle, string newAuthor, int newNPages);

private:
	int nPages;
};

