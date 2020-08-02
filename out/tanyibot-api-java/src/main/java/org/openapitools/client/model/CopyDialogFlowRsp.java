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
import org.openapitools.client.model.CopyDialogFlowRspAllOf;
import org.openapitools.client.model.Industry;
import org.openapitools.client.model.ModelAPIResponse;

/**
 * CopyDialogFlowRsp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class CopyDialogFlowRsp {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_RESULT_MSG = "resultMsg";
  @SerializedName(SERIALIZED_NAME_RESULT_MSG)
  private String resultMsg;

  public static final String SERIALIZED_NAME_ERROR_STACK_TRACE = "errorStackTrace";
  @SerializedName(SERIALIZED_NAME_ERROR_STACK_TRACE)
  private String errorStackTrace;

  public static final String SERIALIZED_NAME_DIALOG_FLOW_ID = "dialogFlowId";
  @SerializedName(SERIALIZED_NAME_DIALOG_FLOW_ID)
  private Long dialogFlowId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INTENT_LEVEL_TAG_ID = "intentLevelTagId";
  @SerializedName(SERIALIZED_NAME_INTENT_LEVEL_TAG_ID)
  private Long intentLevelTagId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private Industry industry;

  public static final String SERIALIZED_NAME_SUB_INDUSTRY = "subIndustry";
  @SerializedName(SERIALIZED_NAME_SUB_INDUSTRY)
  private Industry subIndustry;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * 话术类型(NORMAL 客户定制 TEMPLATE 模板)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NORMAL("NORMAL"),
    
    TEMPLATE("TEMPLATE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public CopyDialogFlowRsp code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 响应码
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "响应码")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public CopyDialogFlowRsp requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * 请求id
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求id")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CopyDialogFlowRsp resultMsg(String resultMsg) {
    
    this.resultMsg = resultMsg;
    return this;
  }

   /**
   * 响应说明
   * @return resultMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "响应说明")

  public String getResultMsg() {
    return resultMsg;
  }


  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }


  public CopyDialogFlowRsp errorStackTrace(String errorStackTrace) {
    
    this.errorStackTrace = errorStackTrace;
    return this;
  }

   /**
   * Get errorStackTrace
   * @return errorStackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorStackTrace() {
    return errorStackTrace;
  }


  public void setErrorStackTrace(String errorStackTrace) {
    this.errorStackTrace = errorStackTrace;
  }


  public CopyDialogFlowRsp dialogFlowId(Long dialogFlowId) {
    
    this.dialogFlowId = dialogFlowId;
    return this;
  }

   /**
   * 话术id
   * @return dialogFlowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "话术id")

  public Long getDialogFlowId() {
    return dialogFlowId;
  }


  public void setDialogFlowId(Long dialogFlowId) {
    this.dialogFlowId = dialogFlowId;
  }


  public CopyDialogFlowRsp name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 话术名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "话术名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CopyDialogFlowRsp intentLevelTagId(Long intentLevelTagId) {
    
    this.intentLevelTagId = intentLevelTagId;
    return this;
  }

   /**
   * 意向分组id
   * @return intentLevelTagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "意向分组id")

  public Long getIntentLevelTagId() {
    return intentLevelTagId;
  }


  public void setIntentLevelTagId(Long intentLevelTagId) {
    this.intentLevelTagId = intentLevelTagId;
  }


  public CopyDialogFlowRsp status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 话术状态(DRAFT 草稿 PENDING_APPROVAL 等待审核 REJECTED 拒绝 APPROVED 审核通过)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "话术状态(DRAFT 草稿 PENDING_APPROVAL 等待审核 REJECTED 拒绝 APPROVED 审核通过)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CopyDialogFlowRsp createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 话术创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "话术创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public CopyDialogFlowRsp industry(Industry industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Industry getIndustry() {
    return industry;
  }


  public void setIndustry(Industry industry) {
    this.industry = industry;
  }


  public CopyDialogFlowRsp subIndustry(Industry subIndustry) {
    
    this.subIndustry = subIndustry;
    return this;
  }

   /**
   * Get subIndustry
   * @return subIndustry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Industry getSubIndustry() {
    return subIndustry;
  }


  public void setSubIndustry(Industry subIndustry) {
    this.subIndustry = subIndustry;
  }


  public CopyDialogFlowRsp description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CopyDialogFlowRsp type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 话术类型(NORMAL 客户定制 TEMPLATE 模板)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "话术类型(NORMAL 客户定制 TEMPLATE 模板)")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopyDialogFlowRsp copyDialogFlowRsp = (CopyDialogFlowRsp) o;
    return Objects.equals(this.code, copyDialogFlowRsp.code) &&
        Objects.equals(this.requestId, copyDialogFlowRsp.requestId) &&
        Objects.equals(this.resultMsg, copyDialogFlowRsp.resultMsg) &&
        Objects.equals(this.errorStackTrace, copyDialogFlowRsp.errorStackTrace) &&
        Objects.equals(this.dialogFlowId, copyDialogFlowRsp.dialogFlowId) &&
        Objects.equals(this.name, copyDialogFlowRsp.name) &&
        Objects.equals(this.intentLevelTagId, copyDialogFlowRsp.intentLevelTagId) &&
        Objects.equals(this.status, copyDialogFlowRsp.status) &&
        Objects.equals(this.createTime, copyDialogFlowRsp.createTime) &&
        Objects.equals(this.industry, copyDialogFlowRsp.industry) &&
        Objects.equals(this.subIndustry, copyDialogFlowRsp.subIndustry) &&
        Objects.equals(this.description, copyDialogFlowRsp.description) &&
        Objects.equals(this.type, copyDialogFlowRsp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, requestId, resultMsg, errorStackTrace, dialogFlowId, name, intentLevelTagId, status, createTime, industry, subIndustry, description, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyDialogFlowRsp {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
    sb.append("    errorStackTrace: ").append(toIndentedString(errorStackTrace)).append("\n");
    sb.append("    dialogFlowId: ").append(toIndentedString(dialogFlowId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    intentLevelTagId: ").append(toIndentedString(intentLevelTagId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    subIndustry: ").append(toIndentedString(subIndustry)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

