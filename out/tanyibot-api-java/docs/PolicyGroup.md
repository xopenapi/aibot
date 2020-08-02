

# PolicyGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createUserId** | **Integer** |  |  [optional]
**updateUserId** | **Integer** |  |  [optional]
**createTime** | **String** |  |  [optional]
**updateTime** | **String** |  |  [optional]
**callPolicyGroupId** | **Integer** | 外呼策略组ID |  [optional]
**tenantId** | **Long** | 公司ID |  [optional]
**name** | **String** |  |  [optional]
**remark** | **String** | 备注 |  [optional]
**phoneType** | **String** | 外呼策略组类型 |  [optional]
**dispatchType** | [**DispatchTypeEnum**](#DispatchTypeEnum) | 优先级策略，(SORT_FIRST, \&quot;排序优先级优先\&quot;),(LOCATION_MATCH_FIRST, \&quot;归属地匹配优先\&quot;) |  [optional]
**detailList** | [**List&lt;CallPolicyGroupDetail&gt;**](CallPolicyGroupDetail.md) |  |  [optional]



## Enum: DispatchTypeEnum

Name | Value
---- | -----
SORT_FIRST | &quot;SORT_FIRST&quot;
LOCATION_MATCH_FIRST | &quot;LOCATION_MATCH_FIRST&quot;



