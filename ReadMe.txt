#Project Details
----------------------

######################################################
1. Project - spring-drools-integration
=> How to integrate Spring With Drool engine

Steps :
	
	1. Create Spring Starter Project (Spring Boot Project)
	2. Run the spring boot project
	3. It will by default run on port 8080
	4. Refer Order.drl file and see the discount on different banks card type
	5. Test it through Postman Tool.
	6. Open Postman Tool
	7. Set method as POST
	8. Add in URL - http://localhost:8080/order
	9. Select Body -> raw -> JSON (application/json)
	10.   	Request -
		{
			"name" :"Mobile",
			"cardType" : "ICICI",
			"price" : 17000
		}
	11. Hit send
	12. In the response you will get -
	 	Response -
		{
			"name": "Mobile",
			"cardType": "ICICI",
			"discount": 8,
			"price": 17000
		}
	13. This is how you can test drools rules with spring boot application

Reference :

GitHub Repo Link 	- https://github.com/Java-Techie-jt
					- https://github.com/Java-Techie-jt/spring-drools
YouTube Link 		- https://www.youtube.com/watch?v=UuZ7pZ_1JDE

######################################################