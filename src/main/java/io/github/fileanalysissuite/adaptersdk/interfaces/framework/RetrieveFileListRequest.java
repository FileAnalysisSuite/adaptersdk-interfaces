/*
 * Copyright 2022-2022 Open Text.
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
 * Provides information required to run RetrieveFileList command.
 * <p>
 * File list retrieval is a part of the process of scanning repository. When the adapter receives a request to retrieve a file list, it
 * should return all files in particular repository (for repositories without changelog) or files that were changed since the last request
 * (for repositories with changelog).
 */
public interface RetrieveFileListRequest extends HandlerRequest
{
    /**
     * Returns the additional filter.
     *
     * @return the additional filter
     */
    @Nonnull
    Optional<String> getAdditionalFilter();
}
