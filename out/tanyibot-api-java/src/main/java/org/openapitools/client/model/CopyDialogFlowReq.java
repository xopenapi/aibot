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
import java.util.ArrayList;
import java.util.List;

/**
 * CopyDialogFlowReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class CopyDialogFlowReq {
  public static final String SERIALIZED_NAME_DIALOG_FLOW_TEMPLATE_ID = "dialogFlowTemplateId";
  @SerializedName(SERIALIZED_NAME_DIALOG_FLOW_TEMPLATE_ID)
  private Long dialogFlowTemplateId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INTENT_LEVEL_TAG_ID = "intentLevelTagId";
  @SerializedName(SERIALIZED_NAME_INTENT_LEVEL_TAG_ID)
  private Long intentLevelTagId;

  public static final String SERIALIZED_NAME_VAD_GATE_MUTE = "vadGateMute";
  @SerializedName(SERIALIZED_NAME_VAD_GATE_MUTE)
  private Integer vadGateMute;

  public static final String SERIALIZED_NAME_MAX_SENTENCE_SILENCE = "maxSentenceSilence";
  @SerializedName(SERIALIZED_NAME_MAX_SENTENCE_SILENCE)
  private Integer maxSentenceSilence;

  public static final String SERIALIZED_NAME_ENABLE_ASK_SERVICE = "enableAskService";
  @SerializedName(SERIALIZED_NAME_ENABLE_ASK_SERVICE)
  private Boolean enableAskService;

  public static final String SERIALIZED_NAME_BRANCH_LEVEL = "branchLevel";
  @SerializedName(SERIALIZED_NAME_BRANCH_LEVEL)
  private List<String> branchLevel = null;


  public CopyDialogFlowReq dialogFlowTemplateId(Long dialogFlowTemplateId) {
    
    this.dialogFlowTemplateId = dialogFlowTemplateId;
    return this;
  }

   /**
   * 被复制话术ID
   * @return dialogFlowTemplateId
  **/
  @ApiModelProperty(required = true, value = "被复制话术ID")

  public Long getDialogFlowTemplateId() {
    return dialogFlowTemplateId;
  }


  public void setDialogFlowTemplateId(Long dialogFlowTemplateId) {
    this.dialogFlowTemplateId = dialogFlowTemplateId;
  }


  public CopyDialogFlowReq name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 话术复制
   * @return name
  **/
  @ApiModelProperty(required = true, value = "话术复制")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CopyDialogFlowReq description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 测试话术
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "测试话术")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CopyDialogFlowReq intentLevelTagId(Long intentLevelTagId) {
    
    this.intentLevelTagId = intentLevelTagId;
    return this;
  }

   /**
   * 意向规则分组id
   * @return intentLevelTagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "意向规则分组id")

  public Long getIntentLevelTagId() {
    return intentLevelTagId;
  }


  public void setIntentLevelTagId(Long intentLevelTagId) {
    this.intentLevelTagId = intentLevelTagId;
  }


  public CopyDialogFlowReq vadGateMute(Integer vadGateMute) {
    
    this.vadGateMute = vadGateMute;
    return this;
  }

   /**
   * 打断灵敏度 [1-9]
   * @return vadGateMute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "打断灵敏度 [1-9]")

  public Integer getVadGateMute() {
    return vadGateMute;
  }


  public void setVadGateMute(Integer vadGateMute) {
    this.vadGateMute = vadGateMute;
  }


  public CopyDialogFlowReq maxSentenceSilence(Integer maxSentenceSilence) {
    
    this.maxSentenceSilence = maxSentenceSilence;
    return this;
  }

   /**
   * 反应灵敏度 [1-9]
   * @return maxSentenceSilence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "反应灵敏度 [1-9]")

  public Integer getMaxSentenceSilence() {
    return maxSentenceSilence;
  }


  public void setMaxSentenceSilence(Integer maxSentenceSilence) {
    this.maxSentenceSilence = maxSentenceSilence;
  }


  public CopyDialogFlowReq enableAskService(Boolean enableAskService) {
    
    this.enableAskService = enableAskService;
    return this;
  }

   /**
   * 是否启用问法
   * @return enableAskService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否启用问法")

  public Boolean getEnableAskService() {
    return enableAskService;
  }


  public void setEnableAskService(Boolean enableAskService) {
    this.enableAskService = enableAskService;
  }


  public CopyDialogFlowReq branchLevel(List<String> branchLevel) {
    
    this.branchLevel = branchLevel;
    return this;
  }

  public CopyDialogFlowReq addBranchLevelItem(String branchLevelItem) {
    if (this.branchLevel == null) {
      this.branchLevel = new ArrayList<String>();
    }
    this.branchLevel.add(branchLevelItem);
    return this;
  }

   /**
   * Get branchLevel
   * @return branchLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBranchLevel() {
    return branchLevel;
  }


  public void setBranchLevel(List<String> branchLevel) {
    this.branchLevel = branchLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyDialogFlowReq copyDialogFlowReq = (CopyDialogFlowReq) o;
    return Objects.equals(this.dialogFlowTemplateId, copyDialogFlowReq.dialogFlowTemplateId) &&
        Objects.equals(this.name, copyDialogFlowReq.name) &&
        Objects.equals(this.description, copyDialogFlowReq.description) &&
        Objects.equals(this.intentLevelTagId, copyDialogFlowReq.intentLevelTagId) &&
        Objects.equals(this.vadGateMute, copyDialogFlowReq.vadGateMute) &&
        Objects.equals(this.maxSentenceSilence, copyDialogFlowReq.maxSentenceSilence) &&
        Objects.equals(this.enableAskService, copyDialogFlowReq.enableAskService) &&
        Objects.equals(this.branchLevel, copyDialogFlowReq.branchLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogFlowTemplateId, name, description, intentLevelTagId, vadGateMute, maxSentenceSilence, enableAskService, branchLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyDialogFlowReq {\n");
    sb.append("    dialogFlowTemplateId: ").append(toIndentedString(dialogFlowTemplateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    intentLevelTagId: ").append(toIndentedString(intentLevelTagId)).append("\n");
    sb.append("    vadGateMute: ").append(toIndentedString(vadGateMute)).append("\n");
    sb.append("    maxSentenceSilence: ").append(toIndentedString(maxSentenceSilence)).append("\n");
    sb.append("    enableAskService: ").append(toIndentedString(enableAskService)).append("\n");
    sb.append("    branchLevel: ").append(toIndentedString(branchLevel)).append("\n");
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

