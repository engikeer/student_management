package hand.dao;

import com.hand.home.dao.StudentMapper;
import com.hand.home.pojo.Student;
import hand.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class StudentMapperTest extends BaseTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testGetStudentByAge() {
        Student student =  studentMapper.getStudentByAge(19);
        System.out.println(student.getName());
    }

    @Test
    public void testInsertStudent() {
        Student mengzi = new Student("孟子", 41);
        studentMapper.insertStudent(mengzi);
    }


}
