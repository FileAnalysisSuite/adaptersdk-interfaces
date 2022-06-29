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
 * The file version comparison component.
 *
 *
 * Implement this interface on a repository adapter to make it responsible for a comparison of an old and current version of items.
 *
 */
public interface IItemComparator
{
    /**
     * Compares the <see cref="RepositoryItem" /> items.
     *
     * @param existingItem The old item.
     * @param currentItem The current item.
     * @return The change type.
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: ChangeType CompareItems(IRepositoryItem? existingItem, IRepositoryItem currentItem);
    ChangeType CompareItems(IRepositoryItem existingItem, IRepositoryItem currentItem);
}
