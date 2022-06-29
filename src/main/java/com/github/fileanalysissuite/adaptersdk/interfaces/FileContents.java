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
 * Represents binary contents of a file.
 *
 *
 * <p>
 * This is the default implementation of <see cref="IFileContents" /> interface which allows the contents to be provided as a stream or a
 * byte array.
 * </p>
 * <p>
 * By default, the is used, but in case of some repositories, it might be easier to provide the contents using byte array.
 * </p>
 *
 * {@link MicroFocus.FAS.AdapterSdk.Api.IFileContents }
 */
public class FileContents implements IFileContents
{
    /**
     * Initializes a new instance of the <see cref="FileContents" /> class.
     *
     * @param contentStream The binary content stream.
     */
//C# TO JAVA CONVERTER TODO TASK: C# to Java Converter cannot determine whether this System.IO.Stream is input or output:
    public FileContents(InputStream contentStream)
    {
        ContentStream = contentStream;
    }

    /**
     * Initializes a new instance of the <see cref="FileContents" /> class.
     *
     * @param contents The binary contents.
     */
//C# TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: public FileContents(byte[] contents)
    public FileContents(byte[] contents)
    {
//C# TO JAVA CONVERTER TODO TASK: C# to Java Converter cannot determine whether this System.IO.MemoryStream is input or output:
        ContentStream = new MemoryStream(contents);
        getContentStream().setPosition(0);
    }

    /**
     * Gets the content stream.
     *
     * <value>The content stream.</value>
     */
//C# TO JAVA CONVERTER TODO TASK: C# to Java Converter cannot determine whether this System.IO.Stream is input or output:
    private Stream ContentStream;
//C# TO JAVA CONVERTER TODO TASK: C# to Java Converter cannot determine whether this System.IO.Stream is input or output:

    public final Stream getContentStream()
    {
        return ContentStream;
    }

    /**
     * Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources asynchronously.
     *
     * @return ValueTask.
     */
    public final ValueTask DisposeAsync()
    {
        getContentStream().Dispose();
        return new ValueTask(Task.CompletedTask);
    }

    /**
     * Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.
     */
    public final void close() throws IOException
    {
        getContentStream().Dispose();
    }
}
