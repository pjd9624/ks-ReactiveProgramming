package com.sangkon.pushpull.d_pushpull;

import org.reactivestreams.Publisher;

public interface AsyncDatabaseClient {

	Publisher<Item> getStreamOfItems();
}
