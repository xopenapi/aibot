package org.openapitools.api

import org.openapitools.model.APIResponse
import org.openapitools.model.GetPhoneListRsp
import org.openapitools.model.UpdatePhoneInfoByTenantPhoneNumberIdReq
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/apiOpen/v1}")
class PhoneApiController() {


    @RequestMapping(
        value = ["/phone/getPhoneList"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun getPhoneList( @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
, @RequestParam(value = "appSecret", required = false) appSecret: kotlin.String?
, @RequestParam(value = "tenantSign", required = false) tenantSign: kotlin.String?
, @RequestParam(value = "version", required = false) version: kotlin.String?
, @RequestParam(value = "timestamp", required = false) timestamp: kotlin.String?
, @RequestParam(value = "signature", required = false) signature: kotlin.String?
): ResponseEntity<GetPhoneListRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/phone/updatePhoneInfoByTenantPhoneNumberId"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun updatePhoneInfoByTenantPhoneNumberId( @Valid @RequestBody body: UpdatePhoneInfoByTenantPhoneNumberIdReq
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/phone/updatePhonePriceByTenantPhoneNumberId"],
        produces = ["application/json"], 
        method = [RequestMethod.POST])
    fun updatePhonePriceByTenantPhoneNumberId(): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
