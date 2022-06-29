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
 * Predefined names of the repository options.
 */
public final class RepositoryOptionNames
{
    /**
     * The filter.
     */
    public static final String Filter = "Filter";

    /**
     * The included file extensions CSV values.
     */
    public static final String FileExtensionsMustHaveCSVs = "FileExtnMustHaveCSVs";

    /**
     * The excluded file extensions CSV values.
     */
    public static final String FileExtensionsCantHaveCSVs = "FileExtnCantHaveCSVs";

    /**
     * Additional token that can be passed to and from the cloud.
     *
     *
     * This token can be used to handle sources that support change log. On initial query, an adapter would normally receive some type of
     * a handle (id, token) that can be used in subsequent queries. If a token is passed, then the changes would normally include items
     * that were changed since the original token was generated.
     *
     */
    public static final String Token = "Token";
}
