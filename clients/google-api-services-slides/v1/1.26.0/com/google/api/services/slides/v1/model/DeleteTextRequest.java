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

package com.google.api.services.slides.v1.model;

/**
 * Deletes text from a shape or a table cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeleteTextRequest extends com.google.api.client.json.GenericJson {

  /**
   * The optional table cell location if the text is to be deleted from a table cell. If present,
   * the object_id must refer to a table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellLocation cellLocation;

  /**
   * The object ID of the shape or table from which the text will be deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The range of text to delete, based on TextElement indexes.
   *
   * There is always an implicit newline character at the end of a shape's or table cell's text that
   * cannot be deleted. `Range.Type.ALL` will use the correct bounds, but care must be taken when
   * specifying explicit bounds for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example,
   * if the text is "ABC", followed by an implicit newline, then the maximum value is 2 for
   * `text_range.start_index` and 3 for `text_range.end_index`.
   *
   * Deleting text that crosses a paragraph boundary may result in changes to paragraph styles and
   * lists as the two paragraphs are merged.
   *
   * Ranges that include only one code unit of a surrogate pair are expanded to include both code
   * units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Range textRange;

  /**
   * The optional table cell location if the text is to be deleted from a table cell. If present,
   * the object_id must refer to a table.
   * @return value or {@code null} for none
   */
  public TableCellLocation getCellLocation() {
    return cellLocation;
  }

  /**
   * The optional table cell location if the text is to be deleted from a table cell. If present,
   * the object_id must refer to a table.
   * @param cellLocation cellLocation or {@code null} for none
   */
  public DeleteTextRequest setCellLocation(TableCellLocation cellLocation) {
    this.cellLocation = cellLocation;
    return this;
  }

  /**
   * The object ID of the shape or table from which the text will be deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the shape or table from which the text will be deleted.
   * @param objectId objectId or {@code null} for none
   */
  public DeleteTextRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The range of text to delete, based on TextElement indexes.
   *
   * There is always an implicit newline character at the end of a shape's or table cell's text that
   * cannot be deleted. `Range.Type.ALL` will use the correct bounds, but care must be taken when
   * specifying explicit bounds for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example,
   * if the text is "ABC", followed by an implicit newline, then the maximum value is 2 for
   * `text_range.start_index` and 3 for `text_range.end_index`.
   *
   * Deleting text that crosses a paragraph boundary may result in changes to paragraph styles and
   * lists as the two paragraphs are merged.
   *
   * Ranges that include only one code unit of a surrogate pair are expanded to include both code
   * units.
   * @return value or {@code null} for none
   */
  public Range getTextRange() {
    return textRange;
  }

  /**
   * The range of text to delete, based on TextElement indexes.
   *
   * There is always an implicit newline character at the end of a shape's or table cell's text that
   * cannot be deleted. `Range.Type.ALL` will use the correct bounds, but care must be taken when
   * specifying explicit bounds for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example,
   * if the text is "ABC", followed by an implicit newline, then the maximum value is 2 for
   * `text_range.start_index` and 3 for `text_range.end_index`.
   *
   * Deleting text that crosses a paragraph boundary may result in changes to paragraph styles and
   * lists as the two paragraphs are merged.
   *
   * Ranges that include only one code unit of a surrogate pair are expanded to include both code
   * units.
   * @param textRange textRange or {@code null} for none
   */
  public DeleteTextRequest setTextRange(Range textRange) {
    this.textRange = textRange;
    return this;
  }

  @Override
  public DeleteTextRequest set(String fieldName, Object value) {
    return (DeleteTextRequest) super.set(fieldName, value);
  }

  @Override
  public DeleteTextRequest clone() {
    return (DeleteTextRequest) super.clone();
  }

}