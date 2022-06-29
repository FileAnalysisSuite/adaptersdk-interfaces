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
 * The adapter interface.
 *
 *
 * Implementation of <c>IRepositoryAdapter</c> represents the adapter code with specific methods handling different types of repository
 * (source) operations.
 *
 */
public interface IRepositoryAdapter
{
    /**
     * Creates the descriptor object which contains information about the Adapter.
     *
     * @return IAdapterDescriptor instance which contains information about the Adapter.
     *
     * <see cref="IAdapterDescriptor" /> contains the adapter type name and expected configuration properties.
     * <example>
     * <p>
     * Example below defines a descriptor with "MyCustomAdapter" FAS type name and 3 required properties with string values.<br />When a
     * task is received, SDK will validate that all of them are present and will decrypt encrypted values.</p>
     * <code title="CreateDescriptor Example">
     * <![CDATA[
     * public IAdapterDescriptor CreateDescriptor()
     * {
     * return new AdapterDescriptor("MyCustomAdapter",
     * new List&lt;RepositorySettingDefinition&gt;
     * {
     * new("Location", TypeCode.String, true, false),
     * new("UserName", TypeCode.String, true, false),
     * new("Password", TypeCode.String, true, true)
     * });
     * }
     * ]]>
     * </code>
     * </example> {@link IAdapterDescriptor }
     */
    IAdapterDescriptor CreateDescriptor();

    /**
     * Retrieves a list of files (or repository items) including basic metadata like title and timestamps.
     *
     * @param request The request.
     * @param handler The handler.
     * @param cancellationToken The cancellation token that can be used by other objects or threads to receive notice of cancellation.
     *
     * @return A Task representing the asynchronous operation.
     * <example>
     * Example of a simple implementation that queues file system files in a folder.
     * <code title="RetrieveFileListAsync Example">
     * <![CDATA[
     * public async Task RetrieveFileListAsync(RetrieveFileListRequest request, IFileListResultsHandler handler, CancellationToken cancellationToken)
     * {
     * // Get the repository option provided in UI, the location to scan
     * var location = request.RepositoryProperties.RepositoryOptions["Location"].ToString();
     * // Retrieve a list of files in the location
     * foreach (var file in new DirectoryInfo(location).EnumerateFiles("*", SearchOption.AllDirectories))
     * {
     * // Queue items for further processing
     * await handler.QueueItemAsync(new ItemMetadata(file.Name, file.FullName)
     * {
     * Size = file.Length,
     * ModifiedTime = file.LastWriteTimeUtc,
     * AccessedTime = file.LastAccessTimeUtc,
     * CreatedTime = file.CreationTimeUtc
     * },
     * file.DirectoryName ?? string.Empty);
     * }
     * }
     * ]]>
     * </code>
     * </example>
     */
    Task RetrieveFileListAsync(RetrieveFileListRequest request, IFileListResultsHandler handler, CancellationToken cancellationToken);

    /**
     * Retrieves the content and expensive metadata for the files provided in the request.
     *
     * @param request The request.
     * @param handler The handler.
     * @param cancellationToken The cancellation token that can be used by other objects or threads to receive notice of cancellation.
     *
     * @return A Task representing the asynchronous operation.
     * <example>
     * <p>
     * Below is an example of the <c>RetrieveFilesDataAsync</c> method and the <c>handler.QueueItemAsync</c>.</p>
     * <p>
     * The <c>itemId</c> parameter should be taken directly from a repository item being processed.</p>
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
    Task RetrieveFilesDataAsync(RetrieveFilesDataRequest request, IFileDataResultsHandler handler, CancellationToken cancellationToken);
}
