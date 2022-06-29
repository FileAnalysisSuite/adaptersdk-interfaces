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
 * Adapter processing engine responsible for the handling and execution of the repository tasks.
 */
public interface IProcessingEngine
{
    /**
     * Executes the engine.
     *
     *
     * When awaited, this call will block the execution until <paramref name="cancellationToken" /> is cancelled or a critical error
     * happens.
     *
     * @param cancellationToken The cancellation token that can be used by other objects or threads to receive notice of cancellation.
     *
     * @return Asynchronous void task.
     */
    Task ExecuteAsync(CancellationToken cancellationToken);
}
