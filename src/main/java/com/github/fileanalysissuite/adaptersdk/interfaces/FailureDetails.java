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

import Dawn.*;
import java.util.*;

/**
 * Details of a failure.
 *
 *
 * Class used to record errors during processing of a repository command. Allows to capture a message and multiple exceptions for
 * reporting in FAS.
 *
 */
public class FailureDetails implements IFailureDetails
{
    /**
     * Initializes a new instance of the <see cref="FailureDetails" /> class.
     *
     * @param message The failure message.
     * @param exceptions Optionally, the exceptions encountered.
     */
    public FailureDetails(String message, RuntimeException... exceptions)
    {
        Guard.Argument(exceptions, "exceptions").NotNull();
        Exceptions = new ArrayList<RuntimeException>(exceptions);
        Message = Guard.Argument(message, "message").NotNull().NotEmpty();
    }

    /**
     * Gets the recorded Exceptions.
     *
     * <value>The exceptions.</value>
     */
    private Collection<RuntimeException> Exceptions;

    public final Collection<RuntimeException> getExceptions()
    {
        return Exceptions;
    }

    /**
     * Gets the failure message.
     *
     * <value>The message.</value>
     */
    private String Message;

    public final String getMessage()
    {
        return Message;
    }

    /**
     * Gets the properties.
     *
     *
     * This property allows to record custom properties together with the failure message and details.
     *
     * <value>The properties.</value>
     */
    private Map<String, Object> Properties = new HashMap<String, Object>();

    public final Map<String, Object> getProperties()
    {
        return Properties;
    }
}
