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
 * Represents a results handler that can register a failure.
 */
public interface IFailureRegistration
{
    /**
     * Registers a failure.
     *
     * @param itemLocation A full location or identifier of an item in the repository.
     * @param failureDetails Failure details.
     *
     * Registers a failure for a specific item or a repository location.
     *
     * <example>
     * In the example of the <c>RegisterFailure</c> method usage below, the construction of <c>FileInfo</c>
     * and opening of the file stream (<c>OpenRead</c>) can cause an exception to be thrown. Those failures should be handled by the
     * adapter and reported back to FAS using <c>RegisterFailure</c> method.
     * <code title="RegisterFailure Usage">
     * public async Task RetrieveFilesDataAsync(RetrieveFilesDataRequest request, IFileDataResultsHandler handler, CancellationToken
     * cancellationToken) { foreach (var repositoryItem in request.Items) { try { // Both of those operations can fail var file = new
     * FileInfo(repositoryItem.Metadata.ItemLocation); var fileStream = file.OpenRead(); // processing and queueing contents... } catch
     * (Exception ex) { _logger.LogError(ex, "Failed to obtain file contents for {ItemLocation}", repositoryItem.Metadata.ItemLocation);
     * // Register a failure for the current item. Exceptions message is automatically added to the reported failure.
     * handler.RegisterFailure(repositoryItem.Metadata.ItemLocation, new FailureDetails($"Failed to obtain file contents", ex)); } }
     * }</code>
     * </example>
     */
    ValueTask RegisterFailureAsync(String itemLocation, IFailureDetails failureDetails);

    /**
     * Registers the failure not related to a specific item or location.
     *
     * @param failureDetails The failure details.
     * <example>
     * The example below demonstrates how to register a failure that is not specific to any location. In this case, the operation has
     * failed before any processing occurred.
     * <code title="RegisterFailure usage">
     * public async Task RetrieveFilesDataAsync(RetrieveFilesDataRequest request, IFileDataResultsHandler handler, CancellationToken
     * cancellationToken) { var userName = request.RepositoryProperties.RepositoryOptions["UserName"].ToString(); var password =
     * request.RepositoryProperties.RepositoryOptions["Password"].ToString(); try { // Log into the repository service and obtain an
     * authentication token... // This operation can fail with an exception var serviceToken = LogIn(userName, password); // Do further
     * processing of the request.... } catch (Exception ex) { _logger.LogError(ex, "Failed to log into the repository"); // Register a
     * failure that is not specific to an item or a location - we were not able to process any item yet. // Exceptions message is
     * automatically added to the reported failure. handler.RegisterFailure(new FailureDetails($"Failed to log in {userName} to the
     * repository", ex)); } }</code></example>
     */
    ValueTask RegisterFailureAsync(IFailureDetails failureDetails);
}
