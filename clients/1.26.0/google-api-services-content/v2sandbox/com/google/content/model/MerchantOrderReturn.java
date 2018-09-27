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

package com.google.content.model;

/**
 * Model definition for MerchantOrderReturn.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MerchantOrderReturn extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String merchantOrderId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderReturnId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MerchantOrderReturnItem> returnItems;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReturnShipment> returnShipments;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationDate() {
    return creationDate;
  }

  /**
   * @param creationDate creationDate or {@code null} for none
   */
  public MerchantOrderReturn setCreationDate(java.lang.String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMerchantOrderId() {
    return merchantOrderId;
  }

  /**
   * @param merchantOrderId merchantOrderId or {@code null} for none
   */
  public MerchantOrderReturn setMerchantOrderId(java.lang.String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderId() {
    return orderId;
  }

  /**
   * @param orderId orderId or {@code null} for none
   */
  public MerchantOrderReturn setOrderId(java.lang.String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderReturnId() {
    return orderReturnId;
  }

  /**
   * @param orderReturnId orderReturnId or {@code null} for none
   */
  public MerchantOrderReturn setOrderReturnId(java.lang.String orderReturnId) {
    this.orderReturnId = orderReturnId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MerchantOrderReturnItem> getReturnItems() {
    return returnItems;
  }

  /**
   * @param returnItems returnItems or {@code null} for none
   */
  public MerchantOrderReturn setReturnItems(java.util.List<MerchantOrderReturnItem> returnItems) {
    this.returnItems = returnItems;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ReturnShipment> getReturnShipments() {
    return returnShipments;
  }

  /**
   * @param returnShipments returnShipments or {@code null} for none
   */
  public MerchantOrderReturn setReturnShipments(java.util.List<ReturnShipment> returnShipments) {
    this.returnShipments = returnShipments;
    return this;
  }

  @Override
  public MerchantOrderReturn set(String fieldName, Object value) {
    return (MerchantOrderReturn) super.set(fieldName, value);
  }

  @Override
  public MerchantOrderReturn clone() {
    return (MerchantOrderReturn) super.clone();
  }

}
