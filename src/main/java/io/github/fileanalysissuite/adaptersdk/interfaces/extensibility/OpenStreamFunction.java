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

import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nonnull;

/**
 * Represents a function that opens an input stream.
 */
@FunctionalInterface
public interface OpenStreamFunction
{
    /**
     * Opens an InputStream.
     * <p>
     * At the end of the method either the stream will be successfully opened, or an exception will have been thrown.
     *
     * @return a new InputStream
     * @throws IOException if the stream cannot be opened due to an I/O issue
     */
    @Nonnull
    InputStream openInputStream() throws IOException;
}
