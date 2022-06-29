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
 * Links an item or a repository location with failure details.
 */
public class FailedItem implements IFailedItem
{
    /**
     * Initializes a new instance of the <see cref="FailedItem" /> class.
     *
     *
     * <p>
     * Parameter <paramref name="location" /> is optional. If not provided, the failure will be treated as non-location specific.<br />
     * However, in most cases, a location can be provided. It doesn't have to be a location of a file. It can be, for example, a folder id
     * or repository URL.
     * </p>
     *
     * @param location The location.
     * @param failureDetails The failure details.
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public FailedItem(string? location, IFailureDetails failureDetails)
    public FailedItem(String location, IFailureDetails failureDetails)
    {
        Location = location;
        FailureDetails = failureDetails;
    }

    /**
     * Gets the item identifier.
     *
     * <value>The item identifier.</value>
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: public string? Location {get;}
    private String Location;

    public final String getLocation()
    {
        return Location;
    }

    /**
     * Gets the failure details.
     *
     * <value>The failure details.</value>
     */
    private IFailureDetails FailureDetails;

    public final IFailureDetails getFailureDetails()
    {
        return FailureDetails;
    }
}
