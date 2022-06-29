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

import Destructurama.Attributed.*;
import java.util.*;

/** <inheritdoc />
 */
public class RepositoryProperties implements IRepositoryProperties
{
    /** <inheritdoc />
     */
    private boolean GenerateContentHash;

    public final boolean getGenerateContentHash()
    {
        return GenerateContentHash;
    }

    public final void setGenerateContentHash(boolean value)
    {
        GenerateContentHash = value;
    }

    /** <inheritdoc />
     */
    private boolean GenerateMetadataHash;

    public final boolean getGenerateMetadataHash()
    {
        return GenerateMetadataHash;
    }

    public final void setGenerateMetadataHash(boolean value)
    {
        GenerateMetadataHash = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [LogAsScalar] public IDictionary<string, object> ConfigurationOptions {get;} = new Dictionary<string, object>();
    private Map<String, Object> ConfigurationOptions = new HashMap<String, Object>();

    public final Map<String, Object> getConfigurationOptions()
    {
        return ConfigurationOptions;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [LogAsScalar] public IDictionary<string, object> RepositoryOptions {get;} = new Dictionary<string, object>();
    private Map<String, Object> RepositoryOptions = new HashMap<String, Object>();

    public final Map<String, Object> getRepositoryOptions()
    {
        return RepositoryOptions;
    }
}
