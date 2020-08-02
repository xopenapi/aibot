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
 * JobUpdateRspAllOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class JobUpdateRspAllOfData {
  public static final String SERIALIZED_NAME_ROBOT_CALL_JOB_ID = "robotCallJobId";
  @SerializedName(SERIALIZED_NAME_ROBOT_CALL_JOB_ID)
  private Long robotCallJobId;


  public JobUpdateRspAllOfData robotCallJobId(Long robotCallJobId) {
    
    this.robotCallJobId = robotCallJobId;
    return this;
  }

   /**
   * Get robotCallJobId
   * @return robotCallJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRobotCallJobId() {
    return robotCallJobId;
  }


  public void setRobotCallJobId(Long robotCallJobId) {
    this.robotCallJobId = robotCallJobId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobUpdateRspAllOfData jobUpdateRspAllOfData = (JobUpdateRspAllOfData) o;
    return Objects.equals(this.robotCallJobId, jobUpdateRspAllOfData.robotCallJobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(robotCallJobId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobUpdateRspAllOfData {\n");
    sb.append("    robotCallJobId: ").append(toIndentedString(robotCallJobId)).append("\n");
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

