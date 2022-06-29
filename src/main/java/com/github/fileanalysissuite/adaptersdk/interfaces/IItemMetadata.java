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

import java.util.*;
import java.time.*;

/**
 * Item metadata.
 *
 *
 * Represents a repository item metadata. In most cases, the default implementation should be used, <see cref="ItemMetadata"/>.
 *
 */
public interface IItemMetadata
{
    /**
     * File location - full path or repository identifier.
     */
    String getItemLocation();

    /**
     * File name.
     */
    String getName();

    /**
     * File title.
     */
    String getTitle();

    /**
     * File size.
     */
    long getSize();

    /**
     * File created date time.
     */
    LocalDateTime getCreatedTime();

    /**
     * File last accessed date time.
     */
    LocalDateTime getAccessedTime();

    /**
     * File modified date time.
     */
    LocalDateTime getModifiedTime();

    /**
     * Revision number if available.
     */
    Integer getVersion();

    /**
     * Gets or sets the binary file content hash.
     *
     * <value>The binary file content hash.</value>
     */
    String getContentHash();

    /**
     * Gets or sets the file metadata hash.
     *
     * <value>The file metadata hash.</value>
     */
    String getMetadataHash();

    /**
     * Gets or sets the type of the change.
     *
     * <value>The type of the change.</value>
     */
    ChangeType getChangeType();

    void setChangeType(ChangeType value);

    /**
     * Gets the additional metadata.
     *
     *
     * Important metadata to attach to an item that is not covered by other properties.
     *
     * <value>The additional metadata.</value>
     */
    Map<String, Object> getAdditionalMetadata();
}
