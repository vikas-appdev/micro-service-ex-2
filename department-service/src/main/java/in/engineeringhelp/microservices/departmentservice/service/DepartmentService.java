package in.engineeringhelp.microservices.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.engineeringhelp.microservices.departmentservice.entity.Department;
import in.engineeringhelp.microservices.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long id) {
		return departmentRepository.findByDepartmentId(id);
	}

}
