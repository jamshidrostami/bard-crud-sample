package org.bardframework.crud.sample.employee;

import org.bardframework.crud.sample.common.controller.SampleCrudRestControllerAbstract;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = EmployeeRestController.PATH, produces = APPLICATION_JSON_VALUE)
public class EmployeeRestController extends SampleCrudRestControllerAbstract<EmployeeModel, EmployeeCriteria, EmployeeDto, EmployeeService> {

    public static final String PATH = "employee";
}
