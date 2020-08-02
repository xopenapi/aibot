

# UpdatePolicyGroupReq

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callPolicyGroupId** | **Long** | 外呼策略组ID |  [optional]
**name** | **String** | 外呼策略组名称 |  [optional]
**remark** | **String** | 备注 |  [optional]
**dispatchType** | [**DispatchTypeEnum**](#DispatchTypeEnum) | 优先级策略，(SORT_FIRST, \&quot;排序优先级优先\&quot;),(LOCATION_MATCH_FIRST, \&quot;归属地匹配优先\&quot;); |  [optional]
**tenantPhoneNumberId** | **Long** | 用户线路ID | 



## Enum: DispatchTypeEnum

Name | Value
---- | -----
SORT_FIRST | &quot;SORT_FIRST&quot;
LOCATION_MATCH_FIRST | &quot;LOCATION_MATCH_FIRST&quot;



