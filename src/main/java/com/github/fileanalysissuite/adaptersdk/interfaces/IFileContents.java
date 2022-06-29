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

import java.io.*;

/**
 * Represents binary file contents.
 *
 *
 * <p>
 * During the RetrieveFileData operation, you are expected to provide binary contents of the files specified in the request. This
 * interface represents that binary contents.
 * </p>
 * <p>
 * The default implementation, <see cref="FileContents"/>, should be used in most cases.
 * </p>
 *
 * {@link System.IDisposable }
 * {@link System.IAsyncDisposable }
 */
public interface IFileContents extends Closeable, IAsyncDisposable
{
    /**
     * Gets the content stream.
     *
     * <value>The content stream.</value>
     */
//C# TO JAVA CONVERTER TODO TASK: C# to Java Converter cannot determine whether this System.IO.Stream is input or output:
    Stream getContentStream();
}
