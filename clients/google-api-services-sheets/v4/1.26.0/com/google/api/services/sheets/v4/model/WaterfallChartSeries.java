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

package com.google.api.services.sheets.v4.model;

/**
 * A single series of data for a waterfall chart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WaterfallChartSeries extends com.google.api.client.json.GenericJson {

  /**
   * Custom subtotal columns appearing in this series. The order in which subtotals are defined is
   * not significant. Only one subtotal may be defined for each data point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WaterfallChartCustomSubtotal> customSubtotals;

  static {
    // hack to force ProGuard to consider WaterfallChartCustomSubtotal used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WaterfallChartCustomSubtotal.class);
  }

  /**
   * The data being visualized in this series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData data;

  /**
   * True to hide the subtotal column from the end of the series. By default, a subtotal column will
   * appear at the end of each series. Setting this field to true will hide that subtotal column for
   * this series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hideTrailingSubtotal;

  /**
   * Styles for all columns in this series with negative values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WaterfallChartColumnStyle negativeColumnsStyle;

  /**
   * Styles for all columns in this series with positive values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WaterfallChartColumnStyle positiveColumnsStyle;

  /**
   * Styles for all subtotal columns in this series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WaterfallChartColumnStyle subtotalColumnsStyle;

  /**
   * Custom subtotal columns appearing in this series. The order in which subtotals are defined is
   * not significant. Only one subtotal may be defined for each data point.
   * @return value or {@code null} for none
   */
  public java.util.List<WaterfallChartCustomSubtotal> getCustomSubtotals() {
    return customSubtotals;
  }

  /**
   * Custom subtotal columns appearing in this series. The order in which subtotals are defined is
   * not significant. Only one subtotal may be defined for each data point.
   * @param customSubtotals customSubtotals or {@code null} for none
   */
  public WaterfallChartSeries setCustomSubtotals(java.util.List<WaterfallChartCustomSubtotal> customSubtotals) {
    this.customSubtotals = customSubtotals;
    return this;
  }

  /**
   * The data being visualized in this series.
   * @return value or {@code null} for none
   */
  public ChartData getData() {
    return data;
  }

  /**
   * The data being visualized in this series.
   * @param data data or {@code null} for none
   */
  public WaterfallChartSeries setData(ChartData data) {
    this.data = data;
    return this;
  }

  /**
   * True to hide the subtotal column from the end of the series. By default, a subtotal column will
   * appear at the end of each series. Setting this field to true will hide that subtotal column for
   * this series.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHideTrailingSubtotal() {
    return hideTrailingSubtotal;
  }

  /**
   * True to hide the subtotal column from the end of the series. By default, a subtotal column will
   * appear at the end of each series. Setting this field to true will hide that subtotal column for
   * this series.
   * @param hideTrailingSubtotal hideTrailingSubtotal or {@code null} for none
   */
  public WaterfallChartSeries setHideTrailingSubtotal(java.lang.Boolean hideTrailingSubtotal) {
    this.hideTrailingSubtotal = hideTrailingSubtotal;
    return this;
  }

  /**
   * Styles for all columns in this series with negative values.
   * @return value or {@code null} for none
   */
  public WaterfallChartColumnStyle getNegativeColumnsStyle() {
    return negativeColumnsStyle;
  }

  /**
   * Styles for all columns in this series with negative values.
   * @param negativeColumnsStyle negativeColumnsStyle or {@code null} for none
   */
  public WaterfallChartSeries setNegativeColumnsStyle(WaterfallChartColumnStyle negativeColumnsStyle) {
    this.negativeColumnsStyle = negativeColumnsStyle;
    return this;
  }

  /**
   * Styles for all columns in this series with positive values.
   * @return value or {@code null} for none
   */
  public WaterfallChartColumnStyle getPositiveColumnsStyle() {
    return positiveColumnsStyle;
  }

  /**
   * Styles for all columns in this series with positive values.
   * @param positiveColumnsStyle positiveColumnsStyle or {@code null} for none
   */
  public WaterfallChartSeries setPositiveColumnsStyle(WaterfallChartColumnStyle positiveColumnsStyle) {
    this.positiveColumnsStyle = positiveColumnsStyle;
    return this;
  }

  /**
   * Styles for all subtotal columns in this series.
   * @return value or {@code null} for none
   */
  public WaterfallChartColumnStyle getSubtotalColumnsStyle() {
    return subtotalColumnsStyle;
  }

  /**
   * Styles for all subtotal columns in this series.
   * @param subtotalColumnsStyle subtotalColumnsStyle or {@code null} for none
   */
  public WaterfallChartSeries setSubtotalColumnsStyle(WaterfallChartColumnStyle subtotalColumnsStyle) {
    this.subtotalColumnsStyle = subtotalColumnsStyle;
    return this;
  }

  @Override
  public WaterfallChartSeries set(String fieldName, Object value) {
    return (WaterfallChartSeries) super.set(fieldName, value);
  }

  @Override
  public WaterfallChartSeries clone() {
    return (WaterfallChartSeries) super.clone();
  }

}