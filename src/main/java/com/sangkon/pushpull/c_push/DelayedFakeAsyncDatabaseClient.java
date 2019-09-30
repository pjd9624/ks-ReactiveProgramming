package com.sangkon.pushpull.c_push;

import java.util.concurrent.TimeUnit;

import rx.Observable;

public class DelayedFakeAsyncDatabaseClient implements AsyncDatabaseClient {

	@Override
	public Observable<Item> getStreamOfItems() {
		return Observable.range(1, Integer.MAX_VALUE)
		                 .map(i -> new Item("" + i))
		                 .delay(50, TimeUnit.MILLISECONDS)
		                 .delaySubscription(100, TimeUnit.MILLISECONDS);
	}
}
