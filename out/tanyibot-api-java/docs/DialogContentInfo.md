

# DialogContentInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | 响应码 |  [optional]
**requestId** | **String** | 请求id |  [optional]
**resultMsg** | **String** | 响应说明 |  [optional]
**errorStackTrace** | **String** |  |  [optional]
**dialogFlowId** | **Long** | 话术id |  [optional]
**name** | **String** | 话术名称 |  [optional]
**totalRecordCount** | **Integer** | 需要录音条数 |  [optional]
**completeRecordCount** | **Integer** | 已录音条数 |  [optional]
**label** | **String** | 文本标签(上传录音时已次标签为文件名) |  [optional]
**title** | **String** | 流程、节点、问答知识等名称 |  [optional]
**context** | **String** | 录音文本内容 |  [optional]
**prefixRecordUrl** | **String** | 录音文件，未录音时此字段为空 |  [optional]
**dialogFlowSteps** | [**List&lt;DialogFlowStep&gt;**](DialogFlowStep.md) |  |  [optional]
**dialogFlowConfig** | [**List&lt;DialogFlowConfig&gt;**](DialogFlowConfig.md) |  |  [optional]
**robotKnowledges** | [**List&lt;RobotKnowledge&gt;**](RobotKnowledge.md) |  |  [optional]
**knowledgeSteps** | [**List&lt;KnowledgeStep&gt;**](KnowledgeStep.md) |  |  [optional]



