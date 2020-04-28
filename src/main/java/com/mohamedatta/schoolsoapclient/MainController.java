package com.mohamedatta.schoolsoapclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamedatta.school.schemas.students.StudentDetailsRequest;
import com.mohamedatta.school.schemas.students.StudentDetailsResponse;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	SOAPConnector	soapConnector;
	@GetMapping
	StudentDetailsResponse getStudentInfo() {
		StudentDetailsRequest request = new StudentDetailsRequest();
        request.setId(1);
        StudentDetailsResponse response =(StudentDetailsResponse) soapConnector.callWebService("http://localhost:1234/service", request);
        System.out.println("Got Response As below ========= : ");
        System.out.println("Name : "+response.getStudent().getName());
        System.out.println("Standard : "+response.getStudent().getStandard());
        System.out.println("Address : "+response.getStudent().getAddress());
        return response;
	}
}
