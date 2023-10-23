/*
 * Copyright 2022-2023 Open Text.
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

import jakarta.annotation.Nonnull;
import java.util.Optional;

public interface OptionsProvider
{
    /**
     * Retrieves the available option names.
     *
     * @return the available option names
     */
    @Nonnull
    Iterable<String> getOptionNames();

    /**
     * Used to retrieve the specified option.
     *
     * @param optionName the name of the option to be retrieved
     * @return the value of the option, or {@link Optional#empty()} if the option has not been set
     */
    @Nonnull
    Optional<String> getOption(String optionName);
}
