

# CopyDialogFlowRspAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dialogFlowId** | **Long** | 话术id |  [optional]
**name** | **String** | 话术名称 |  [optional]
**intentLevelTagId** | **Long** | 意向分组id |  [optional]
**status** | **String** | 话术状态(DRAFT 草稿 PENDING_APPROVAL 等待审核 REJECTED 拒绝 APPROVED 审核通过) |  [optional]
**createTime** | **String** | 话术创建时间 |  [optional]
**industry** | [**Industry**](Industry.md) |  |  [optional]
**subIndustry** | [**Industry**](Industry.md) |  |  [optional]
**description** | **String** | 描述 |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | 话术类型(NORMAL 客户定制 TEMPLATE 模板) |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
NORMAL | &quot;NORMAL&quot;
TEMPLATE | &quot;TEMPLATE&quot;



