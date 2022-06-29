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
 * The Adapter configuration.
 *
 *
 * Represents basic information about the adapter.
 *
 */
public interface IAdapterDescriptor
{
    /**
     * Gets the type of the adapter.
     *
     *
     * The adapter type is the type used when creating a custom adapter in FAS.<br />
     * It is not related to .NET type.
     *
     * <value>The type of the adapter.</value>
     */
    String getAdapterType();

    /**
     * Gets the property definitions.
     *
     *
     * Settings are the repository attributes that a user can specify when creating a custom adapter in FAS.
     *
     * <value>The repository setting definitions.</value>
     */
    java.lang.Iterable<RepositorySettingDefinition> getSettingDefinitions();
}
