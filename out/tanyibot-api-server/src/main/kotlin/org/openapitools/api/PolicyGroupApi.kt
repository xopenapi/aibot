package org.openapitools.api

import org.openapitools.model.APIResponse
import org.openapitools.model.CreatePolicyGroupReq
import org.openapitools.model.GetIdAndNamePairListRsp
import org.openapitools.model.GetPolicyGroupListRsp
import org.openapitools.model.UpdatePolicyGroupReq
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
class PolicyGroupApiController() {


    @RequestMapping(
        value = ["/policyGroup/create"],
        produces = ["*/*"], 
        method = [RequestMethod.POST])
    fun policyGroupCreatePost( @Valid @RequestBody body: CreatePolicyGroupReq?
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/policyGroup/getIdAndNamePairList"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun policyGroupGetIdAndNamePairListGet(): ResponseEntity<GetIdAndNamePairListRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/policyGroup/list"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun policyGroupListGet(): ResponseEntity<GetPolicyGroupListRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/policyGroup/update"],
        produces = ["*/*"], 
        method = [RequestMethod.POST])
    fun policyGroupUpdatePost( @Valid @RequestBody body: UpdatePolicyGroupReq?
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
