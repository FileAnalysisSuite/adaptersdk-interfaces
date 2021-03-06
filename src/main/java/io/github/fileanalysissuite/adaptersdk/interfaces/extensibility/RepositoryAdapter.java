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
package io.github.fileanalysissuite.adaptersdk.interfaces.extensibility;

import io.github.fileanalysissuite.adaptersdk.interfaces.framework.CancellationToken;
import io.github.fileanalysissuite.adaptersdk.interfaces.framework.FileDataResultsHandler;
import io.github.fileanalysissuite.adaptersdk.interfaces.framework.FileListResultsHandler;
import io.github.fileanalysissuite.adaptersdk.interfaces.framework.RetrieveFileListRequest;
import io.github.fileanalysissuite.adaptersdk.interfaces.framework.RetrieveFilesDataRequest;
import javax.annotation.Nonnull;

/**
 * This is the main interface that must be implemented by a custom adapter.
 * <p>
 * Implementation of RepositoryAdapter represents the adapter code with specific methods handling different types of repository
 * operations.
 */
public interface RepositoryAdapter
{
    /**
     * Creates the descriptor object which contains information about the Adapter.
     * <p>
     * The {@link AdapterDescriptor} contains the adapter type name and expected configuration properties.
     *
     * @return the descriptor object which contains information about the adapter
     */
    @Nonnull
    AdapterDescriptor createDescriptor();

    /**
     * Retrieves a list of files (or repository items) including basic metadata like title and timestamps.
     *
     * @param request the request
     * @param handler the handler
     * @param cancellationToken the token that can be used by other objects or threads to receive notice of cancellation
     */
    void retrieveFileList(RetrieveFileListRequest request, FileListResultsHandler handler, CancellationToken cancellationToken);

    /**
     * Retrieves the content and expensive metadata for the files provided in the request.
     *
     * @param request the request
     * @param handler the handler
     * @param cancellationToken the cancellation token that can be used by other objects or threads to receive notice of cancellation
     */
    void retrieveFilesData(RetrieveFilesDataRequest request, FileDataResultsHandler handler, CancellationToken cancellationToken);
}
