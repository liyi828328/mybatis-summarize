package perseverance.li.mybatis;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import perseverance.li.mybatis.bean.EmpBean;
import perseverance.li.mybatis.dao.MybatisCUDDao;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisSummarizeApplicationTests {

    private Logger logger = LoggerFactory.getLogger(MybatisSummarizeApplicationTests.class);

    @Autowired
    private MybatisCUDDao cudDao;

    @Test
    void insertSingleEmp() {
        EmpBean emp = new EmpBean();
        emp.setName("王菲菲");
        emp.setAge(24);
        emp.setIdCard("131028198909831492");
        emp.setDeptNo(1001);
        Integer insertLine = cudDao.insertSingleEmp(emp);
        logger.info("insert line : " + insertLine);
        logger.info(emp.toString());
    }

    @Test
    void insertListEmp() {
        List<EmpBean> beanList = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            EmpBean emp = new EmpBean();
            emp.setName("李_" + i);
            emp.setAge(20 + i);
            emp.setIdCard("131028198909831492");
            emp.setDeptNo(1000 + i);
            beanList.add(emp);
        }
        Integer insertLine = cudDao.insertListEmp(beanList);
        logger.info("insert list data , line : " + insertLine);
        logger.info("list toString : " + beanList.toString());
    }

    @Test
    void deleteEmp() {
        Integer delLine = cudDao.deleteEmp(1);
        logger.info("del line : " + delLine);
    }

    @Test
    void updateEmp() {
        EmpBean empBean = new EmpBean();
        empBean.setId(2);
        empBean.setName("李飞飞");
        empBean.setAge(26);
        empBean.setIdCard("439019933990909183");
        empBean.setDeptNo(1002);
        Integer updateLine = cudDao.updateEmp(empBean);
        logger.info("update line : " + updateLine);
    }

}
