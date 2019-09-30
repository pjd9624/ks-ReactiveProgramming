package com.sangkon.pushpull.c_push;

import rx.Observable;

public interface AsyncDatabaseClient {

	Observable<Item> getStreamOfItems();
}
