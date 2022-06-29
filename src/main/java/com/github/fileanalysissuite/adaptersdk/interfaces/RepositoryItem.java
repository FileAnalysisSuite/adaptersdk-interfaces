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

import Dawn.*;

/** <inheritdoc />
 */
public class RepositoryItem implements IRepositoryItem
{
    /**
     * Initializes a new instance of the <see cref="RepositoryItem"/> class.
     *
     * @param itemId The item identifier.
     */
    public RepositoryItem(String itemId)
    {
        ItemId = Guard.Argument(itemId, "itemId").NotNull().NotEmpty();
    }

    /**
     * Initializes a new instance of the <see cref="RepositoryItem"/> class.
     *
     * @param itemId The item identifier.
     * @param metadata The metadata.
     */
    public RepositoryItem(String itemId, IItemMetadata metadata)
    {
        this(itemId);
        Guard.Argument(metadata, "metadata").NotNull();
        Metadata = metadata;
    }

    /**
     * Initializes a new instance of the <see cref="RepositoryItem"/> class.
     *
     * @param itemId The item identifier.
     * @param contents The contents.
     * @param metadata The metadata.
     */
    public RepositoryItem(String itemId, IFileContents contents, IItemMetadata metadata)
    {
        this(itemId, metadata);
        Guard.Argument(contents, "contents").NotNull();
        Contents = contents;
    }

    /** <inheritdoc />
     */
    private String ItemId;

    public final String getItemId()
    {
        return ItemId;
    }

    /** <inheritdoc />
     */
    private IItemMetadata Metadata = new ItemMetadata();

    public final IItemMetadata getMetadata()
    {
        return Metadata;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public IFileContents? Contents {get;}
    private IFileContents Contents;

    public final IFileContents getContents()
    {
        return Contents;
    }
}
