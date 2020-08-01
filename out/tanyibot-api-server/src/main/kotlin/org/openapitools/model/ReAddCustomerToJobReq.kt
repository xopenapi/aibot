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
 * @param robotCallJobId 
 * @param customerPersonIds 
 * @param lastCallRecord 是否过滤重复通话记录只显示最近的一条
 * @param calledPhoneNumber 被叫号码
 * @param callRecordId 通话记录id
 * @param customerPersonName 客户姓名
 * @param customerGroupId 分组id
 * @param resultStatuses ANSWERED(0, \"已接听\", null), NO_ANSWER(1, \"无应答\", \"呼叫号码未接听\"), BUSY(2, \"忙线中\", \"呼叫号码占线\"), POWER_OFF(3, \"关机\", \"呼叫号码关机\"), OUT_OF_SERVICE(4, \"停机\", \"呼叫号码停机\"), REFUSED(5, \"拒接\", \"呼叫号码拒接\"), VACANT_NUMBER(6, \"空号\", \"呼叫的号码是空号\"), CAN_NOT_CONNECT(7, \"无法接通\", \"呼叫的号码无法接通\"), FROM_PHONE_ERROR(8, \"主叫停机\", \"主叫号码不可用\"), SYSTEM_ERROR(9, \"系统错误\", \"外呼失败，系统错误\"), CALL_LOSS(10,\"多并发呼损\",\"等待服务中用户挂断\"), TRANSFER_ARTIFICIAL(11,\"转人工呼损\",\"等待转人工服务中用户挂断\"); [\"ANSWERED\",
 * @param intentLevels 
 * @param followStatus 跟进状态CLUE(0, \"线索\"), AI_INITIAL_VISIT(1, \"AI初访\"), PEOPLE_INITIAL_VISIT(2, \"人工初访\"), AI_FOLLOW_UP(3, \"AI持续跟进\"), PEOPLE_FOLLOW_UP(4, \"人工持续跟进\"), QUOTE(5, \"报价\"), DEAL(6, \"成交\"), LOSS(7, \"流失\");
 * @param dialogFlowId 话术ID
 * @param earliestCreationTime 最早创建时间，日期标准格式，请不要包含时间。可以为空
 * @param latestCreationTime 最晚创建时间，日期标准格式，请不要包含时间。可以为空
 */
data class ReAddCustomerToJobReq(

    @get:NotNull 
    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long,

    @get:NotNull 
    @field:JsonProperty("customerPersonIds") val customerPersonIds: kotlin.collections.List<kotlin.Long>,

    @field:JsonProperty("lastCallRecord") val lastCallRecord: kotlin.Boolean? = null,

    @field:JsonProperty("calledPhoneNumber") val calledPhoneNumber: kotlin.String? = null,

    @field:JsonProperty("callRecordId") val callRecordId: kotlin.Long? = null,

    @field:JsonProperty("customerPersonName") val customerPersonName: kotlin.String? = null,

    @field:JsonProperty("customerGroupId") val customerGroupId: kotlin.Long? = null,

    @field:JsonProperty("resultStatuses") val resultStatuses: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("intentLevels") val intentLevels: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("followStatus") val followStatus: ReAddCustomerToJobReq.FollowStatus? = null,

    @field:JsonProperty("dialogFlowId") val dialogFlowId: kotlin.Long? = null,

    @field:JsonProperty("earliestCreationTime") val earliestCreationTime: kotlin.String? = null,

    @field:JsonProperty("latestCreationTime") val latestCreationTime: kotlin.String? = null
) {

    /**
    * 跟进状态CLUE(0, \"线索\"), AI_INITIAL_VISIT(1, \"AI初访\"), PEOPLE_INITIAL_VISIT(2, \"人工初访\"), AI_FOLLOW_UP(3, \"AI持续跟进\"), PEOPLE_FOLLOW_UP(4, \"人工持续跟进\"), QUOTE(5, \"报价\"), DEAL(6, \"成交\"), LOSS(7, \"流失\");
    * Values: cLUE,aIINITIALVISIT,pEOPLEINITIALVISIT,aIFOLLOWUP,pEOPLEFOLLOWUP,qUOTE,dEAL,lOSS
    */
    enum class FollowStatus(val value: kotlin.String) {
    
        @JsonProperty("CLUE") cLUE("CLUE"),
    
        @JsonProperty("AI_INITIAL_VISIT") aIINITIALVISIT("AI_INITIAL_VISIT"),
    
        @JsonProperty("PEOPLE_INITIAL_VISIT") pEOPLEINITIALVISIT("PEOPLE_INITIAL_VISIT"),
    
        @JsonProperty("AI_FOLLOW_UP") aIFOLLOWUP("AI_FOLLOW_UP"),
    
        @JsonProperty("PEOPLE_FOLLOW_UP") pEOPLEFOLLOWUP("PEOPLE_FOLLOW_UP"),
    
        @JsonProperty("QUOTE") qUOTE("QUOTE"),
    
        @JsonProperty("DEAL") dEAL("DEAL"),
    
        @JsonProperty("LOSS") lOSS("LOSS");
    
    }

}
