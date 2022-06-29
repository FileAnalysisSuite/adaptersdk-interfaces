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
 * A request to perform an action by an adapter.
 */
public class AdapterRequest implements IAdapterRequest
{
    /**
     * Initializes a new instance of the <see cref="AdapterRequest" /> class.
     *
     * @param requestId The request identifier.
     * @param repositoryType The adapter repository type.
     * @param requestType Type of the request.
     * @param batchSize The number of documents to send in a single request.
     */
    public AdapterRequest(long requestId, String repositoryType, AdapterRequestType requestType, int batchSize)
    {
        setRequestId(requestId);
        RepositoryType = repositoryType;
        RequestType = requestType;
        BatchSize = batchSize;
    }

    /**
     * Gets the request identifier.
     *
     * <value>The request identifier.</value>
     */
    private long RequestId;

    public final long getRequestId()
    {
        return RequestId;
    }

    public final void setRequestId(long value)
    {
        RequestId = value;
    }

    /**
     * Gets the type of the request.
     *
     * <value>The type of the request.</value>
     */
    private AdapterRequestType RequestType = AdapterRequestType.values()[0];

    public final AdapterRequestType getRequestType()
    {
        return RequestType;
    }

    /**
     * Gets or sets the type of the repository.
     *
     * <value>The type of the repository.</value>
     */
    private String RepositoryType;

    public final String getRepositoryType()
    {
        return RepositoryType;
    }

    /**
     * Gets the size of the batch.
     *
     * <value>The size of the batch.</value>
     */
    private int BatchSize;

    public final int getBatchSize()
    {
        return BatchSize;
    }

    /** <inheritdoc />
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
     * Gets or sets the item list.
     *
     * <value>The item list.</value>
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public IEnumerable<string>? ItemList {get;set;}
    private java.lang.Iterable<String> ItemList;

    public final java.lang.Iterable<String> getItemList()
    {
        return ItemList;
    }

    public final void setItemList(java.lang.Iterable<String> value)
    {
        ItemList = value;
    }

    /**
     * Gets or sets the repository properties.
     *
     * <value>The repository properties.</value>
     */
    private IRepositoryProperties RepositoryProperties = new RepositoryProperties();

    public final IRepositoryProperties getRepositoryProperties()
    {
        return RepositoryProperties;
    }
}
