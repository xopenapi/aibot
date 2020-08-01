package org.openapitools.api

import org.openapitools.model.APIResponse
import org.openapitools.model.CopyDialogFlowReq
import org.openapitools.model.CopyDialogFlowRsp
import org.openapitools.model.DialogContentInfo
import org.openapitools.model.DialogFlowCallJobRelatedInfo
import org.openapitools.model.DialogFlowList
import org.openapitools.model.GetTotalDialogFlowListReq
import org.openapitools.model.InlineResponse200
import org.openapitools.model.TotalDialogFlowListRsp
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
class DialogFlowApiController() {


    @RequestMapping(
        value = ["/dialogFlow/batchUpload"],
        produces = ["application/json"], 
        consumes = ["multipart/form-data"],
        method = [RequestMethod.POST])
    fun dialogFlowBatchUploadPost( @RequestParam(value="dialogFlowId", required=true) dialogFlowId: kotlin.Long 
, @Valid @RequestPart("file") file: org.springframework.core.io.Resource
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/dialogFlow/copyDialogFlow"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun dialogFlowCopyDialogFlowPost( @Valid @RequestBody body: CopyDialogFlowReq?
): ResponseEntity<CopyDialogFlowRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/dialogFlow/getDialogFlowCallJobRelatedInfo"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun dialogFlowGetDialogFlowCallJobRelatedInfoGet(@NotNull  @RequestParam(value = "dialogFlowId", required = true) dialogFlowId: kotlin.Long
): ResponseEntity<DialogFlowCallJobRelatedInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/dialogFlow/getTotalDialogFlowList"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun dialogFlowGetTotalDialogFlowListPost( @Valid @RequestBody body: GetTotalDialogFlowListReq?
): ResponseEntity<TotalDialogFlowListRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/dialogFlow/exportDialogFlowWordDoc"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun exportDialogFlowWordDoc(@NotNull  @RequestParam(value = "dialogFlowId", required = true) dialogFlowId: kotlin.Long
): ResponseEntity<InlineResponse200> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/dialogFlow/getDialogContentInfo"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun getDialogContentInfo(@NotNull  @RequestParam(value = "dialogFlowId", required = true) dialogFlowId: kotlin.Long
): ResponseEntity<DialogContentInfo> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/dialogFlow/getDialogFlowList"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun getDialogFlowList(): ResponseEntity<DialogFlowList> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
