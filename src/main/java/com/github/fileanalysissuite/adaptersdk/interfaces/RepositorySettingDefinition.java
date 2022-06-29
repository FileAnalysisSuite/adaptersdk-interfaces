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
 * Definition of a repository setting in FAS Custom Adapter.
 */
public class RepositorySettingDefinition
{
    /**
     * Initializes a new instance of the <see cref="RepositorySettingDefinition" /> class.
     *
     * @param name The setting name.
     * @param typeCode The setting type as <c>TypeCode</c>.
     * @param isRequired Is the setting value required.
     * @param isEncrypted Is the setting value encrypted.
     */
    public RepositorySettingDefinition(String name, TypeCode typeCode, boolean isRequired, boolean isEncrypted)
    {
        Name = name;
        TypeCode = typeCode;
        IsRequired = isRequired;
        IsEncrypted = isEncrypted;
    }

    /**
     * Gets the setting name.
     *
     * <value>The setting name.</value>
     */
    private String Name;

    public final String getName()
    {
        return Name;
    }

    /**
     * Gets the setting type code.
     *
     * <value>The setting type code.</value>
     */
    private TypeCode TypeCode = getTypeCode().values()[0];

    public final TypeCode getTypeCode()
    {
        return TypeCode;
    }

    /**
     * Gets a value indicating whether the value of this setting has to be provided.
     *
     * <value><c>true</c> if it is required; otherwise, <c>false</c>.</value>
     */
    private boolean IsRequired;

    public final boolean isRequired()
    {
        return IsRequired;
    }

    /**
     * Gets a value indicating whether this field is encrypted.
     *
     * <value><c>true</c> if this instance is encrypted; otherwise, <c>false</c>.</value>
     */
    private boolean IsEncrypted;

    public final boolean isEncrypted()
    {
        return IsEncrypted;
    }
}
