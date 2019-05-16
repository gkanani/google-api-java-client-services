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
 * A solid color fill. The page or page element is filled entirely with the specified color value.
 *
 * If any field is unset, its value may be inherited from a parent placeholder if it exists.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SolidFill extends com.google.api.client.json.GenericJson {

  /**
   * The fraction of this `color` that should be applied to the pixel. That is, the final pixel
   * color is defined by the equation:
   *
   *   pixel color = alpha * (color) + (1.0 - alpha) * (background color)
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas a value of 0.0 corresponds
   * to a completely transparent color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float alpha;

  /**
   * The color value of the solid fill.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OpaqueColor color;

  /**
   * The fraction of this `color` that should be applied to the pixel. That is, the final pixel
   * color is defined by the equation:
   *
   *   pixel color = alpha * (color) + (1.0 - alpha) * (background color)
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas a value of 0.0 corresponds
   * to a completely transparent color.
   * @return value or {@code null} for none
   */
  public java.lang.Float getAlpha() {
    return alpha;
  }

  /**
   * The fraction of this `color` that should be applied to the pixel. That is, the final pixel
   * color is defined by the equation:
   *
   *   pixel color = alpha * (color) + (1.0 - alpha) * (background color)
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas a value of 0.0 corresponds
   * to a completely transparent color.
   * @param alpha alpha or {@code null} for none
   */
  public SolidFill setAlpha(java.lang.Float alpha) {
    this.alpha = alpha;
    return this;
  }

  /**
   * The color value of the solid fill.
   * @return value or {@code null} for none
   */
  public OpaqueColor getColor() {
    return color;
  }

  /**
   * The color value of the solid fill.
   * @param color color or {@code null} for none
   */
  public SolidFill setColor(OpaqueColor color) {
    this.color = color;
    return this;
  }

  @Override
  public SolidFill set(String fieldName, Object value) {
    return (SolidFill) super.set(fieldName, value);
  }

  @Override
  public SolidFill clone() {
    return (SolidFill) super.clone();
  }

}