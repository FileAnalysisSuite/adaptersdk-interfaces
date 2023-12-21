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
package io.github.fileanalysissuite.adaptersdk.interfaces.extensibility;

import jakarta.annotation.Nonnull;
import java.time.Instant;
import java.util.Map;

/**
 * File metadata.
 * <p>
 * Represents a repository file metadata.
 */
public interface FileMetadata
{
    /**
     * Returns the file location - the full path or the repository identifier.
     *
     * @return the file location
     */
    @Nonnull
    String getFileLocation();

    /**
     * Returns the file name.
     *
     * @return the file name
     */
    @Nonnull
    String getName();

    /**
     * Returns the file title.
     *
     * @return the file title
     */
    String getTitle();

    /**
     * Returns the file created date time.
     *
     * @return the file created date time
     */
    Instant getCreatedTime();

    /**
     * Returns the file last accessed date time.
     *
     * @return the file last accessed date time
     */
    Instant getAccessedTime();

    /**
     * Returns the file modified date time.
     *
     * @return the file modified date time
     */
    @Nonnull
    Instant getModifiedTime();

    /**
     * Returns the revision number if it is available.
     *
     * @return the revision number if it is available
     */
    Integer getVersion();

    /**
     * Returns the additional metadata.
     * <p>
     * Important metadata to attach to a file that is not covered by other properties.
     *
     * @return the additional metadata
     */
    default Map<String, ? extends Iterable<String>> getAdditionalMetadata()
    {
        return null;
    }
}
