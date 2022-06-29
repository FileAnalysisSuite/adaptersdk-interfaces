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
 * Information about the adapter.
 *
 *
 * Class provides basic information about the adapter that is used when communicating with FAS.
 *
 * {@link IAdapterDescriptor }
 */
public class AdapterDescriptor implements IAdapterDescriptor
{
    /**
     * Initializes a new instance of the <see cref="AdapterDescriptor" /> class.
     *
     * @param adapterType Adapter type.
     * @param propertyDefinitions The repository setting definitions required by the adapter.
     */
    public AdapterDescriptor(String adapterType, java.lang.Iterable<RepositorySettingDefinition> propertyDefinitions)
    {
        AdapterType = adapterType;
        SettingDefinitions = propertyDefinitions;
    }

    /** <inheritdoc />
     */
    private String AdapterType;

    public final String getAdapterType()
    {
        return AdapterType;
    }

    /** <inheritdoc />
     */
    private java.lang.Iterable<RepositorySettingDefinition> SettingDefinitions;

    public final java.lang.Iterable<RepositorySettingDefinition> getSettingDefinitions()
    {
        return SettingDefinitions;
    }
}
