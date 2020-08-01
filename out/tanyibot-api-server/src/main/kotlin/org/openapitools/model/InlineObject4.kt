package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param operation 操作类型，必填 PAUSE:暂停 START:开始
 * @param robotCallJobIdSet 任务id集合
 * @param statusSet 任务状态，NOT_STARTED(0, \"未开始\"),IN_PROCESS(1, \"进行中\")，COMPLETED(2, \"已完成\"),RUNNABLE(3, \"可运行\"),USER_PAUSE(4, \"用户暂停\"),SYSTEM_SUSPENDED(5, \"系统暂停\")，TERMINATE(6, \"已终止\"),IN_QUEUE(7, \"排队中\"),SYSTEM_HANG_UP(10, \"系统挂起\"),WAITING_FOR_REDIAL(11, \"等待重呼\"),ACCOUNT_DISABLE(12, \"账户禁用\"),MAINTAIN(13, \"系统维护\");
 * @param name 任务名称
 * @param beginCreateDate 开始任务创建日期
 * @param endCreateDate 结束任务创建日期
 */
data class InlineObject4(

    @get:NotNull 
    @field:JsonProperty("operation") val operation: InlineObject4.Operation,

    @field:JsonProperty("robotCallJobIdSet") val robotCallJobIdSet: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("statusSet") val statusSet: InlineObject4.StatusSet? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("beginCreateDate") val beginCreateDate: kotlin.String? = null,

    @field:JsonProperty("endCreateDate") val endCreateDate: kotlin.String? = null
) {

    /**
    * 操作类型，必填 PAUSE:暂停 START:开始
    * Values: pAUSE,sTART
    */
    enum class Operation(val value: kotlin.String) {
    
        @JsonProperty("PAUSE") pAUSE("PAUSE"),
    
        @JsonProperty("START") sTART("START");
    
    }

    /**
    * 任务状态，NOT_STARTED(0, \"未开始\"),IN_PROCESS(1, \"进行中\")，COMPLETED(2, \"已完成\"),RUNNABLE(3, \"可运行\"),USER_PAUSE(4, \"用户暂停\"),SYSTEM_SUSPENDED(5, \"系统暂停\")，TERMINATE(6, \"已终止\"),IN_QUEUE(7, \"排队中\"),SYSTEM_HANG_UP(10, \"系统挂起\"),WAITING_FOR_REDIAL(11, \"等待重呼\"),ACCOUNT_DISABLE(12, \"账户禁用\"),MAINTAIN(13, \"系统维护\");
    * Values: nOTSTARTED,iNPROCESS,cOMPLETED,rUNNABLE,uSERPAUSE,sYSTEMSUSPENDED,tERMINATE,iNQUEUE,sYSTEMHANGUP,wAITINGFORREDIAL,aCCOUNTDISABLE,mAINTAIN
    */
    enum class StatusSet(val value: kotlin.String) {
    
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

}

