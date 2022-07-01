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
package io.github.fileanalysissuite.adaptersdk.interfaces.extensibility;

import javax.annotation.Nonnull;

/**
 * Represents binary file contents.
 * <p>
 * During the {@link RepositoryAdapter#retrieveFilesData retrieveFilesData()} operation you are expected to provide binary contents of the
 * files specified in the request. This interface represents that binary contents.
 */
public interface FileContents
{
    /**
     * Returns the function that can be used to open the content stream.
     *
     * @return the function that can be used to open the content stream
     */
    @Nonnull
    OpenStreamFunction getContentStream();
}
