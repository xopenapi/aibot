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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class BaseReq {
  public static final String SERIALIZED_NAME_APP_KEY = "appKey";
  @SerializedName(SERIALIZED_NAME_APP_KEY)
  private String appKey;

  public static final String SERIALIZED_NAME_APP_SECRET = "appSecret";
  @SerializedName(SERIALIZED_NAME_APP_SECRET)
  private String appSecret;

  public static final String SERIALIZED_NAME_TENANT_SIGN = "tenantSign";
  @SerializedName(SERIALIZED_NAME_TENANT_SIGN)
  private String tenantSign;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;


  public BaseReq appKey(String appKey) {
    
    this.appKey = appKey;
    return this;
  }

   /**
   * Get appKey
   * @return appKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppKey() {
    return appKey;
  }


  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }


  public BaseReq appSecret(String appSecret) {
    
    this.appSecret = appSecret;
    return this;
  }

   /**
   * Get appSecret
   * @return appSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppSecret() {
    return appSecret;
  }


  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }


  public BaseReq tenantSign(String tenantSign) {
    
    this.tenantSign = tenantSign;
    return this;
  }

   /**
   * Get tenantSign
   * @return tenantSign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantSign() {
    return tenantSign;
  }


  public void setTenantSign(String tenantSign) {
    this.tenantSign = tenantSign;
  }


  public BaseReq version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public BaseReq timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public BaseReq signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReq baseReq = (BaseReq) o;
    return Objects.equals(this.appKey, baseReq.appKey) &&
        Objects.equals(this.appSecret, baseReq.appSecret) &&
        Objects.equals(this.tenantSign, baseReq.tenantSign) &&
        Objects.equals(this.version, baseReq.version) &&
        Objects.equals(this.timestamp, baseReq.timestamp) &&
        Objects.equals(this.signature, baseReq.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, appSecret, tenantSign, version, timestamp, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReq {\n");
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    tenantSign: ").append(toIndentedString(tenantSign)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
