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
 * Adapter configuration options.
 */
public class AdapterConfiguration
{
    /**
     * Gets or sets the size of the thread pool.
     *
     * <value>The size of the thread pool.</value>
     */
    private Integer ThreadPoolSize = null;

    public final Integer getThreadPoolSize()
    {
        return ThreadPoolSize;
    }

    public final void setThreadPoolSize(Integer value)
    {
        ThreadPoolSize = value;
    }

    /**
     * The number of file data items (contents) are queued for processing before the actual sending starts.
     */
    private int FileDataBatchSize = 100;

    public final int getFileDataBatchSize()
    {
        return FileDataBatchSize;
    }

    public final void setFileDataBatchSize(int value)
    {
        FileDataBatchSize = value;
    }
}
