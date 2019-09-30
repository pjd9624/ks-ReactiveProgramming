package com.sangkon.pushpull.b_batchedpull;

import java.util.List;
import java.util.concurrent.CompletionStage;

public interface AsyncDatabaseClient {

	CompletionStage<List<Item>> getNextBatchAfterId(String id, int count);
}
