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
 * Provides methods to queue the file data retrieval results.
 *
 *
 * Allows passing retrieved binary file contents and metadata to the engine and then for processing by FAS.
 *
 * {@link IFailureRegistration }
 */
public interface IFileDataResultsHandler extends IFailureRegistration
{
    /**
     * Queues the contents and metadata of an item.
     *
     * @param itemId The item identifier.
     * @param fileContents The file contents.
     * @param metadata The metadata.
     * @param cancellationToken The cancellation token.
     * @return ValueTask.
     * <example>
     * <p>
     * Below is an example of the <c>RetrieveFilesDataAsync</c> method and the <c>handler.QueueItemAsync</c>.</p>
     * <p>
     * The <paramref name="itemId"/> parameter should be taken directly from a repository item being processed.</p>
     * <p>
     * When using the default implementation of <see cref="IFileContents"/>, the <see cref="FileContents"/> class, you can pass the
     * contents as a stream or a byte array.</p>
     * <code title="QueueItemAsync Usage">
     * <![CDATA[
     * public async Task RetrieveFilesDataAsync(RetrieveFilesDataRequest request, IFileDataResultsHandler handler, CancellationToken cancellationToken)
     * {
     * foreach (var repositoryItem in request.Items)
     * {
     * var file = new FileInfo(repositoryItem.Metadata.ItemLocation);
     * var fileStream = file.OpenRead();
     * repositoryItem.Metadata.AdditionalMetadata.Add("custom_property", 123);
     * handler.QueueItemAsync(repositoryItem.ItemId, new FileContents(fileStream), repositoryItem.Metadata);
     * }
     * }
     * ]]>
     * </code>
     * </example>
     */

    ValueTask QueueItemAsync(String itemId, IFileContents fileContents, IItemMetadata metadata);
//C# TO JAVA CONVERTER NOTE: Java does not support optional parameters. Overloaded method(s) are created above:
//ORIGINAL LINE: ValueTask QueueItemAsync(string itemId, IFileContents fileContents, IItemMetadata metadata, CancellationToken cancellationToken = default);

    ValueTask QueueItemAsync(String itemId, IFileContents fileContents, IItemMetadata metadata, CancellationToken cancellationToken);
}
