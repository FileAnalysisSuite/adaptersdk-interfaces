/*
 * Copyright 2022-2024 Open Text.
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
package io.github.fileanalysissuite.adaptersdk.interfaces.extensibility;

import io.github.fileanalysissuite.adaptersdk.interfaces.framework.TypeCode;
import javax.annotation.Nonnull;

/**
 * Definition of a repository setting in FAS Custom Adapter.
 */
public interface RepositorySettingDefinition
{
    /**
     * Returns the setting name.
     *
     * @return the setting name
     */
    @Nonnull
    String getName();

    /**
     * Returns the setting type code.
     *
     * @return the setting type code
     */
    @Nonnull
    TypeCode getTypeCode();

    /**
     * Returns a value indicating whether the value of this setting has to be provided.
     *
     * @return a value indicating whether the value of this setting has to be provided
     */
    boolean isRequired();

    /**
     * Returns a value indicating whether this field is encrypted.
     *
     * @return a value indicating whether this field is encrypted
     */
    boolean isEncrypted();
}
