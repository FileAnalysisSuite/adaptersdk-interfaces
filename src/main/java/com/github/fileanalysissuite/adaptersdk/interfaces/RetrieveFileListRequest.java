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
 * Provides information required to run RetrieveFileList command.
 *
 *
 * <p>
 * File list retrieval is a part of the process of scanning repository. When the adapter receives a request to retrieve a file list, it
 * should return all items in particular repository (for repositories without changelog) or items that were changed since the last request
 * (for repositories with changelog).
 * </p>
 * <p>
 * <c>RetrieveFileListRequest</c> class contains.
 * </p>
 *
 * {@link MicroFocus.FAS.AdapterSdk.Api.HandlerRequest }
 */
public class RetrieveFileListRequest extends HandlerRequest
{
    /**
     * Initializes a new instance of the <see cref="RetrieveFileListRequest"/> class.
     *
     * @param additionalFilter The additional filter.
     * @param repositoryProperties The repository properties.
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public RetrieveFileListRequest(string? additionalFilter, IRepositoryProperties repositoryProperties)
    public RetrieveFileListRequest(String additionalFilter, IRepositoryProperties repositoryProperties)
    {
        super(repositoryProperties);
        AdditionalFilter = additionalFilter;
    }

    /**
     * Gets the additional filter.
     *
     * <value>The additional filter.</value>
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public string? AdditionalFilter {get;}
    private String AdditionalFilter;

    public final String getAdditionalFilter()
    {
        return AdditionalFilter;
    }
}
