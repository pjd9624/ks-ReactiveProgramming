package com.sangkon.pushpull.a_purepull;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;

public class DelayedFakeAsyncDatabaseClient implements AsyncDatabaseClient {

	@Override
	public CompletionStage<Item> getNextAfterId(String id) {
		CompletableFuture<Item> future = new CompletableFuture<>();

		Flowable.just(new Item("" + (Integer.parseInt(id) + 1)))
		        .delay(500, TimeUnit.MILLISECONDS)
		        .subscribe(future::complete);

		return future;
	}
}
