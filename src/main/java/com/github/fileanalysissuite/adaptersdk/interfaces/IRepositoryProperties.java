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

import java.util.*;

/**
 * Represents repository information passed from FAS.
 *
 *
 * When a Custom Adapter is registered in FAS, it allows to specify additional settings that can be provided per repository. It also
 * allows to provide configuration values for all of the repositories.<br/>
 * An implementation of this interface will contain this information which then can be used by the custom adapter implementation.
 *
 */
public interface IRepositoryProperties
{
    /**
     * Should content hash be generated.
     *
     *
     * This setting is currently not used.
     *
     */
    boolean getGenerateContentHash();

    void setGenerateContentHash(boolean value);

    /**
     * Should metadata hash be generated.
     *
     *
     * This setting is currently not used.
     *
     */
    boolean getGenerateMetadataHash();

    void setGenerateMetadataHash(boolean value);

    /**
     * Gets or sets the configuration options.
     *
     *
     * Configuration options are retrieved from Adapter Configuration values provided during adding of the custom adapter.
     *
     * <value>The configuration options.</value>
     */
    Map<String, Object> getConfigurationOptions();

    /**
     * Gets or sets the repository options.
     *
     *
     * Repository options are the values provided when a repository was created. These are options you set up when creating a custom
     * adapter on the Repository Options screen.
     *
     * <value>The repository options.</value>
     */
    Map<String, Object> getRepositoryOptions();
}
