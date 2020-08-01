package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RobotCallJobInactiveTimeList
import org.openapitools.model.WechatPushCondition
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param dialogFlowId 
 * @param isPrior 
 * @param robotCallJobId 任务id
 * @param dailyEndTime 
 * @param dailyStartTime 
 * @param description 
 * @param earlyWarningAlertUsers 
 * @param inactiveTimeList 
 * @param name 任务名称
 * @param mode 任务类型 (AUTO, \"自动任务\"),(MANUAL, \"手动任务\");
 * @param phoneType 号码类型 (MOBILE, \"手机号码\"),(LANDLINE, \"固话\"),(UNFIXED_CALL, \"无主叫\"), (CALL_POLICY_GROUP, \"外呼策略组\")
 * @param robotCount 
 * @param smsAlertLevel 
 * @param smsTemplateId 
 * @param startTime 
 * @param tenantId 
 * @param smsAlertLevelCode 
 * @param wechatPushConditionList 微信推送条件
 * @param redialCondition 重拨条件(CALL_LOSS,\"呼损客户\"),(NO_ANSWER,\"无应答\"),(BUSY,\"忙线中\"),(REFUSED,\"拒接\"),(POWER_OFF,\"关机\"),(OUT_OF_SERVICE,\"停机\"),(CAN_NOT_CONNECT,“无法接通“),(FROM_PHONE_ERROR,\"主叫欠费\"),(SYSTEM_ERROR,\"外呼失败\")
 * @param redialInterval 重拨间隔(分钟，取值范围6分钟~24 x 60分钟)
 * @param redialTimes 重拨次数(取值范围1~10）
 * @param tenantCallInterceptId 拦截组id
 */
data class RobotCallJob(

    @field:JsonProperty("dialogFlowId") val dialogFlowId: kotlin.Int? = null,

    @field:JsonProperty("isPrior") val isPrior: kotlin.Boolean? = null,

    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long? = null,

    @field:JsonProperty("dailyEndTime") val dailyEndTime: kotlin.String? = null,

    @field:JsonProperty("dailyStartTime") val dailyStartTime: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("earlyWarningAlertUsers") val earlyWarningAlertUsers: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("inactiveTimeList") val inactiveTimeList: kotlin.collections.List<RobotCallJobInactiveTimeList>? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("mode") val mode: RobotCallJob.Mode? = null,

    @field:JsonProperty("phoneType") val phoneType: RobotCallJob.PhoneType? = null,

    @field:JsonProperty("robotCount") val robotCount: kotlin.Int? = null,

    @field:JsonProperty("smsAlertLevel") val smsAlertLevel: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("smsTemplateId") val smsTemplateId: kotlin.Int? = null,

    @field:JsonProperty("startTime") val startTime: kotlin.String? = null,

    @field:JsonProperty("tenantId") val tenantId: kotlin.Long? = null,

    @field:JsonProperty("smsAlertLevelCode") val smsAlertLevelCode: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("wechatPushConditionList") val wechatPushConditionList: kotlin.collections.List<WechatPushCondition>? = null,

    @field:JsonProperty("redialCondition") val redialCondition: kotlin.collections.List<RobotCallJob.RedialCondition>? = null,

    @field:JsonProperty("redialInterval") val redialInterval: kotlin.Int? = null,

    @field:JsonProperty("redialTimes") val redialTimes: kotlin.Int? = null,

    @field:JsonProperty("tenantCallInterceptId") val tenantCallInterceptId: kotlin.Long? = null
) {

    /**
    * 任务类型 (AUTO, \"自动任务\"),(MANUAL, \"手动任务\");
    * Values: aUTO,mANUAL
    */
    enum class Mode(val value: kotlin.String) {
    
        @JsonProperty("AUTO") aUTO("AUTO"),
    
        @JsonProperty("MANUAL") mANUAL("MANUAL");
    
    }

    /**
    * 号码类型 (MOBILE, \"手机号码\"),(LANDLINE, \"固话\"),(UNFIXED_CALL, \"无主叫\"), (CALL_POLICY_GROUP, \"外呼策略组\")
    * Values: mOBILE,lANDLINE,uNFIXEDCALL,cALLPOLICYGROUP
    */
    enum class PhoneType(val value: kotlin.String) {
    
        @JsonProperty("MOBILE") mOBILE("MOBILE"),
    
        @JsonProperty("LANDLINE") lANDLINE("LANDLINE"),
    
        @JsonProperty("UNFIXED_CALL") uNFIXEDCALL("UNFIXED_CALL"),
    
        @JsonProperty("CALL_POLICY_GROUP") cALLPOLICYGROUP("CALL_POLICY_GROUP");
    
    }

    /**
    * 重拨条件(CALL_LOSS,\"呼损客户\"),(NO_ANSWER,\"无应答\"),(BUSY,\"忙线中\"),(REFUSED,\"拒接\"),(POWER_OFF,\"关机\"),(OUT_OF_SERVICE,\"停机\"),(CAN_NOT_CONNECT,“无法接通“),(FROM_PHONE_ERROR,\"主叫欠费\"),(SYSTEM_ERROR,\"外呼失败\")
    * Values: cALLLOSS,nOANSWER,bUSY,rEFUSED,pOWEROFF,oUTOFSERVICE
    */
    enum class RedialCondition(val value: kotlin.String) {
    
        @JsonProperty("CALL_LOSS") cALLLOSS("CALL_LOSS"),
    
        @JsonProperty("NO_ANSWER") nOANSWER("NO_ANSWER"),
    
        @JsonProperty("BUSY") bUSY("BUSY"),
    
        @JsonProperty("REFUSED") rEFUSED("REFUSED"),
    
        @JsonProperty("POWER_OFF") pOWEROFF("POWER_OFF"),
    
        @JsonProperty("OUT_OF_SERVICE") oUTOFSERVICE("OUT_OF_SERVICE");
    
    }

}

