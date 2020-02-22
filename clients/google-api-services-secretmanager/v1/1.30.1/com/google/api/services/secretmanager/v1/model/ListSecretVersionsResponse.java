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

package com.google.api.services.secretmanager.v1.model;

/**
 * Response message for SecretManagerService.ListSecretVersions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Secret Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListSecretVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve the next page of results. Pass this value in
   * ListSecretVersionsRequest.page_token to retrieve the next page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The total number of SecretVersions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * The list of SecretVersions sorted in reverse by create_time (newest first).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SecretVersion> versions;

  /**
   * A token to retrieve the next page of results. Pass this value in
   * ListSecretVersionsRequest.page_token to retrieve the next page.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results. Pass this value in
   * ListSecretVersionsRequest.page_token to retrieve the next page.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListSecretVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The total number of SecretVersions.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The total number of SecretVersions.
   * @param totalSize totalSize or {@code null} for none
   */
  public ListSecretVersionsResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * The list of SecretVersions sorted in reverse by create_time (newest first).
   * @return value or {@code null} for none
   */
  public java.util.List<SecretVersion> getVersions() {
    return versions;
  }

  /**
   * The list of SecretVersions sorted in reverse by create_time (newest first).
   * @param versions versions or {@code null} for none
   */
  public ListSecretVersionsResponse setVersions(java.util.List<SecretVersion> versions) {
    this.versions = versions;
    return this;
  }

  @Override
  public ListSecretVersionsResponse set(String fieldName, Object value) {
    return (ListSecretVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListSecretVersionsResponse clone() {
    return (ListSecretVersionsResponse) super.clone();
  }

}
