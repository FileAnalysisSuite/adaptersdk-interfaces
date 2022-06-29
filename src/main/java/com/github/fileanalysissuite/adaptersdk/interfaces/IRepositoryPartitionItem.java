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
 * Repository Item with Partition Hint.
 */
public interface IRepositoryPartitionItem extends IRepositoryItem
{
    /**
     * Gets or sets the partition hint.
     *
     *
     * <p>
     * PartitionHint is used to distribute work across adapters or threads. Items with different partition hints can be distributed to
     * separate adapters.
     * </p>
     * <p>
     * PartitionHint is only set during the file list retrieval (<see cref="IRepositoryAdapter.RetrieveFileListAsync"/> method).
     * </p>
     *
     * <value>The partition hint.</value>
     */
    String getPartitionHint();
}
