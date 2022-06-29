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
 * Adapter Encryption / Decryption Service.
 *
 *
 * Allows a custom adapter to decrypt and encrypt the data.
 *
 */
public interface IAdapterEncryption
{
    /**
     * Decrypts the specified encrypted string.
     *
     *
     * If a <c>null7</c> value is provided in the <paramref name="encryptedStr"/> parameter, then this method will return <c>null</c>.
     *
     * @param encryptedStr The encrypted string.
     * @return Decrypted string.
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: string? Decrypt(string? encryptedStr);
    String Decrypt(String encryptedStr);

    /**
     * Encrypts the specified string.
     *
     *
     * If a <c>null7</c> value is provided in the <paramref name="str"/> parameter, then this method will return <c>null</c>.
     *
     * @param str The string to encrypt.
     * @return Base64-encoded string with the encrypted data.
     */
//C# TO JAVA CONVERTER WARNING: Nullable reference types have no equivalent in Java:
//ORIGINAL LINE: string? Encrypt(string? str);
    String Encrypt(String str);
}
