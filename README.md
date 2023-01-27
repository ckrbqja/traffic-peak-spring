# Peak Test 요구사항

> 외부 시스템을 사용하는 이커머스 반품배송 상황 추적
> [링크](https://butter-science-a89.notion.site/Peak-Test-93675528af45413b878681d1c29e37bf)

## 결과송신 API

- ### Request Parameter

| Field             | Type |  Required  | Description       |
|-------------------|------|:----------:|-------------------|
| order_number      |String|     Y      | 주문번호           |
| order_item_number |String|     Y      | 주문일련번호        |
| result_object     |String|     Y      | 최종 결과 Object   |

- ### Payload

| Field   | Type | Description    |
|---------|------|----------------|
| result  |Boolean| 처리결과        |
| message |String| 처리 결과 메세지  |
| data    |Object| 처리 데이터      |

