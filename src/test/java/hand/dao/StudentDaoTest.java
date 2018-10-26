package hand.dao;

import com.hand.home.dao.StudentDao;
import com.hand.home.pojo.Student;
import hand.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class StudentDaoTest extends BaseTest{
    @Autowired
    private StudentDao<Student> studentDao;

    @Test
    public void testInsert() {
        Student laozi = new Student("老子", 79);
        Assert.assertTrue("插入失败", studentDao.insert(laozi));

    }

}
