package com.sangkon.pushpull.a_purepull;

import java.util.concurrent.CompletionStage;

public interface AsyncDatabaseClient {

	CompletionStage<Item> getNextAfterId(String id);
}
