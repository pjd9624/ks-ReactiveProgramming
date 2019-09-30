package com.sangkon.conversionproblem;

import java.util.concurrent.CompletionStage;

public interface AsyncDatabaseClient {

	<T> CompletionStage<T> store(CompletionStage<T> stage);
}
