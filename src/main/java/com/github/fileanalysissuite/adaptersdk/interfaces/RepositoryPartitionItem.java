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

/**
 * Repository Item with Partition Hint.
 */
public class RepositoryPartitionItem extends RepositoryItem implements IRepositoryPartitionItem
{
    /**
     * Initializes a new instance of the <see cref="RepositoryPartitionItem"/> class.
     *
     * {@link PartitionHint}
     * {@link RepositoryItem}
     *
     * @param itemId The item identifier.
     * @param partitionHint The partition hint.
     * @param metadata The item metadata.
     */
    public RepositoryPartitionItem(String itemId, String partitionHint, IItemMetadata metadata)
    {
        super(itemId, metadata);
        PartitionHint = Guard.Argument(partitionHint, "partitionHint").NotNull().NotEmpty();
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public string? PartitionHint {get;}
    private String PartitionHint;

    public final String getPartitionHint()
    {
        return PartitionHint;
    }
}
