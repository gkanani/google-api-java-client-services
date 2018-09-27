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
 * Note: this resource requires whitelisting for access. Please contact your account manager for
 * access to Marketplace resources.
 *
 * Represents a proposal in the Marketplace. A proposal is the unit of negotiation between a seller
 * and a buyer and contains deals which are served.
 *
 * Note: you can not update, create, or otherwise modify Private Auction or Preferred Deals deals
 * through the API.
 *
 * Fields are updatable unless noted otherwise.
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
public final class Proposal extends com.google.api.client.json.GenericJson {

  /**
   * Reference to the buyer that will get billed for this proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer billedBuyer;

  /**
   * Reference to the buyer on the proposal.
   *
   * Note: This field may be set only when creating the resource. Modifying this field while
   * updating the resource will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Buyer buyer;

  /**
   * Contact information for the buyer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> buyerContacts;

  /**
   * Private data for buyer. (hidden from seller).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PrivateData buyerPrivateData;

  /**
   * The deals associated with this proposal. For Private Auction proposals (whose deals have
   * NonGuaranteedAuctionTerms), there will only be one deal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Deal> deals;

  /**
   * The name for the proposal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * True if the proposal is being renegotiated. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isRenegotiating;

  /**
   * True, if the buyside inventory setup is complete for this proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSetupComplete;

  /**
   * The role of the last user that either updated the proposal or left a comment. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastUpdaterOrCommentorRole;

  /**
   * The notes associated with this proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Note> notes;

  /**
   * Indicates whether the buyer/seller created the proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originatorRole;

  /**
   * Private auction ID if this proposal is a private auction proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateAuctionId;

  /**
   * The unique ID of the proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalId;

  /**
   * The revision number for the proposal. Each update to the proposal or the deal causes the
   * proposal revision number to auto-increment. The buyer keeps track of the last revision number
   * they know of and pass it in when making an update. If the head revision number on the server
   * has since incremented, then an ABORTED error is returned during the update operation to let the
   * buyer know that a subsequent update was made. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long proposalRevision;

  /**
   * The current state of the proposal. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proposalState;

  /**
   * Reference to the seller on the proposal.
   *
   * Note: This field may be set only when creating the resource. Modifying this field while
   * updating the resource will result in an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seller seller;

  /**
   * Contact information for the seller. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContactInformation> sellerContacts;

  /**
   * The time when the proposal was last revised. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Reference to the buyer that will get billed for this proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public Buyer getBilledBuyer() {
    return billedBuyer;
  }

  /**
   * Reference to the buyer that will get billed for this proposal. @OutputOnly
   * @param billedBuyer billedBuyer or {@code null} for none
   */
  public Proposal setBilledBuyer(Buyer billedBuyer) {
    this.billedBuyer = billedBuyer;
    return this;
  }

  /**
   * Reference to the buyer on the proposal.
   *
   * Note: This field may be set only when creating the resource. Modifying this field while
   * updating the resource will result in an error.
   * @return value or {@code null} for none
   */
  public Buyer getBuyer() {
    return buyer;
  }

  /**
   * Reference to the buyer on the proposal.
   *
   * Note: This field may be set only when creating the resource. Modifying this field while
   * updating the resource will result in an error.
   * @param buyer buyer or {@code null} for none
   */
  public Proposal setBuyer(Buyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Contact information for the buyer.
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getBuyerContacts() {
    return buyerContacts;
  }

  /**
   * Contact information for the buyer.
   * @param buyerContacts buyerContacts or {@code null} for none
   */
  public Proposal setBuyerContacts(java.util.List<ContactInformation> buyerContacts) {
    this.buyerContacts = buyerContacts;
    return this;
  }

  /**
   * Private data for buyer. (hidden from seller).
   * @return value or {@code null} for none
   */
  public PrivateData getBuyerPrivateData() {
    return buyerPrivateData;
  }

  /**
   * Private data for buyer. (hidden from seller).
   * @param buyerPrivateData buyerPrivateData or {@code null} for none
   */
  public Proposal setBuyerPrivateData(PrivateData buyerPrivateData) {
    this.buyerPrivateData = buyerPrivateData;
    return this;
  }

  /**
   * The deals associated with this proposal. For Private Auction proposals (whose deals have
   * NonGuaranteedAuctionTerms), there will only be one deal.
   * @return value or {@code null} for none
   */
  public java.util.List<Deal> getDeals() {
    return deals;
  }

  /**
   * The deals associated with this proposal. For Private Auction proposals (whose deals have
   * NonGuaranteedAuctionTerms), there will only be one deal.
   * @param deals deals or {@code null} for none
   */
  public Proposal setDeals(java.util.List<Deal> deals) {
    this.deals = deals;
    return this;
  }

  /**
   * The name for the proposal.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name for the proposal.
   * @param displayName displayName or {@code null} for none
   */
  public Proposal setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * True if the proposal is being renegotiated. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsRenegotiating() {
    return isRenegotiating;
  }

  /**
   * True if the proposal is being renegotiated. @OutputOnly
   * @param isRenegotiating isRenegotiating or {@code null} for none
   */
  public Proposal setIsRenegotiating(java.lang.Boolean isRenegotiating) {
    this.isRenegotiating = isRenegotiating;
    return this;
  }

  /**
   * True, if the buyside inventory setup is complete for this proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSetupComplete() {
    return isSetupComplete;
  }

  /**
   * True, if the buyside inventory setup is complete for this proposal. @OutputOnly
   * @param isSetupComplete isSetupComplete or {@code null} for none
   */
  public Proposal setIsSetupComplete(java.lang.Boolean isSetupComplete) {
    this.isSetupComplete = isSetupComplete;
    return this;
  }

  /**
   * The role of the last user that either updated the proposal or left a comment. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getLastUpdaterOrCommentorRole() {
    return lastUpdaterOrCommentorRole;
  }

  /**
   * The role of the last user that either updated the proposal or left a comment. @OutputOnly
   * @param lastUpdaterOrCommentorRole lastUpdaterOrCommentorRole or {@code null} for none
   */
  public Proposal setLastUpdaterOrCommentorRole(java.lang.String lastUpdaterOrCommentorRole) {
    this.lastUpdaterOrCommentorRole = lastUpdaterOrCommentorRole;
    return this;
  }

  /**
   * The notes associated with this proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.util.List<Note> getNotes() {
    return notes;
  }

  /**
   * The notes associated with this proposal. @OutputOnly
   * @param notes notes or {@code null} for none
   */
  public Proposal setNotes(java.util.List<Note> notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Indicates whether the buyer/seller created the proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginatorRole() {
    return originatorRole;
  }

  /**
   * Indicates whether the buyer/seller created the proposal. @OutputOnly
   * @param originatorRole originatorRole or {@code null} for none
   */
  public Proposal setOriginatorRole(java.lang.String originatorRole) {
    this.originatorRole = originatorRole;
    return this;
  }

  /**
   * Private auction ID if this proposal is a private auction proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateAuctionId() {
    return privateAuctionId;
  }

  /**
   * Private auction ID if this proposal is a private auction proposal. @OutputOnly
   * @param privateAuctionId privateAuctionId or {@code null} for none
   */
  public Proposal setPrivateAuctionId(java.lang.String privateAuctionId) {
    this.privateAuctionId = privateAuctionId;
    return this;
  }

  /**
   * The unique ID of the proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalId() {
    return proposalId;
  }

  /**
   * The unique ID of the proposal. @OutputOnly
   * @param proposalId proposalId or {@code null} for none
   */
  public Proposal setProposalId(java.lang.String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * The revision number for the proposal. Each update to the proposal or the deal causes the
   * proposal revision number to auto-increment. The buyer keeps track of the last revision number
   * they know of and pass it in when making an update. If the head revision number on the server
   * has since incremented, then an ABORTED error is returned during the update operation to let the
   * buyer know that a subsequent update was made. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.Long getProposalRevision() {
    return proposalRevision;
  }

  /**
   * The revision number for the proposal. Each update to the proposal or the deal causes the
   * proposal revision number to auto-increment. The buyer keeps track of the last revision number
   * they know of and pass it in when making an update. If the head revision number on the server
   * has since incremented, then an ABORTED error is returned during the update operation to let the
   * buyer know that a subsequent update was made. @OutputOnly
   * @param proposalRevision proposalRevision or {@code null} for none
   */
  public Proposal setProposalRevision(java.lang.Long proposalRevision) {
    this.proposalRevision = proposalRevision;
    return this;
  }

  /**
   * The current state of the proposal. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getProposalState() {
    return proposalState;
  }

  /**
   * The current state of the proposal. @OutputOnly
   * @param proposalState proposalState or {@code null} for none
   */
  public Proposal setProposalState(java.lang.String proposalState) {
    this.proposalState = proposalState;
    return this;
  }

  /**
   * Reference to the seller on the proposal.
   *
   * Note: This field may be set only when creating the resource. Modifying this field while
   * updating the resource will result in an error.
   * @return value or {@code null} for none
   */
  public Seller getSeller() {
    return seller;
  }

  /**
   * Reference to the seller on the proposal.
   *
   * Note: This field may be set only when creating the resource. Modifying this field while
   * updating the resource will result in an error.
   * @param seller seller or {@code null} for none
   */
  public Proposal setSeller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Contact information for the seller. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.util.List<ContactInformation> getSellerContacts() {
    return sellerContacts;
  }

  /**
   * Contact information for the seller. @OutputOnly
   * @param sellerContacts sellerContacts or {@code null} for none
   */
  public Proposal setSellerContacts(java.util.List<ContactInformation> sellerContacts) {
    this.sellerContacts = sellerContacts;
    return this;
  }

  /**
   * The time when the proposal was last revised. @OutputOnly
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the proposal was last revised. @OutputOnly
   * @param updateTime updateTime or {@code null} for none
   */
  public Proposal setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Proposal set(String fieldName, Object value) {
    return (Proposal) super.set(fieldName, value);
  }

  @Override
  public Proposal clone() {
    return (Proposal) super.clone();
  }

}
