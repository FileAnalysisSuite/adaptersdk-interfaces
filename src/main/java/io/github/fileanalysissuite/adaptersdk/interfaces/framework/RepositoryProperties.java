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
package io.github.fileanalysissuite.adaptersdk.interfaces.framework;

import java.util.Optional;
import javax.annotation.Nonnull;

/**
 * Represents repository information passed from FAS.
 * <p>
 * When a Custom Adapter is registered in FAS, it allows to specify additional settings that can be provided per repository. It also
 * allows to provide configuration values for all of the repositories.
 */
public interface RepositoryProperties
{
    /**
     * Used to retrieve the specified configuration option.
     * <p>
     * Configuration options are retrieved from Adapter Configuration values provided during adding of the custom adapter.
     *
     * @return the OptionsProvider for configuration options.
     */
    @Nonnull
    OptionsProvider getConfigurationOptions();

    /**
     * Used to retrieve the specified repository option.
     * <p>
     * Repository options are the values provided when a repository was created. These are options you set up when creating a custom
     * adapter on the Repository Options screen.
     *
     * @return the OptionsProvider for repository options.
     */
    @Nonnull
    OptionsProvider getRepositoryOptions();
}
