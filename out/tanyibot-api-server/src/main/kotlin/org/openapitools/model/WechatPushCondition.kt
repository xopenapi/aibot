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
 * @param intentLevelCodes 意向等级
 * @param durationThreshold 通话时长
 * @param userIds 微信推送人
 * @param wechatSendMethod 微信推送方式（SENDTOALL，全推送），（SENDTOONE，单推送），（SENDTONONE 不推送）
 * @param transferCustomer 分配客户给微信推送人
 */
data class WechatPushCondition(

    @field:JsonProperty("intentLevelCodes") val intentLevelCodes: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("durationThreshold") val durationThreshold: kotlin.Int? = null,

    @field:JsonProperty("userIds") val userIds: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("wechatSendMethod") val wechatSendMethod: WechatPushCondition.WechatSendMethod? = null,

    @field:JsonProperty("transferCustomer") val transferCustomer: kotlin.Boolean? = null
) {

    /**
    * 微信推送方式（SENDTOALL，全推送），（SENDTOONE，单推送），（SENDTONONE 不推送）
    * Values: sENDTOALL,sENDTOONE,sENDTONONE
    */
    enum class WechatSendMethod(val value: kotlin.String) {
    
        @JsonProperty("SENDTOALL") sENDTOALL("SENDTOALL"),
    
        @JsonProperty("SENDTOONE") sENDTOONE("SENDTOONE"),
    
        @JsonProperty("SENDTONONE") sENDTONONE("SENDTONONE");
    
    }

}

