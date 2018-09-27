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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * An invitation for a new client user to get access to the Authorized Buyers UI. All fields are
 * required unless otherwise specified.
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
public final class ClientUserInvitation extends com.google.api.client.json.GenericJson {

  /**
   * Numerical account ID of the client buyer that the invited user is associated with. The value of
   * this field is ignored in create operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long clientAccountId;

  /**
   * The email address to which the invitation is sent. Email addresses should be unique among all
   * client users under each sponsor buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The unique numerical ID of the invitation that is sent to the user. The value of this field is
   * ignored in create operations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long invitationId;

  /**
   * Numerical account ID of the client buyer that the invited user is associated with. The value of
   * this field is ignored in create operations.
   * @return value or {@code null} for none
   */
  public java.lang.Long getClientAccountId() {
    return clientAccountId;
  }

  /**
   * Numerical account ID of the client buyer that the invited user is associated with. The value of
   * this field is ignored in create operations.
   * @param clientAccountId clientAccountId or {@code null} for none
   */
  public ClientUserInvitation setClientAccountId(java.lang.Long clientAccountId) {
    this.clientAccountId = clientAccountId;
    return this;
  }

  /**
   * The email address to which the invitation is sent. Email addresses should be unique among all
   * client users under each sponsor buyer.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The email address to which the invitation is sent. Email addresses should be unique among all
   * client users under each sponsor buyer.
   * @param email email or {@code null} for none
   */
  public ClientUserInvitation setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The unique numerical ID of the invitation that is sent to the user. The value of this field is
   * ignored in create operations.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInvitationId() {
    return invitationId;
  }

  /**
   * The unique numerical ID of the invitation that is sent to the user. The value of this field is
   * ignored in create operations.
   * @param invitationId invitationId or {@code null} for none
   */
  public ClientUserInvitation setInvitationId(java.lang.Long invitationId) {
    this.invitationId = invitationId;
    return this;
  }

  @Override
  public ClientUserInvitation set(String fieldName, Object value) {
    return (ClientUserInvitation) super.set(fieldName, value);
  }

  @Override
  public ClientUserInvitation clone() {
    return (ClientUserInvitation) super.clone();
  }

}
