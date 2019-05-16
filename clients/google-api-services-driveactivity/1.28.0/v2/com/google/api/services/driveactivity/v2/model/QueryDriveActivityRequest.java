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

package com.google.api.services.driveactivity.v2.model;

/**
 * The request message for querying Drive activity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryDriveActivityRequest extends com.google.api.client.json.GenericJson {

  /**
   * Return activities for this Drive folder and all children and descendants. The format is
   * "items/ITEM_ID".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ancestorName;

  /**
   * Details on how to consolidate related actions that make up the activity. If not set, then
   * related actions will not be consolidated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConsolidationStrategy consolidationStrategy;

  /**
   * The filtering for items returned from this query request. The format of the filter string is a
   * sequence of expressions, joined by an optional "AND", where each expression is of the form
   * "field operator value".
   *
   * Supported fields:
   *
   *   - time: Uses numerical operators on date values either in     terms of milliseconds since Jan
   * 1, 1970 or in RFC 3339 format.     Examples:       - time > 1452409200000 AND time <=
   * 1492812924310       - time >= "2016-01-10T01:02:03-05:00"
   *
   *   - detail.action_detail_case: Uses the "has" operator (:) and     either a singular value or a
   * list of allowed action types enclosed in     parentheses.     Examples:       -
   * detail.action_detail_case: RENAME       - detail.action_detail_case:(CREATE UPLOAD)       -
   * -detail.action_detail_case:MOVE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Return activities for this Drive item. The format is "items/ITEM_ID".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemName;

  /**
   * The requested number of activity to return. If not set, a default value will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The next_page_token value returned from a previous QueryDriveActivity request, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Return activities for this Drive folder and all children and descendants. The format is
   * "items/ITEM_ID".
   * @return value or {@code null} for none
   */
  public java.lang.String getAncestorName() {
    return ancestorName;
  }

  /**
   * Return activities for this Drive folder and all children and descendants. The format is
   * "items/ITEM_ID".
   * @param ancestorName ancestorName or {@code null} for none
   */
  public QueryDriveActivityRequest setAncestorName(java.lang.String ancestorName) {
    this.ancestorName = ancestorName;
    return this;
  }

  /**
   * Details on how to consolidate related actions that make up the activity. If not set, then
   * related actions will not be consolidated.
   * @return value or {@code null} for none
   */
  public ConsolidationStrategy getConsolidationStrategy() {
    return consolidationStrategy;
  }

  /**
   * Details on how to consolidate related actions that make up the activity. If not set, then
   * related actions will not be consolidated.
   * @param consolidationStrategy consolidationStrategy or {@code null} for none
   */
  public QueryDriveActivityRequest setConsolidationStrategy(ConsolidationStrategy consolidationStrategy) {
    this.consolidationStrategy = consolidationStrategy;
    return this;
  }

  /**
   * The filtering for items returned from this query request. The format of the filter string is a
   * sequence of expressions, joined by an optional "AND", where each expression is of the form
   * "field operator value".
   *
   * Supported fields:
   *
   *   - time: Uses numerical operators on date values either in     terms of milliseconds since Jan
   * 1, 1970 or in RFC 3339 format.     Examples:       - time > 1452409200000 AND time <=
   * 1492812924310       - time >= "2016-01-10T01:02:03-05:00"
   *
   *   - detail.action_detail_case: Uses the "has" operator (:) and     either a singular value or a
   * list of allowed action types enclosed in     parentheses.     Examples:       -
   * detail.action_detail_case: RENAME       - detail.action_detail_case:(CREATE UPLOAD)       -
   * -detail.action_detail_case:MOVE
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * The filtering for items returned from this query request. The format of the filter string is a
   * sequence of expressions, joined by an optional "AND", where each expression is of the form
   * "field operator value".
   *
   * Supported fields:
   *
   *   - time: Uses numerical operators on date values either in     terms of milliseconds since Jan
   * 1, 1970 or in RFC 3339 format.     Examples:       - time > 1452409200000 AND time <=
   * 1492812924310       - time >= "2016-01-10T01:02:03-05:00"
   *
   *   - detail.action_detail_case: Uses the "has" operator (:) and     either a singular value or a
   * list of allowed action types enclosed in     parentheses.     Examples:       -
   * detail.action_detail_case: RENAME       - detail.action_detail_case:(CREATE UPLOAD)       -
   * -detail.action_detail_case:MOVE
   * @param filter filter or {@code null} for none
   */
  public QueryDriveActivityRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Return activities for this Drive item. The format is "items/ITEM_ID".
   * @return value or {@code null} for none
   */
  public java.lang.String getItemName() {
    return itemName;
  }

  /**
   * Return activities for this Drive item. The format is "items/ITEM_ID".
   * @param itemName itemName or {@code null} for none
   */
  public QueryDriveActivityRequest setItemName(java.lang.String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The requested number of activity to return. If not set, a default value will be used.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The requested number of activity to return. If not set, a default value will be used.
   * @param pageSize pageSize or {@code null} for none
   */
  public QueryDriveActivityRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The next_page_token value returned from a previous QueryDriveActivity request, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The next_page_token value returned from a previous QueryDriveActivity request, if any.
   * @param pageToken pageToken or {@code null} for none
   */
  public QueryDriveActivityRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  @Override
  public QueryDriveActivityRequest set(String fieldName, Object value) {
    return (QueryDriveActivityRequest) super.set(fieldName, value);
  }

  @Override
  public QueryDriveActivityRequest clone() {
    return (QueryDriveActivityRequest) super.clone();
  }

}