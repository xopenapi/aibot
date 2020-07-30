package aibot_test

import(
	"testing"
	"time"
	"fmt"
	"encoding/json"
	"context"
	"github.com/xopenapi/aibot"
	"gopkg.in/yaml.v2"
	"log"
	"io/ioutil"
	"github.com/antihax/optional"
)


type conf struct {
	AppKey 		string   	`yaml:"appKey"` //yaml：yaml格式 enabled：属性的为enabled
	AppSecret   string 		`yaml:"appSecret"`
	TenantSign	string		`yaml:"tenantSign"`
}

func TestGetPhoneList(t *testing.T) {
	var conf conf
	yamlFile, err := ioutil.ReadFile("conf.yaml")
	if err != nil {
		log.Printf("yamlFile.Get err #%v ", err)
	}
	err = yaml.Unmarshal(yamlFile, &conf)
	if err != nil {
		log.Fatalf("Unmarshal: %v", err)
	}
	
	cfg := aibot.NewConfiguration()	
	client := aibot.NewAPIClient(cfg)

	timestamp := fmt.Sprintf("%d", time.Now().UnixNano() / (1000*1000))
	version := "v1"

	params := aibot.KVS{
		aibot.KV{ K: "appKey", V: conf.AppKey },
		aibot.KV{ K: "appSecret", V: conf.AppSecret },
		aibot.KV{ K: "tenantSign", V: conf.TenantSign },
		aibot.KV{ K: "version", V: version },
		aibot.KV{ K: "timestamp", V: timestamp },
	}

	signature := aibot.SignArr(params, conf.TenantSign)

	req := &aibot.GetPhoneListOpts{
		AppKey: optional.NewString(conf.AppKey),
		AppSecret: optional.NewString(conf.AppSecret),
		TenantSign: optional.NewString(conf.TenantSign),
		Version: optional.NewString(version),
		Timestamp: optional.NewString(timestamp),
		Signature: optional.NewString(signature),
	}

	r1, _, err := client.IsvApi.GetIsvList(context.Background())
	if err != nil {
		t.Error(err)
		return
	}
	t.Logf("isvList: %v", r1)

	r2, _, err := client.PhoneApi.GetPhoneList(context.Background(), req)
	if err != nil {
		t.Error(err)
		return
	}

	jsonBytes, _ := json.Marshal(r2)
	t.Logf("%s, requestId: %s", string(jsonBytes), r2.RequestId)
}
