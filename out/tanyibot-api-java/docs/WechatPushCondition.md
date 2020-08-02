

# WechatPushCondition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intentLevelCodes** | **List&lt;Integer&gt;** | 意向等级 |  [optional]
**durationThreshold** | **Integer** | 通话时长 |  [optional]
**userIds** | **List&lt;Long&gt;** | 微信推送人 |  [optional]
**wechatSendMethod** | [**WechatSendMethodEnum**](#WechatSendMethodEnum) | 微信推送方式（SENDTOALL，全推送），（SENDTOONE，单推送），（SENDTONONE 不推送） |  [optional]
**transferCustomer** | **Boolean** | 分配客户给微信推送人 |  [optional]



## Enum: WechatSendMethodEnum

Name | Value
---- | -----
SENDTOALL | &quot;SENDTOALL&quot;
SENDTOONE | &quot;SENDTOONE&quot;
SENDTONONE | &quot;SENDTONONE&quot;



