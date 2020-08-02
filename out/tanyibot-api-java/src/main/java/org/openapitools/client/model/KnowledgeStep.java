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
import org.openapitools.client.model.DialogFlowNode;

/**
 * 问答知识流程
 */
@ApiModel(description = "问答知识流程")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class KnowledgeStep {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DIALOG_FLOW_NODES = "dialogFlowNodes";
  @SerializedName(SERIALIZED_NAME_DIALOG_FLOW_NODES)
  private List<DialogFlowNode> dialogFlowNodes = null;


  public KnowledgeStep title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public KnowledgeStep dialogFlowNodes(List<DialogFlowNode> dialogFlowNodes) {
    
    this.dialogFlowNodes = dialogFlowNodes;
    return this;
  }

  public KnowledgeStep addDialogFlowNodesItem(DialogFlowNode dialogFlowNodesItem) {
    if (this.dialogFlowNodes == null) {
      this.dialogFlowNodes = new ArrayList<DialogFlowNode>();
    }
    this.dialogFlowNodes.add(dialogFlowNodesItem);
    return this;
  }

   /**
   * 问答知识流程节点
   * @return dialogFlowNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "问答知识流程节点")

  public List<DialogFlowNode> getDialogFlowNodes() {
    return dialogFlowNodes;
  }


  public void setDialogFlowNodes(List<DialogFlowNode> dialogFlowNodes) {
    this.dialogFlowNodes = dialogFlowNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeStep knowledgeStep = (KnowledgeStep) o;
    return Objects.equals(this.title, knowledgeStep.title) &&
        Objects.equals(this.dialogFlowNodes, knowledgeStep.dialogFlowNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, dialogFlowNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeStep {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dialogFlowNodes: ").append(toIndentedString(dialogFlowNodes)).append("\n");
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
