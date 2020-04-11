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

package com.google.api.services.jobs.v2.model;

/**
 * Output only.
 *
 * Resource that represents completion results.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompletionResult extends com.google.api.client.json.GenericJson {

  /**
   * The URL for the company logo if `type=COMPANY_NAME`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * The suggestion for the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String suggestion;

  /**
   * The completion topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The URL for the company logo if `type=COMPANY_NAME`.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * The URL for the company logo if `type=COMPANY_NAME`.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public CompletionResult setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The suggestion for the query.
   * @return value or {@code null} for none
   */
  public java.lang.String getSuggestion() {
    return suggestion;
  }

  /**
   * The suggestion for the query.
   * @param suggestion suggestion or {@code null} for none
   */
  public CompletionResult setSuggestion(java.lang.String suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  /**
   * The completion topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The completion topic.
   * @param type type or {@code null} for none
   */
  public CompletionResult setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public CompletionResult set(String fieldName, Object value) {
    return (CompletionResult) super.set(fieldName, value);
  }

  @Override
  public CompletionResult clone() {
    return (CompletionResult) super.clone();
  }

}
