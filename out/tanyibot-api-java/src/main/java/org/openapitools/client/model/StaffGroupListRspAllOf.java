/*
 * Tanyi Bot open api
 * tanyibot api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StaffGroupListRspAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class StaffGroupListRspAllOf {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Integer totalElements;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private Integer pages;

  public static final String SERIALIZED_NAME_CS_STAFF_GROUP_ID = "csStaffGroupId";
  @SerializedName(SERIALIZED_NAME_CS_STAFF_GROUP_ID)
  private Long csStaffGroupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;


  public StaffGroupListRspAllOf number(Integer number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    this.number = number;
  }


  public StaffGroupListRspAllOf pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public StaffGroupListRspAllOf totalElements(Integer totalElements) {
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Get totalElements
   * @return totalElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }


  public StaffGroupListRspAllOf pages(Integer pages) {
    
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPages() {
    return pages;
  }


  public void setPages(Integer pages) {
    this.pages = pages;
  }


  public StaffGroupListRspAllOf csStaffGroupId(Long csStaffGroupId) {
    
    this.csStaffGroupId = csStaffGroupId;
    return this;
  }

   /**
   * Get csStaffGroupId
   * @return csStaffGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCsStaffGroupId() {
    return csStaffGroupId;
  }


  public void setCsStaffGroupId(Long csStaffGroupId) {
    this.csStaffGroupId = csStaffGroupId;
  }


  public StaffGroupListRspAllOf groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffGroupListRspAllOf staffGroupListRspAllOf = (StaffGroupListRspAllOf) o;
    return Objects.equals(this.number, staffGroupListRspAllOf.number) &&
        Objects.equals(this.pageSize, staffGroupListRspAllOf.pageSize) &&
        Objects.equals(this.totalElements, staffGroupListRspAllOf.totalElements) &&
        Objects.equals(this.pages, staffGroupListRspAllOf.pages) &&
        Objects.equals(this.csStaffGroupId, staffGroupListRspAllOf.csStaffGroupId) &&
        Objects.equals(this.groupName, staffGroupListRspAllOf.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, pageSize, totalElements, pages, csStaffGroupId, groupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffGroupListRspAllOf {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    csStaffGroupId: ").append(toIndentedString(csStaffGroupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

