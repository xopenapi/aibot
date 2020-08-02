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
import org.openapitools.client.model.GetJobStatsInfoListRspAllOf;
import org.openapitools.client.model.GetJobStatsInfoListRspAllOfData;
import org.openapitools.client.model.ModelAPIResponse;

/**
 * GetJobStatsInfoListRsp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class GetJobStatsInfoListRsp {
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

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<GetJobStatsInfoListRspAllOfData> data = null;


  public GetJobStatsInfoListRsp code(Integer code) {
    
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


  public GetJobStatsInfoListRsp requestId(String requestId) {
    
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


  public GetJobStatsInfoListRsp resultMsg(String resultMsg) {
    
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


  public GetJobStatsInfoListRsp errorStackTrace(String errorStackTrace) {
    
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


  public GetJobStatsInfoListRsp data(List<GetJobStatsInfoListRspAllOfData> data) {
    
    this.data = data;
    return this;
  }

  public GetJobStatsInfoListRsp addDataItem(GetJobStatsInfoListRspAllOfData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<GetJobStatsInfoListRspAllOfData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetJobStatsInfoListRspAllOfData> getData() {
    return data;
  }


  public void setData(List<GetJobStatsInfoListRspAllOfData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetJobStatsInfoListRsp getJobStatsInfoListRsp = (GetJobStatsInfoListRsp) o;
    return Objects.equals(this.code, getJobStatsInfoListRsp.code) &&
        Objects.equals(this.requestId, getJobStatsInfoListRsp.requestId) &&
        Objects.equals(this.resultMsg, getJobStatsInfoListRsp.resultMsg) &&
        Objects.equals(this.errorStackTrace, getJobStatsInfoListRsp.errorStackTrace) &&
        Objects.equals(this.data, getJobStatsInfoListRsp.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, requestId, resultMsg, errorStackTrace, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetJobStatsInfoListRsp {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
    sb.append("    errorStackTrace: ").append(toIndentedString(errorStackTrace)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

