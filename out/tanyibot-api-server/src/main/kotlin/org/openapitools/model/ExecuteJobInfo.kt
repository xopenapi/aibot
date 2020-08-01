package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.StatsInfo
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param robotCallJobId 任务id
 * @param robotCallJobName 任务名
 * @param createTime 创建时间
 * @param createUserName 任务创建人
 * @param status 任务状态，NOT_STARTED(0, \"未开始\"),IN_PROCESS(1, \"进行中\")，COMPLETED(2, \"已完成\"),RUNNABLE(3, \"可运行\"),USER_PAUSE(4, \"用户暂停\"),SYSTEM_SUSPENDED(5, \"系统暂停\")，TERMINATE(6, \"已终止\"),IN_QUEUE(7, \"排队中\"),SYSTEM_HANG_UP(10, \"系统挂起\"),WAITING_FOR_REDIAL(11, \"等待重呼\"),ACCOUNT_DISABLE(12, \"账户禁用\"),MAINTAIN(13, \"系统维护\");
 * @param hangUpType 系统挂起类型 ACCOUNT_DEBT(0, \"账户欠费\", \"使用的线路账户已欠费\"),NO_ROBOT_AVAILABLE(1, \"没有可用坐席\", \"当前没有可用坐席\"),PHONE_UNBIND(2, \"线路已解绑\", \"使用的线路已解绑\"),LINE_BREAKDOWN(3, \"线路故障\", \"使用的线路状态均为故障\"),AVAILABLE_ROBOT_NOT_ENOUGH(4,\"有效坐席数不足\",\"有效坐席数不足，请检查有效AI坐席数量！\");
 * @param hangUpReason 系统挂起原因
 * @param statsInfo 
 */
data class ExecuteJobInfo(

    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long? = null,

    @field:JsonProperty("robotCallJobName") val robotCallJobName: kotlin.String? = null,

    @field:JsonProperty("createTime") val createTime: kotlin.String? = null,

    @field:JsonProperty("createUserName") val createUserName: kotlin.String? = null,

    @field:JsonProperty("status") val status: ExecuteJobInfo.Status? = null,

    @field:JsonProperty("hangUpType") val hangUpType: ExecuteJobInfo.HangUpType? = null,

    @field:JsonProperty("hangUpReason") val hangUpReason: kotlin.String? = null,

    @field:JsonProperty("statsInfo") val statsInfo: StatsInfo? = null
) {

    /**
    * 任务状态，NOT_STARTED(0, \"未开始\"),IN_PROCESS(1, \"进行中\")，COMPLETED(2, \"已完成\"),RUNNABLE(3, \"可运行\"),USER_PAUSE(4, \"用户暂停\"),SYSTEM_SUSPENDED(5, \"系统暂停\")，TERMINATE(6, \"已终止\"),IN_QUEUE(7, \"排队中\"),SYSTEM_HANG_UP(10, \"系统挂起\"),WAITING_FOR_REDIAL(11, \"等待重呼\"),ACCOUNT_DISABLE(12, \"账户禁用\"),MAINTAIN(13, \"系统维护\");
    * Values: nOTSTARTED,iNPROCESS,cOMPLETED,rUNNABLE,uSERPAUSE,sYSTEMSUSPENDED,tERMINATE,iNQUEUE,sYSTEMHANGUP,wAITINGFORREDIAL,aCCOUNTDISABLE,mAINTAIN
    */
    enum class Status(val value: kotlin.String) {
    
        @JsonProperty("NOT_STARTED") nOTSTARTED("NOT_STARTED"),
    
        @JsonProperty("IN_PROCESS") iNPROCESS("IN_PROCESS"),
    
        @JsonProperty("COMPLETED") cOMPLETED("COMPLETED"),
    
        @JsonProperty("RUNNABLE") rUNNABLE("RUNNABLE"),
    
        @JsonProperty("USER_PAUSE") uSERPAUSE("USER_PAUSE"),
    
        @JsonProperty("SYSTEM_SUSPENDED") sYSTEMSUSPENDED("SYSTEM_SUSPENDED"),
    
        @JsonProperty("TERMINATE") tERMINATE("TERMINATE"),
    
        @JsonProperty("IN_QUEUE") iNQUEUE("IN_QUEUE"),
    
        @JsonProperty("SYSTEM_HANG_UP") sYSTEMHANGUP("SYSTEM_HANG_UP"),
    
        @JsonProperty("WAITING_FOR_REDIAL") wAITINGFORREDIAL("WAITING_FOR_REDIAL"),
    
        @JsonProperty("ACCOUNT_DISABLE") aCCOUNTDISABLE("ACCOUNT_DISABLE"),
    
        @JsonProperty("MAINTAIN") mAINTAIN("MAINTAIN");
    
    }

    /**
    * 系统挂起类型 ACCOUNT_DEBT(0, \"账户欠费\", \"使用的线路账户已欠费\"),NO_ROBOT_AVAILABLE(1, \"没有可用坐席\", \"当前没有可用坐席\"),PHONE_UNBIND(2, \"线路已解绑\", \"使用的线路已解绑\"),LINE_BREAKDOWN(3, \"线路故障\", \"使用的线路状态均为故障\"),AVAILABLE_ROBOT_NOT_ENOUGH(4,\"有效坐席数不足\",\"有效坐席数不足，请检查有效AI坐席数量！\");
    * Values: aCCOUNTDEBT,nOROBOTAVAILABLE,pHONEUNBIND,lINEBREAKDOWN,aVAILABLEROBOTNOTENOUGH
    */
    enum class HangUpType(val value: kotlin.String) {
    
        @JsonProperty("ACCOUNT_DEBT") aCCOUNTDEBT("ACCOUNT_DEBT"),
    
        @JsonProperty("NO_ROBOT_AVAILABLE") nOROBOTAVAILABLE("NO_ROBOT_AVAILABLE"),
    
        @JsonProperty("PHONE_UNBIND") pHONEUNBIND("PHONE_UNBIND"),
    
        @JsonProperty("LINE_BREAKDOWN") lINEBREAKDOWN("LINE_BREAKDOWN"),
    
        @JsonProperty("AVAILABLE_ROBOT_NOT_ENOUGH") aVAILABLEROBOTNOTENOUGH("AVAILABLE_ROBOT_NOT_ENOUGH");
    
    }

}

