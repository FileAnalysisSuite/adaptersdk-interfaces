/*
 * Copyright 2022-2025 Open Text.
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

import javax.annotation.Nonnull;

/**
 * The Adapter configuration.
 * <p>
 * Represents basic information about the adapter.
 */
public interface AdapterDescriptor
{
    /**
     * Returns the type of the adapter.
     * <p>
     * The adapter type is the type used when creating a custom adapter in FAS.
     *
     * @return the type of the adapter
     */
    @Nonnull
    String getAdapterType();

    /**
     * Gets the property definitions.
     * <p>
     * Settings are the repository attributes that a user can specify when creating a custom adapter in FAS.
     *
     * @return the repository setting definitions
     */
    @Nonnull
    Iterable<RepositorySettingDefinition> getSettingDefinitions();
}
