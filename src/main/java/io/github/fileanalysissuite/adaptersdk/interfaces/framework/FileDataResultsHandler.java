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
package io.github.fileanalysissuite.adaptersdk.interfaces.framework;

import io.github.fileanalysissuite.adaptersdk.interfaces.extensibility.FileMetadata;
import io.github.fileanalysissuite.adaptersdk.interfaces.extensibility.OpenStreamFunction;
import java.time.Duration;

/**
 * Provides methods to queue the file data retrieval results.
 * <p>
 * Allows passing retrieved binary file contents and metadata to the engine and then for processing by FAS.
 */
public interface FileDataResultsHandler extends FailureRegistration
{
    /**
     * Queues the contents and metadata of an file.
     *
     * @param fileId the file identifier
     * @param fileContents the file contents
     * @param metadata the metadata
     * @param cancellationToken the cancellation token
     */
    void queueFile(String fileId, OpenStreamFunction fileContents, FileMetadata metadata, CancellationToken cancellationToken);

    /**
     * Requests that the framework schedules a follow-up request for this file.
     *
     * @param fileId the file identifier
     * @param delay the length of time to delay
     * @param cancellationToken the cancellation token
     */
    void retryAfter(String fileId, Duration delay, CancellationToken cancellationToken);
}
