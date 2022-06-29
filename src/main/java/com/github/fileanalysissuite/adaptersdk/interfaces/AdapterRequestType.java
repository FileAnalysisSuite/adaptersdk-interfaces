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
 * Type of the request.
 */
public enum AdapterRequestType
{
    /**
     * Captures the items specified in a list.
     */
    CaptureWithList,
    /**
     * Gets list of items to Capture.
     */
    CaptureGetList,
    /**
     * Collect the specified item(s).
     */
    Collect,
    /**
     * Delete the specified item(s).
     */
    Delete,
    /**
     * Holds the specified item(s).
     */
    Hold,
    /**
     * Releases the specified item(s).
     */
    Release,
    /**
     * Stage the specified items(s) locally.
     */
    Stage,
    /**
     * Store the specified items(s) to target repo.
     */
    Store,
    /**
     * This is the command we get from the cloud (becomes a set of stage + store actions on our side).
     */
    TargetWithList,
    /**
     * IndexContent the specified items(s), i.e. "upgrade" them from metadata only to indexed.
     */
    IndexContent,
    /**
     * Encrypts source files.
     */
    Encrypt,
    /**
     * metadata requests (fetching CM Origin list, SmartCipher profile list, etc
     */
    Metadata;

    public static final int SIZE = java.lang.Integer.SIZE;

    public int getValue()
    {
        return this.ordinal();
    }

    public static AdapterRequestType forValue(int value)
    {
        return values()[value];
    }
}
