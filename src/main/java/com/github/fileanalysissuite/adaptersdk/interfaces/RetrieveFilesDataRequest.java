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
 * Provides information required to run the RetrieveFilesData command.
 *
 *
 * File data retrieval is a part of the process of scanning repository. When the adapter receives that RetrieveFilesData command
 * (<see cref="IRepositoryAdapter.RetrieveFilesDataAsync"/> method), it should queue the binary contents and expensive metadata.
 *
 * {@link MicroFocus.FAS.AdapterSdk.Api.HandlerRequest }
 */
public class RetrieveFilesDataRequest extends HandlerRequest
{
    /**
     * Initializes a new instance of the <see cref="RetrieveFilesDataRequest"/> class.
     *
     * @param items The items.
     * @param repositoryProperties The repository properties.
     */
    public RetrieveFilesDataRequest(java.lang.Iterable<IRepositoryItem> items, IRepositoryProperties repositoryProperties)
    {
        super(repositoryProperties);
        Items = items;
    }

    /**
     * Gets or sets a value indicating whether the binary contents should be retrieved.
     *
     *
     * This property is currently not supported.
     *
     * <value><c>true</c> if binary contents should be retrieved; otherwise, <c>false</c>.</value>
     */
    private boolean RetrieveContents;

    public final boolean getRetrieveContents()
    {
        return RetrieveContents;
    }

    public final void setRetrieveContents(boolean value)
    {
        RetrieveContents = value;
    }

    /**
     * List of items to retrieve.
     */
    private java.lang.Iterable<IRepositoryItem> Items;

    public final java.lang.Iterable<IRepositoryItem> getItems()
    {
        return Items;
    }
}
