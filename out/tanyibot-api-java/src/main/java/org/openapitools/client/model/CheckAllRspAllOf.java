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
 * CheckAllRspAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:07:40.908Z[GMT]")
public class CheckAllRspAllOf {
  public static final String SERIALIZED_NAME_ROBOT_CALL_JOB_ID = "robotCallJobId";
  @SerializedName(SERIALIZED_NAME_ROBOT_CALL_JOB_ID)
  private String robotCallJobId;

  public static final String SERIALIZED_NAME_ROBOT_CALL_JOB_NAME = "robotCallJobName";
  @SerializedName(SERIALIZED_NAME_ROBOT_CALL_JOB_NAME)
  private String robotCallJobName;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CREATE_USER_NAME = "createUserName";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_NAME)
  private String createUserName;

  /**
   * 任务状态，NOT_STARTED(0, \&quot;未开始\&quot;),IN_PROCESS(1, \&quot;进行中\&quot;)，COMPLETED(2, \&quot;已完成\&quot;),RUNNABLE(3, \&quot;可运行\&quot;),USER_PAUSE(4, \&quot;用户暂停\&quot;),SYSTEM_SUSPENDED(5, \&quot;系统暂停\&quot;)，TERMINATE(6, \&quot;已终止\&quot;),IN_QUEUE(7, \&quot;排队中\&quot;),SYSTEM_HANG_UP(10, \&quot;系统挂起\&quot;),WAITING_FOR_REDIAL(11, \&quot;等待重呼\&quot;),ACCOUNT_DISABLE(12, \&quot;账户禁用\&quot;),MAINTAIN(13, \&quot;系统维护\&quot;);
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_STARTED("NOT_STARTED"),
    
    IN_PROCESS("IN_PROCESS"),
    
    COMPLETED("COMPLETED"),
    
    RUNNABLE("RUNNABLE"),
    
    USER_PAUSE("USER_PAUSE"),
    
    SYSTEM_SUSPENDED("SYSTEM_SUSPENDED"),
    
    TERMINATE("TERMINATE"),
    
    IN_QUEUE("IN_QUEUE"),
    
    SYSTEM_HANG_UP("SYSTEM_HANG_UP"),
    
    WAITING_FOR_REDIAL("WAITING_FOR_REDIAL"),
    
    ACCOUNT_DISABLE("ACCOUNT_DISABLE"),
    
    MAINTAIN("MAINTAIN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * 系统挂起类型 ACCOUNT_DEBT(0, \&quot;账户欠费\&quot;, \&quot;使用的线路账户已欠费\&quot;),NO_ROBOT_AVAILABLE(1, \&quot;没有可用坐席\&quot;, \&quot;当前没有可用坐席\&quot;),PHONE_UNBIND(2, \&quot;线路已解绑\&quot;, \&quot;使用的线路已解绑\&quot;),LINE_BREAKDOWN(3, \&quot;线路故障\&quot;, \&quot;使用的线路状态均为故障\&quot;),AVAILABLE_ROBOT_NOT_ENOUGH(4,\&quot;有效坐席数不足\&quot;,\&quot;有效坐席数不足，请检查有效AI坐席数量！\&quot;);
   */
  @JsonAdapter(HangUpTypeEnum.Adapter.class)
  public enum HangUpTypeEnum {
    ACCOUNT_DEBT("ACCOUNT_DEBT"),
    
    NO_ROBOT_AVAILABLE("NO_ROBOT_AVAILABLE"),
    
    PHONE_UNBIND("PHONE_UNBIND"),
    
    LINE_BREAKDOWN("LINE_BREAKDOWN"),
    
    AVAILABLE_ROBOT_NOT_ENOUGH("AVAILABLE_ROBOT_NOT_ENOUGH");

    private String value;

    HangUpTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HangUpTypeEnum fromValue(String value) {
      for (HangUpTypeEnum b : HangUpTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HangUpTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HangUpTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HangUpTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HangUpTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HANG_UP_TYPE = "hangUpType";
  @SerializedName(SERIALIZED_NAME_HANG_UP_TYPE)
  private HangUpTypeEnum hangUpType;

  public static final String SERIALIZED_NAME_HANG_UP_REASON = "hangUpReason";
  @SerializedName(SERIALIZED_NAME_HANG_UP_REASON)
  private String hangUpReason;

  public static final String SERIALIZED_NAME_COMPLETED_TASK = "completedTask";
  @SerializedName(SERIALIZED_NAME_COMPLETED_TASK)
  private Long completedTask;

  public static final String SERIALIZED_NAME_TOTAL_TASK = "totalTask";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK)
  private Long totalTask;

  public static final String SERIALIZED_NAME_ANSWERED_TASK = "answeredTask";
  @SerializedName(SERIALIZED_NAME_ANSWERED_TASK)
  private Long answeredTask;

  public static final String SERIALIZED_NAME_ABLEVEL_CUSTOMER = "ablevelCustomer";
  @SerializedName(SERIALIZED_NAME_ABLEVEL_CUSTOMER)
  private Long ablevelCustomer;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;


  public CheckAllRspAllOf robotCallJobId(String robotCallJobId) {
    
    this.robotCallJobId = robotCallJobId;
    return this;
  }

   /**
   * 任务id
   * @return robotCallJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "任务id")

  public String getRobotCallJobId() {
    return robotCallJobId;
  }


  public void setRobotCallJobId(String robotCallJobId) {
    this.robotCallJobId = robotCallJobId;
  }


  public CheckAllRspAllOf robotCallJobName(String robotCallJobName) {
    
    this.robotCallJobName = robotCallJobName;
    return this;
  }

   /**
   * 任务名
   * @return robotCallJobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "任务名")

  public String getRobotCallJobName() {
    return robotCallJobName;
  }


  public void setRobotCallJobName(String robotCallJobName) {
    this.robotCallJobName = robotCallJobName;
  }


  public CheckAllRspAllOf createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public CheckAllRspAllOf createUserName(String createUserName) {
    
    this.createUserName = createUserName;
    return this;
  }

   /**
   * 任务创建人
   * @return createUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "任务创建人")

  public String getCreateUserName() {
    return createUserName;
  }


  public void setCreateUserName(String createUserName) {
    this.createUserName = createUserName;
  }


  public CheckAllRspAllOf status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 任务状态，NOT_STARTED(0, \&quot;未开始\&quot;),IN_PROCESS(1, \&quot;进行中\&quot;)，COMPLETED(2, \&quot;已完成\&quot;),RUNNABLE(3, \&quot;可运行\&quot;),USER_PAUSE(4, \&quot;用户暂停\&quot;),SYSTEM_SUSPENDED(5, \&quot;系统暂停\&quot;)，TERMINATE(6, \&quot;已终止\&quot;),IN_QUEUE(7, \&quot;排队中\&quot;),SYSTEM_HANG_UP(10, \&quot;系统挂起\&quot;),WAITING_FOR_REDIAL(11, \&quot;等待重呼\&quot;),ACCOUNT_DISABLE(12, \&quot;账户禁用\&quot;),MAINTAIN(13, \&quot;系统维护\&quot;);
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "任务状态，NOT_STARTED(0, \"未开始\"),IN_PROCESS(1, \"进行中\")，COMPLETED(2, \"已完成\"),RUNNABLE(3, \"可运行\"),USER_PAUSE(4, \"用户暂停\"),SYSTEM_SUSPENDED(5, \"系统暂停\")，TERMINATE(6, \"已终止\"),IN_QUEUE(7, \"排队中\"),SYSTEM_HANG_UP(10, \"系统挂起\"),WAITING_FOR_REDIAL(11, \"等待重呼\"),ACCOUNT_DISABLE(12, \"账户禁用\"),MAINTAIN(13, \"系统维护\");")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CheckAllRspAllOf hangUpType(HangUpTypeEnum hangUpType) {
    
    this.hangUpType = hangUpType;
    return this;
  }

   /**
   * 系统挂起类型 ACCOUNT_DEBT(0, \&quot;账户欠费\&quot;, \&quot;使用的线路账户已欠费\&quot;),NO_ROBOT_AVAILABLE(1, \&quot;没有可用坐席\&quot;, \&quot;当前没有可用坐席\&quot;),PHONE_UNBIND(2, \&quot;线路已解绑\&quot;, \&quot;使用的线路已解绑\&quot;),LINE_BREAKDOWN(3, \&quot;线路故障\&quot;, \&quot;使用的线路状态均为故障\&quot;),AVAILABLE_ROBOT_NOT_ENOUGH(4,\&quot;有效坐席数不足\&quot;,\&quot;有效坐席数不足，请检查有效AI坐席数量！\&quot;);
   * @return hangUpType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统挂起类型 ACCOUNT_DEBT(0, \"账户欠费\", \"使用的线路账户已欠费\"),NO_ROBOT_AVAILABLE(1, \"没有可用坐席\", \"当前没有可用坐席\"),PHONE_UNBIND(2, \"线路已解绑\", \"使用的线路已解绑\"),LINE_BREAKDOWN(3, \"线路故障\", \"使用的线路状态均为故障\"),AVAILABLE_ROBOT_NOT_ENOUGH(4,\"有效坐席数不足\",\"有效坐席数不足，请检查有效AI坐席数量！\");")

  public HangUpTypeEnum getHangUpType() {
    return hangUpType;
  }


  public void setHangUpType(HangUpTypeEnum hangUpType) {
    this.hangUpType = hangUpType;
  }


  public CheckAllRspAllOf hangUpReason(String hangUpReason) {
    
    this.hangUpReason = hangUpReason;
    return this;
  }

   /**
   * 系统挂起原因
   * @return hangUpReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统挂起原因")

  public String getHangUpReason() {
    return hangUpReason;
  }


  public void setHangUpReason(String hangUpReason) {
    this.hangUpReason = hangUpReason;
  }


  public CheckAllRspAllOf completedTask(Long completedTask) {
    
    this.completedTask = completedTask;
    return this;
  }

   /**
   * 已完成的任务总量
   * @return completedTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已完成的任务总量")

  public Long getCompletedTask() {
    return completedTask;
  }


  public void setCompletedTask(Long completedTask) {
    this.completedTask = completedTask;
  }


  public CheckAllRspAllOf totalTask(Long totalTask) {
    
    this.totalTask = totalTask;
    return this;
  }

   /**
   * 任务总数
   * @return totalTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "任务总数")

  public Long getTotalTask() {
    return totalTask;
  }


  public void setTotalTask(Long totalTask) {
    this.totalTask = totalTask;
  }


  public CheckAllRspAllOf answeredTask(Long answeredTask) {
    
    this.answeredTask = answeredTask;
    return this;
  }

   /**
   * 接通电话总量
   * @return answeredTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "接通电话总量")

  public Long getAnsweredTask() {
    return answeredTask;
  }


  public void setAnsweredTask(Long answeredTask) {
    this.answeredTask = answeredTask;
  }


  public CheckAllRspAllOf ablevelCustomer(Long ablevelCustomer) {
    
    this.ablevelCustomer = ablevelCustomer;
    return this;
  }

   /**
   * AB类客户数量
   * @return ablevelCustomer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AB类客户数量")

  public Long getAblevelCustomer() {
    return ablevelCustomer;
  }


  public void setAblevelCustomer(Long ablevelCustomer) {
    this.ablevelCustomer = ablevelCustomer;
  }


  public CheckAllRspAllOf msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 信息
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "信息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckAllRspAllOf checkAllRspAllOf = (CheckAllRspAllOf) o;
    return Objects.equals(this.robotCallJobId, checkAllRspAllOf.robotCallJobId) &&
        Objects.equals(this.robotCallJobName, checkAllRspAllOf.robotCallJobName) &&
        Objects.equals(this.createTime, checkAllRspAllOf.createTime) &&
        Objects.equals(this.createUserName, checkAllRspAllOf.createUserName) &&
        Objects.equals(this.status, checkAllRspAllOf.status) &&
        Objects.equals(this.hangUpType, checkAllRspAllOf.hangUpType) &&
        Objects.equals(this.hangUpReason, checkAllRspAllOf.hangUpReason) &&
        Objects.equals(this.completedTask, checkAllRspAllOf.completedTask) &&
        Objects.equals(this.totalTask, checkAllRspAllOf.totalTask) &&
        Objects.equals(this.answeredTask, checkAllRspAllOf.answeredTask) &&
        Objects.equals(this.ablevelCustomer, checkAllRspAllOf.ablevelCustomer) &&
        Objects.equals(this.msg, checkAllRspAllOf.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(robotCallJobId, robotCallJobName, createTime, createUserName, status, hangUpType, hangUpReason, completedTask, totalTask, answeredTask, ablevelCustomer, msg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckAllRspAllOf {\n");
    sb.append("    robotCallJobId: ").append(toIndentedString(robotCallJobId)).append("\n");
    sb.append("    robotCallJobName: ").append(toIndentedString(robotCallJobName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hangUpType: ").append(toIndentedString(hangUpType)).append("\n");
    sb.append("    hangUpReason: ").append(toIndentedString(hangUpReason)).append("\n");
    sb.append("    completedTask: ").append(toIndentedString(completedTask)).append("\n");
    sb.append("    totalTask: ").append(toIndentedString(totalTask)).append("\n");
    sb.append("    answeredTask: ").append(toIndentedString(answeredTask)).append("\n");
    sb.append("    ablevelCustomer: ").append(toIndentedString(ablevelCustomer)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
