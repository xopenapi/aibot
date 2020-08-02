

# CallIntercept

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantCallInterceptId** | **Long** | 拦截组Id |  [optional]
**name** | **String** | 拦截组名称 |  [optional]
**callOutRestrict** | **String** | 是否开启外呼上限设置(YES 开启 NO 不开启) |  [optional]
**callOutCount** | **Integer** | 外呼次数上限限制 |  [optional]
**callOutDays** | **Integer** | 外呼次数天数内限制 |  [optional]
**notExistDays** | **Integer** | 空号天数限制 0为取消 |  [optional]
**notServiceDays** | **Integer** | 停机天数限制 0为取消 |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | 生效范围 ALL 全网 TENANT 公司内部 |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | 拦截组来源 SYSTEM 系统规则 CUSTOM 自定义规则 |  [optional]
**defaultStatus** | **Boolean** | 是否默认规则 |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ALL | &quot;ALL&quot;
TENANT | &quot;TENANT&quot;



## Enum: SourceEnum

Name | Value
---- | -----
SYSTEM | &quot;SYSTEM&quot;
CUSTOM | &quot;CUSTOM&quot;



