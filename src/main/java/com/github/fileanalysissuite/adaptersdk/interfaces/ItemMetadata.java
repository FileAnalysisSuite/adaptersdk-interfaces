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
import microfocus.Common.CompactSerializer.*;
import java.util.*;
import java.io.*;
import java.time.*;

/** <inheritdoc />
 */
public class ItemMetadata implements IItemMetadata, Serializable
{
    /**
     * Initializes a new instance of the <see cref="ItemMetadata"/> class.
     *
     * @param name The file name.
     * @param itemLocation The item location.
     */
    public ItemMetadata(String name, String itemLocation)
    {
        setName(Guard.Argument(name, "name").NotNull().NotEmpty());
        setItemLocation(Guard.Argument(itemLocation, "itemLocation").NotNull().NotEmpty());
    }

    /**
     * Initializes a new instance of the <see cref="ItemMetadata"/> class.
     */
    public ItemMetadata()
    {
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(0)] public System.Nullable<string> ItemLocation {get;set;}
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: [PropertyIndex(0)] public string? ItemLocation {get;set;}
    private String ItemLocation;

    public final String getItemLocation()
    {
        return ItemLocation;
    }

    public final void setItemLocation(String value)
    {
        ItemLocation = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(1)] public System.Nullable<string> Name {get;set;}
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: [PropertyIndex(1)] public string? Name {get;set;}
    private String Name;

    public final String getName()
    {
        return Name;
    }

    public final void setName(String value)
    {
        Name = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(2)] public System.Nullable<string> Title {get;set;}
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: [PropertyIndex(2)] public string? Title {get;set;}
    private String Title;

    public final String getTitle()
    {
        return Title;
    }

    public final void setTitle(String value)
    {
        Title = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(3)] public long Size {get;set;}
    private long Size;

    public final long getSize()
    {
        return Size;
    }

    public final void setSize(long value)
    {
        Size = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(4)] public System.Nullable<DateTime> CreatedTime {get;set;}
    private LocalDateTime CreatedTime = null;

    public final LocalDateTime getCreatedTime()
    {
        return CreatedTime;
    }

    public final void setCreatedTime(LocalDateTime value)
    {
        CreatedTime = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(5)] public System.Nullable<DateTime> AccessedTime {get;set;}
    private LocalDateTime AccessedTime = null;

    public final LocalDateTime getAccessedTime()
    {
        return AccessedTime;
    }

    public final void setAccessedTime(LocalDateTime value)
    {
        AccessedTime = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(6)] public System.Nullable<DateTime> ModifiedTime {get;set;}
    private LocalDateTime ModifiedTime = null;

    public final LocalDateTime getModifiedTime()
    {
        return ModifiedTime;
    }

    public final void setModifiedTime(LocalDateTime value)
    {
        ModifiedTime = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(7)] public System.Nullable<int> Version {get;set;}
    private Integer Version = null;

    public final Integer getVersion()
    {
        return Version;
    }

    public final void setVersion(Integer value)
    {
        Version = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(8)] public System.Nullable<string> ContentHash {get;set;}
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: [PropertyIndex(8)] public string? ContentHash {get;set;}
    private String ContentHash;

    public final String getContentHash()
    {
        return ContentHash;
    }

    public final void setContentHash(String value)
    {
        ContentHash = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(9)] public System.Nullable<string> MetadataHash {get;set;}
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: [PropertyIndex(9)] public string? MetadataHash {get;set;}
    private String MetadataHash;

    public final String getMetadataHash()
    {
        return MetadataHash;
    }

    public final void setMetadataHash(String value)
    {
        MetadataHash = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(10)] public System.Nullable<ChangeType> ChangeType {get;set;}
    private ChangeType ChangeType = null;

    public final ChangeType getChangeType()
    {
        return ChangeType;
    }

    public final void setChangeType(ChangeType value)
    {
        ChangeType = value;
    }

    /** <inheritdoc />
     */
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [PropertyIndex(11)] public IDictionary<string, object> AdditionalMetadata {get;set;} = new Dictionary<string, object>();
    private Map<String, Object> AdditionalMetadata = new HashMap<String, Object>();

    public final Map<String, Object> getAdditionalMetadata()
    {
        return AdditionalMetadata;
    }

    public final void setAdditionalMetadata(Map<String, Object> value)
    {
        AdditionalMetadata = value;
    }
}
