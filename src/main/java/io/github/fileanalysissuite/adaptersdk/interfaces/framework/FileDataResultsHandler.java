/*
 * Copyright 2022 Micro Focus or one of its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.fileanalysissuite.adaptersdk.interfaces.framework;

import io.github.fileanalysissuite.adaptersdk.interfaces.extensibility.ItemMetadata;
import io.github.fileanalysissuite.adaptersdk.interfaces.extensibility.OpenStreamFunction;

/**
 * Provides methods to queue the file data retrieval results.
 * <p>
 * Allows passing retrieved binary file contents and metadata to the engine and then for processing by FAS.
 */
public interface FileDataResultsHandler extends FailureRegistration
{
    /**
     * Queues the contents and metadata of an item.
     *
     * @param itemId the item identifier
     * @param fileContents the file contents
     * @param metadata the metadata
     * @param cancellationToken the cancellation token
     */
    void queueItem(String itemId, OpenStreamFunction fileContents, ItemMetadata metadata, CancellationToken cancellationToken);
}
