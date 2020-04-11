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

package com.google.api.services.gmail.model;

/**
 * Configuration for communication with an SMTP service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SmtpMsa extends com.google.api.client.json.GenericJson {

  /**
   * The hostname of the SMTP service.  Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * The password that will be used for authentication with the SMTP service. This is a write-only
   * field that can be specified in requests to create or update SendAs settings; it is never
   * populated in responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The port of the SMTP service.  Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * The protocol that will be used to secure communication with the SMTP service.  Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String securityMode;

  /**
   * The username that will be used for authentication with the SMTP service. This is a write-only
   * field that can be specified in requests to create or update SendAs settings; it is never
   * populated in responses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * The hostname of the SMTP service.  Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * The hostname of the SMTP service.  Required.
   * @param host host or {@code null} for none
   */
  public SmtpMsa setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * The password that will be used for authentication with the SMTP service. This is a write-only
   * field that can be specified in requests to create or update SendAs settings; it is never
   * populated in responses.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * The password that will be used for authentication with the SMTP service. This is a write-only
   * field that can be specified in requests to create or update SendAs settings; it is never
   * populated in responses.
   * @param password password or {@code null} for none
   */
  public SmtpMsa setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * The port of the SMTP service.  Required.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The port of the SMTP service.  Required.
   * @param port port or {@code null} for none
   */
  public SmtpMsa setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * The protocol that will be used to secure communication with the SMTP service.  Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecurityMode() {
    return securityMode;
  }

  /**
   * The protocol that will be used to secure communication with the SMTP service.  Required.
   * @param securityMode securityMode or {@code null} for none
   */
  public SmtpMsa setSecurityMode(java.lang.String securityMode) {
    this.securityMode = securityMode;
    return this;
  }

  /**
   * The username that will be used for authentication with the SMTP service. This is a write-only
   * field that can be specified in requests to create or update SendAs settings; it is never
   * populated in responses.
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * The username that will be used for authentication with the SMTP service. This is a write-only
   * field that can be specified in requests to create or update SendAs settings; it is never
   * populated in responses.
   * @param username username or {@code null} for none
   */
  public SmtpMsa setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public SmtpMsa set(String fieldName, Object value) {
    return (SmtpMsa) super.set(fieldName, value);
  }

  @Override
  public SmtpMsa clone() {
    return (SmtpMsa) super.clone();
  }

}
