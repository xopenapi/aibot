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
import org.openapitools.client.model.UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class UpdatePhoneInfoByTenantPhoneNumberIdReq {
  public static final String SERIALIZED_NAME_TENANT_PHONE_NUMBER_ID = "tenantPhoneNumberId";
  @SerializedName(SERIALIZED_NAME_TENANT_PHONE_NUMBER_ID)
  private Long tenantPhoneNumberId;

  public static final String SERIALIZED_NAME_AREA_CODE = "areaCode";
  @SerializedName(SERIALIZED_NAME_AREA_CODE)
  private String areaCode;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  /**
   * (FINANCE, \&quot;金融\&quot;),(OTHER, \&quot;其他\&quot;)
   */
  @JsonAdapter(CallOutIndustryEnum.Adapter.class)
  public enum CallOutIndustryEnum {
    FINANCE("FINANCE"),
    
    OTHER("OTHER");

    private String value;

    CallOutIndustryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CallOutIndustryEnum fromValue(String value) {
      for (CallOutIndustryEnum b : CallOutIndustryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CallOutIndustryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CallOutIndustryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CallOutIndustryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CallOutIndustryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALL_OUT_INDUSTRY = "callOutIndustry";
  @SerializedName(SERIALIZED_NAME_CALL_OUT_INDUSTRY)
  private CallOutIndustryEnum callOutIndustry;

  public static final String SERIALIZED_NAME_DEAD_AREA = "deadArea";
  @SerializedName(SERIALIZED_NAME_DEAD_AREA)
  private UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea deadArea;


  public UpdatePhoneInfoByTenantPhoneNumberIdReq tenantPhoneNumberId(Long tenantPhoneNumberId) {
    
    this.tenantPhoneNumberId = tenantPhoneNumberId;
    return this;
  }

   /**
   * 用户线路ID（代表绑给用户的虚拟线路）
   * @return tenantPhoneNumberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1010", value = "用户线路ID（代表绑给用户的虚拟线路）")

  public Long getTenantPhoneNumberId() {
    return tenantPhoneNumberId;
  }


  public void setTenantPhoneNumberId(Long tenantPhoneNumberId) {
    this.tenantPhoneNumberId = tenantPhoneNumberId;
  }


  public UpdatePhoneInfoByTenantPhoneNumberIdReq areaCode(String areaCode) {
    
    this.areaCode = areaCode;
    return this;
  }

   /**
   * 线路归属地
   * @return areaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.baidu.com", value = "线路归属地")

  public String getAreaCode() {
    return areaCode;
  }


  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  public UpdatePhoneInfoByTenantPhoneNumberIdReq province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 线路归属地省
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江", value = "线路归属地省")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public UpdatePhoneInfoByTenantPhoneNumberIdReq city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 线路归属地市
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州", value = "线路归属地市")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public UpdatePhoneInfoByTenantPhoneNumberIdReq callOutIndustry(CallOutIndustryEnum callOutIndustry) {
    
    this.callOutIndustry = callOutIndustry;
    return this;
  }

   /**
   * (FINANCE, \&quot;金融\&quot;),(OTHER, \&quot;其他\&quot;)
   * @return callOutIndustry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(FINANCE, \"金融\"),(OTHER, \"其他\")")

  public CallOutIndustryEnum getCallOutIndustry() {
    return callOutIndustry;
  }


  public void setCallOutIndustry(CallOutIndustryEnum callOutIndustry) {
    this.callOutIndustry = callOutIndustry;
  }


  public UpdatePhoneInfoByTenantPhoneNumberIdReq deadArea(UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea deadArea) {
    
    this.deadArea = deadArea;
    return this;
  }

   /**
   * Get deadArea
   * @return deadArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea getDeadArea() {
    return deadArea;
  }


  public void setDeadArea(UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea deadArea) {
    this.deadArea = deadArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePhoneInfoByTenantPhoneNumberIdReq updatePhoneInfoByTenantPhoneNumberIdReq = (UpdatePhoneInfoByTenantPhoneNumberIdReq) o;
    return Objects.equals(this.tenantPhoneNumberId, updatePhoneInfoByTenantPhoneNumberIdReq.tenantPhoneNumberId) &&
        Objects.equals(this.areaCode, updatePhoneInfoByTenantPhoneNumberIdReq.areaCode) &&
        Objects.equals(this.province, updatePhoneInfoByTenantPhoneNumberIdReq.province) &&
        Objects.equals(this.city, updatePhoneInfoByTenantPhoneNumberIdReq.city) &&
        Objects.equals(this.callOutIndustry, updatePhoneInfoByTenantPhoneNumberIdReq.callOutIndustry) &&
        Objects.equals(this.deadArea, updatePhoneInfoByTenantPhoneNumberIdReq.deadArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantPhoneNumberId, areaCode, province, city, callOutIndustry, deadArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePhoneInfoByTenantPhoneNumberIdReq {\n");
    sb.append("    tenantPhoneNumberId: ").append(toIndentedString(tenantPhoneNumberId)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    callOutIndustry: ").append(toIndentedString(callOutIndustry)).append("\n");
    sb.append("    deadArea: ").append(toIndentedString(deadArea)).append("\n");
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

