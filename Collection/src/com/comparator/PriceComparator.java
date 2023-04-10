package com.comparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		
		if(b1.getPrice()==b2.getPrice())
			return 0;
		else
			if(b1.getPrice()>b2.getPrice())
				return 1;
				else
					return -1;


	}

}
