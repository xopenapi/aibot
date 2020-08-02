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
 * UpdatePolicyGroupReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class UpdatePolicyGroupReq {
  public static final String SERIALIZED_NAME_CALL_POLICY_GROUP_ID = "callPolicyGroupId";
  @SerializedName(SERIALIZED_NAME_CALL_POLICY_GROUP_ID)
  private Long callPolicyGroupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark;

  /**
   * 优先级策略，(SORT_FIRST, \&quot;排序优先级优先\&quot;),(LOCATION_MATCH_FIRST, \&quot;归属地匹配优先\&quot;);
   */
  @JsonAdapter(DispatchTypeEnum.Adapter.class)
  public enum DispatchTypeEnum {
    SORT_FIRST("SORT_FIRST"),
    
    LOCATION_MATCH_FIRST("LOCATION_MATCH_FIRST");

    private String value;

    DispatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DispatchTypeEnum fromValue(String value) {
      for (DispatchTypeEnum b : DispatchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DispatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DispatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DispatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DispatchTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPATCH_TYPE = "dispatchType";
  @SerializedName(SERIALIZED_NAME_DISPATCH_TYPE)
  private DispatchTypeEnum dispatchType;

  public static final String SERIALIZED_NAME_TENANT_PHONE_NUMBER_ID = "tenantPhoneNumberId";
  @SerializedName(SERIALIZED_NAME_TENANT_PHONE_NUMBER_ID)
  private Long tenantPhoneNumberId;


  public UpdatePolicyGroupReq callPolicyGroupId(Long callPolicyGroupId) {
    
    this.callPolicyGroupId = callPolicyGroupId;
    return this;
  }

   /**
   * 外呼策略组ID
   * @return callPolicyGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外呼策略组ID")

  public Long getCallPolicyGroupId() {
    return callPolicyGroupId;
  }


  public void setCallPolicyGroupId(Long callPolicyGroupId) {
    this.callPolicyGroupId = callPolicyGroupId;
  }


  public UpdatePolicyGroupReq name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 外呼策略组名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "外呼策略组名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdatePolicyGroupReq remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 备注
   * @return remark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "备注")

  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public UpdatePolicyGroupReq dispatchType(DispatchTypeEnum dispatchType) {
    
    this.dispatchType = dispatchType;
    return this;
  }

   /**
   * 优先级策略，(SORT_FIRST, \&quot;排序优先级优先\&quot;),(LOCATION_MATCH_FIRST, \&quot;归属地匹配优先\&quot;);
   * @return dispatchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "优先级策略，(SORT_FIRST, \"排序优先级优先\"),(LOCATION_MATCH_FIRST, \"归属地匹配优先\");")

  public DispatchTypeEnum getDispatchType() {
    return dispatchType;
  }


  public void setDispatchType(DispatchTypeEnum dispatchType) {
    this.dispatchType = dispatchType;
  }


  public UpdatePolicyGroupReq tenantPhoneNumberId(Long tenantPhoneNumberId) {
    
    this.tenantPhoneNumberId = tenantPhoneNumberId;
    return this;
  }

   /**
   * 用户线路ID
   * @return tenantPhoneNumberId
  **/
  @ApiModelProperty(required = true, value = "用户线路ID")

  public Long getTenantPhoneNumberId() {
    return tenantPhoneNumberId;
  }


  public void setTenantPhoneNumberId(Long tenantPhoneNumberId) {
    this.tenantPhoneNumberId = tenantPhoneNumberId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePolicyGroupReq updatePolicyGroupReq = (UpdatePolicyGroupReq) o;
    return Objects.equals(this.callPolicyGroupId, updatePolicyGroupReq.callPolicyGroupId) &&
        Objects.equals(this.name, updatePolicyGroupReq.name) &&
        Objects.equals(this.remark, updatePolicyGroupReq.remark) &&
        Objects.equals(this.dispatchType, updatePolicyGroupReq.dispatchType) &&
        Objects.equals(this.tenantPhoneNumberId, updatePolicyGroupReq.tenantPhoneNumberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callPolicyGroupId, name, remark, dispatchType, tenantPhoneNumberId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePolicyGroupReq {\n");
    sb.append("    callPolicyGroupId: ").append(toIndentedString(callPolicyGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    dispatchType: ").append(toIndentedString(dispatchType)).append("\n");
    sb.append("    tenantPhoneNumberId: ").append(toIndentedString(tenantPhoneNumberId)).append("\n");
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
