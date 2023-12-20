/*
 * Copyright 2022-2024 Open Text.
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

import io.github.fileanalysissuite.adaptersdk.interfaces.extensibility.FileMetadata;
import javax.annotation.Nonnull;

/**
 * A file in a repository.
 * <p>
 * Represents metadata and optional content information about a repository file.
 */
public interface RepositoryFile
{
    /**
     * Returns the file identifier.
     *
     * @return the file identifier
     */
    @Nonnull
    String getFileId();

    /**
     * Returns the repository-level metadata associated with the file.
     *
     * @return the metadata
     */
    @Nonnull
    FileMetadata getMetadata();
}
