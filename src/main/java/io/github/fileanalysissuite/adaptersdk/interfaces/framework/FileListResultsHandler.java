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

/**
 * Results handler for the file list retrieval operation.
 * <p>
 * This results handler allows queueing of repository items discovered during scan. Usually just quick and cheap to obtain metadata would
 * be queued for an item and no content. The second request to obtain file data, should query for specified items and provide contents or
 * potentially more expensive to obtain metadata properties.
 */
public interface FileListResultsHandler extends FailureRegistration
{
    /**
     * Queues a repository item discovered during scan operation.
     * <p>
     * The {@code partitionHint} parameter should be an identifier of the repository partition during distributed processing. For example,
     * in a scenario where network file system is scanned, a folder name could be the partition hint because performance could potentially
     * be improved if the folders are on different drives.
     *
     * @param itemMetadata repository item properties
     * @param partitionHint partitioning information for distributed processing
     * @param cancellationToken the token that can be used to check if cancellation is requested
     */
    void queueItem(ItemMetadata itemMetadata, String partitionHint, CancellationToken cancellationToken);
}
