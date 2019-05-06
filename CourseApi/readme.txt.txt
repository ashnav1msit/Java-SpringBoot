CourseApi application is Restapi created on SpringBoot framework and JPA. File guide you to run the application and perform HTTP requests to API

What CourseApi does:

 - Create Topic with Parameters "String-id, String Name, String Description
 - List AllTopics
 - Update Topic
 - Delete Topic

 - Create Course with Parameters "String-id, String Name, String Description
 - Delete Course
 - List Courses
 - Update Course 

Commands to test application. Use on of the HTTPClient to perform following requests



Create Topic with Parameters:  Create post Request: 

		http://localhost:8080/topics 			{"id":"Java","name":"Java Course","description":"This is Spring boot example"}
		 http://localhost:8080/topics 			{"id":"JavaScript","name":"JavaScript Course","description":"This is Java script example"}


List All Topics: Run GET Request: 
		http://localhost:8080/topics

Update Topic: Run PUT Request

		http://localhost:8080/topics/Java		{"id":"test","name":"test ","description":"Java course changes"}

Delete Topic: Run DELETE Request:

		http://localhost:8080/topics/Java


List all courses for Topics: Create GET request
				http://localhost:8080/topics/Java/courses

Create course: Create POST request
		http://localhost:8080/topics/Java/courses 	{"id":"Test","name":"test","description":"description"}

Update Course: Create PUT request 
		http://localhost:8080/topics/Java/courses/Test 	{"id":"Test","name":"test","description":"description changed"}


Delete course: Create DELETE request
		http://localhost:8080/topics/Java/courses/Test




