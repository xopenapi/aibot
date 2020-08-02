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
import org.openapitools.client.model.ExecuteJobInfo;

/**
 * ExecuteJobsReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class ExecuteJobsReq {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_EXECUTABLE = "executable";
  @SerializedName(SERIALIZED_NAME_EXECUTABLE)
  private List<ExecuteJobInfo> executable = null;


  public ExecuteJobsReq operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ExecuteJobsReq executable(List<ExecuteJobInfo> executable) {
    
    this.executable = executable;
    return this;
  }

  public ExecuteJobsReq addExecutableItem(ExecuteJobInfo executableItem) {
    if (this.executable == null) {
      this.executable = new ArrayList<ExecuteJobInfo>();
    }
    this.executable.add(executableItem);
    return this;
  }

   /**
   * 操作任务
   * @return executable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "操作任务")

  public List<ExecuteJobInfo> getExecutable() {
    return executable;
  }


  public void setExecutable(List<ExecuteJobInfo> executable) {
    this.executable = executable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteJobsReq executeJobsReq = (ExecuteJobsReq) o;
    return Objects.equals(this.operation, executeJobsReq.operation) &&
        Objects.equals(this.executable, executeJobsReq.executable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, executable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteJobsReq {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    executable: ").append(toIndentedString(executable)).append("\n");
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

