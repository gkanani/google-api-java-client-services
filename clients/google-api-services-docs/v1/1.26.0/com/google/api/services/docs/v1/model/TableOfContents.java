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

package com.google.api.services.docs.v1.model;

/**
 * A StructuralElement representing a table of contents.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableOfContents extends com.google.api.client.json.GenericJson {

  /**
   * The content of the table of contents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StructuralElement> content;

  static {
    // hack to force ProGuard to consider StructuralElement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StructuralElement.class);
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedDeletionIds;

  /**
   * The suggested insertion IDs. A TableOfContents may have multiple insertion IDs if it is a
   * nested suggested change. If empty, then this is not a suggested insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestedInsertionIds;

  /**
   * The content of the table of contents.
   * @return value or {@code null} for none
   */
  public java.util.List<StructuralElement> getContent() {
    return content;
  }

  /**
   * The content of the table of contents.
   * @param content content or {@code null} for none
   */
  public TableOfContents setContent(java.util.List<StructuralElement> content) {
    this.content = content;
    return this;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedDeletionIds() {
    return suggestedDeletionIds;
  }

  /**
   * The suggested deletion IDs. If empty, then there are no suggested deletions of this content.
   * @param suggestedDeletionIds suggestedDeletionIds or {@code null} for none
   */
  public TableOfContents setSuggestedDeletionIds(java.util.List<java.lang.String> suggestedDeletionIds) {
    this.suggestedDeletionIds = suggestedDeletionIds;
    return this;
  }

  /**
   * The suggested insertion IDs. A TableOfContents may have multiple insertion IDs if it is a
   * nested suggested change. If empty, then this is not a suggested insertion.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestedInsertionIds() {
    return suggestedInsertionIds;
  }

  /**
   * The suggested insertion IDs. A TableOfContents may have multiple insertion IDs if it is a
   * nested suggested change. If empty, then this is not a suggested insertion.
   * @param suggestedInsertionIds suggestedInsertionIds or {@code null} for none
   */
  public TableOfContents setSuggestedInsertionIds(java.util.List<java.lang.String> suggestedInsertionIds) {
    this.suggestedInsertionIds = suggestedInsertionIds;
    return this;
  }

  @Override
  public TableOfContents set(String fieldName, Object value) {
    return (TableOfContents) super.set(fieldName, value);
  }

  @Override
  public TableOfContents clone() {
    return (TableOfContents) super.clone();
  }

}