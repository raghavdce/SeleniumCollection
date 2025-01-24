Feature: Validating place API

@AddPlace
Scenario Outline: Verify if place is being successfully added using AddPlaceAPI

	Given Add place payload with "<names>" "<Phone>" "<address>"
	When user calls "AddPlaceAPI" with "Post" http request
	Then the API call is success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_id maps to "<names>" using "GetPlaceAPI"
	
Examples:
	|names 					|	Phone								| 	address		 |
	|Niharika House	| (+91) 983 893 3937	| Sithalapakkam|
 #|Sharanya House | (+01) 987 789 9090	| Velachery		 |

@DeletePlace
Scenario: Verify if delete place functionality is working

Given Delete place payload
When user calls "DeletePlaceAPI" with "Post" http request
Then the API call is success with status code 200
And "status" in response body is "OK"
	