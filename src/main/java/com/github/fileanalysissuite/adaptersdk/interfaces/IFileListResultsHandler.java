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
package com.github.fileanalysissuite.adaptersdk.interfaces;

/**
 * Results handler for the file list retrieval operation.
 *
 *
 * This results handler allows queueing of repository items discovered during scan. Usually just quick and cheap to obtain metadata would
 * be queued for an item and no content. The second request to obtain file data, should query for specified items and provide contents or
 * potentially more expensive to obtain metadata properties.
 *
 */
public interface IFileListResultsHandler extends IFailureRegistration
{
    /**
     * Queues a repository item discovered during scan operation.
     *
     * The <paramref name="partitionHint" /> parameter should be an identifier of the repository partition during distributed processing.
     * For example, in a scenario where network file system is scanned, a folder name could be the partition hint because performance
     * could potentially be improved if the folders are on different drives.
     *
     * <example>
     * Use the <c>QueueItemAsync</c> method to add basic information about the files that were discovered in the repository.<br />
     * A default <see cref="IItemMetadata" /> is <see cref="ItemMetadata"/> class.
     * <code title="File List QueueItemAsync Usage">
     * public async Task RetrieveFileListAsync(RetrieveFileListRequest request, IFileListResultsHandler handler, CancellationToken
     * cancellationToken) { // Get the repository option provided in UI, the location to scan var location =
     * request.RepositoryProperties.RepositoryOptions["Location"].ToString(); // Retrieve a list of files in the location foreach (var
     * file in new DirectoryInfo(location).EnumerateFiles("*", SearchOption.AllDirectories)) { // Queue items for further processing await
     * handler.QueueItemAsync(new ItemMetadata(file.Name, file.FullName) { Size = file.Length, ModifiedTime = file.LastWriteTimeUtc,
     * AccessedTime = file.LastAccessTimeUtc, CreatedTime = file.CreationTimeUtc }, file.DirectoryName ?? string.Empty); } }
     * </code>
     * </example>
     *
     * @param itemMetadata Repository item properties.
     * @param partitionHint Partitioning information for distributed processing.
     * @return A ValueTask instance.
     * @exception System.InvalidOperationException Property <c>itemMetadata.ItemLocation</c> was null.
     */
    ValueTask QueueItemAsync(IItemMetadata itemMetadata, String partitionHint);

    // TODO: FinalizeBatch will allow an adapter to pass changelog token to FAS and back. See IUS-452079
    // void FinalizeBatch(string batchToken);
}
