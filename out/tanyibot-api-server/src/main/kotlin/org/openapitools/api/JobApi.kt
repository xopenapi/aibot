package org.openapitools.api

import org.openapitools.model.APIResponse
import org.openapitools.model.CheckAllRsp
import org.openapitools.model.ExecuteJobsReq
import org.openapitools.model.ExecuteJobsRsp
import org.openapitools.model.GetJobDetailRsp
import org.openapitools.model.GetJobStatsInfoListRsp
import org.openapitools.model.GetJobsRsp
import org.openapitools.model.ImportCustomerReq
import org.openapitools.model.InlineObject
import org.openapitools.model.InlineObject1
import org.openapitools.model.InlineObject2
import org.openapitools.model.InlineObject3
import org.openapitools.model.InlineObject4
import org.openapitools.model.InlineObject5
import org.openapitools.model.Job
import org.openapitools.model.JobCreateRsp
import org.openapitools.model.JobUpdateRsp
import org.openapitools.model.ReAddCustomerToJobReq
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
class JobApiController() {


    @RequestMapping(
        value = ["/job/create"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun create( @Valid @RequestBody body: Job
): ResponseEntity<JobCreateRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/importCustomer"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun importCustomer( @Valid @RequestBody body: ImportCustomerReq
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/checkAll"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobCheckAllPost( @Valid @RequestBody body: InlineObject4
): ResponseEntity<CheckAllRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/delete"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobDeletePost( @Valid @RequestBody body: InlineObject2?
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/executeJobs"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobExecuteJobsPost( @Valid @RequestBody body: ExecuteJobsReq
): ResponseEntity<ExecuteJobsRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/getJobDetail"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun jobGetJobDetailGet(@NotNull  @RequestParam(value = "robotCallJobId", required = true) robotCallJobId: kotlin.Long
): ResponseEntity<GetJobDetailRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/getJobStatsInfoList"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobGetJobStatsInfoListPost( @Valid @RequestBody body: InlineObject5
): ResponseEntity<GetJobStatsInfoListRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/getJobs"],
        produces = ["application/json"], 
        method = [RequestMethod.GET])
    fun jobGetJobsGet( @RequestParam(value = "name", required = false) name: kotlin.String?
, @RequestParam(value = "status", required = false) status: kotlin.String?
, @RequestParam(value = "pageNum", required = false) pageNum: kotlin.Int?
, @RequestParam(value = "pageSize", required = false) pageSize: kotlin.Int?
): ResponseEntity<GetJobsRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/modify"],
        produces = ["*/*"], 
        method = [RequestMethod.PATCH])
    fun jobModifyPatch( @Valid @RequestBody body: Job?
): ResponseEntity<JobUpdateRsp> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/pause"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobPausePost( @Valid @RequestBody body: InlineObject1?
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/reAddCustomerToJob"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobReAddCustomerToJobPost( @Valid @RequestBody body: ReAddCustomerToJobReq
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/updateAiCount"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun jobUpdateAiCountPost( @Valid @RequestBody body: InlineObject3
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
        value = ["/job/start"],
        produces = ["application/json"], 
        consumes = ["application/json"],
        method = [RequestMethod.POST])
    fun start( @Valid @RequestBody body: InlineObject
): ResponseEntity<APIResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
