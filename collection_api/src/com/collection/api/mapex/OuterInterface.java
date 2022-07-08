package com.collection.api.mapex;

public interface OuterInterface {

	void add(Object obj);

	interface InnerInterface {

		Object entry(Object key, Object value);
	}

}
