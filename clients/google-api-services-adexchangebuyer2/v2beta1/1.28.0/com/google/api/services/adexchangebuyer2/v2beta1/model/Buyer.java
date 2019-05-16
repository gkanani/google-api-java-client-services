/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * Represents a buyer of inventory. Each buyer is identified by a unique Authorized Buyers account
 * ID.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Buyer extends com.google.api.client.json.GenericJson {

  /**
   * Authorized Buyers account ID of the buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Authorized Buyers account ID of the buyer.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * Authorized Buyers account ID of the buyer.
   * @param accountId accountId or {@code null} for none
   */
  public Buyer setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  @Override
  public Buyer set(String fieldName, Object value) {
    return (Buyer) super.set(fieldName, value);
  }

  @Override
  public Buyer clone() {
    return (Buyer) super.clone();
  }

}