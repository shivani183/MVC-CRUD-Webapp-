package dao;

import dto.Student;

public interface IStudentDao {
	
	// operations to be implemented
	public String addStudent(Student student);

	public Student searchStudent(Integer sid);

	public String updateStudent(Student student);

	public String deleteStudent(Integer sid);

}
