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
 * The type of a file change between versions.
 *
 *
 * Used in an implementation of <see cref="IItemComparator" /> to specify what type of a change occurred between a recorded (previous) and
 * the current version of a <see cref="IRepositoryItem" />.
 *
 */
public enum ChangeType
{
    /**
     * A file is new.
     *
     *
     * Used when a new file is detected in a repository.
     *
     */
    New,
    /**
     * An updated file has metadata changed only.
     *
     *
     * Used when a file comparison doesn't detect any content changes but a file properties have changed.
     *
     */
    MetadataChanged,
    /**
     * An update file had binary content updated.
     *
     *
     * Used when a comparison of a previous version and the current version of a file detects that the binary content was changed.
     *
     */
    FileChanged,
    /**
     * A file was unchanged
     *
     *
     * Used when a comparison of a previous version and the current version ofa file detects that the file was not changed.
     *
     */
    Unchanged;

    public static final int SIZE = java.lang.Integer.SIZE;

    public int getValue()
    {
        return this.ordinal();
    }

    public static ChangeType forValue(int value)
    {
        return values()[value];
    }
}
