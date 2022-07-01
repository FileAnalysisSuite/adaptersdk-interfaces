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

import javax.annotation.Nonnull;

/**
 * Responsible for creation of {@link ProcessingEngine}.
 */
public interface ProcessingEngineFactory
{
    /**
     * Creates the engine.
     * <p>
     * Creates an instance of the core component of the Adapter SDK, the {@link ProcessingEngine}.
     *
     * @return a configured ProcessingEngine instance
     */
    @Nonnull
    ProcessingEngine createEngine();
}
