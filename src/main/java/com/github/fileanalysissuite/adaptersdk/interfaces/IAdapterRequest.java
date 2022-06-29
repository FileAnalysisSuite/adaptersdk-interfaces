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

import Destructurama.Attributed.*;

/**
 * A request to perform an action on a repository by an adapter.
 */
public interface IAdapterRequest
{
    /**
     * Gets the request identifier.
     *
     * <value>The request identifier.</value>
     */
    long getRequestId();

    /**
     * Gets the type of the request.
     *
     * <value>The type of the request.</value>
     */
    AdapterRequestType getRequestType();

    /**
     * Gets or sets the type of the repository.
     *
     * <value>The type of the repository.</value>
     */
    String getRepositoryType();

    /**
     * Gets the size of the batch.
     *
     * <value>The size of the batch.</value>
     */
    int getBatchSize();

    /**
     * Gets the capture content option.
     *
     *
     * If <c>true</c>, then the adapter should retrieve file contents. <c>false</c> otherwise.
     *
     */
    public boolean getRetrieveContents();

    /**
     * Gets or sets the item list.
     *
     * <value>The item list.</value>
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [LogAsScalar] System.Nullable<IEnumerable<string>> ItemList {get;}
    java.lang.Iterable<String> getItemList();

    /**
     * Gets or sets the repository properties.
     *
     * <value>The repository properties.</value>
     */
    IRepositoryProperties getRepositoryProperties();
}
