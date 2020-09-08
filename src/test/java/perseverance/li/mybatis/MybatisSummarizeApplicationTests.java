package perseverance.li.mybatis;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import perseverance.li.mybatis.bean.DeptBean;
import perseverance.li.mybatis.bean.EmpBean;
import perseverance.li.mybatis.dao.MybatisCUDDao;
import perseverance.li.mybatis.dao.MybatisSelectDao;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisSummarizeApplicationTests {

    private Logger logger = LoggerFactory.getLogger(MybatisSummarizeApplicationTests.class);

    @Autowired
    private MybatisCUDDao cudDao;
    @Autowired
    private MybatisSelectDao selectDao;

    @Test
    void insertSingleEmp() {
        EmpBean emp = new EmpBean();
        emp.setName("王菲菲");
        emp.setAge(24);
        emp.setIdCard("131028198909831492");
        emp.setDeptNo(1001);
        int insertLine = cudDao.insertSingleEmp(emp);
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
        int insertLine = cudDao.insertListEmp(beanList);
        logger.info("insert list data , line : " + insertLine);
        logger.info("list toString : " + beanList.toString());
    }

    @Test
    void deleteEmp() {
        int delLine = cudDao.deleteEmp(2);
        logger.info("del line : " + delLine);
    }

    @Test
    void updateEmp() {
        EmpBean empBean = new EmpBean();
        empBean.setEmpId(3);
        empBean.setName("李飞飞");
        empBean.setAge(26);
        empBean.setIdCard("439019933990909183");
        empBean.setDeptNo(1002);
        int updateLine = cudDao.updateEmp(empBean);
        logger.info("update line : " + updateLine);
    }

    @Test
    void selectAllEmp() {
        //使用二级缓存查询
        List<EmpBean> beanList = selectDao.selectAllEmp();
        logger.info(beanList.toString());

        logger.info("+++++++++++++++++++++++++++++++");
        List<EmpBean> beanList2 = selectDao.selectAllEmp();
        logger.info(beanList2.toString());

        logger.info("+++++++++++++++++++++++++++++++");
        List<EmpBean> beanList3 = selectDao.selectAllEmp();
        logger.info(beanList3.toString());
    }

    @Test
    void selectAllEmp2() {
        List<EmpBean> beanList = selectDao.selectAllEmp2();
        logger.info(beanList.toString());
    }

    @Test
    void selectAllDept() {
        List<DeptBean> deptBeans = selectDao.selectAllDept();
        logger.info(deptBeans.toString());
    }

    @Test
    void selectAllDept2() {
        List<DeptBean> deptBeans = selectDao.selectAllDept2();
        logger.info(deptBeans.toString());
    }


    @Test
    void selectEmpByDeptNo() {
        List<EmpBean> beanList = selectDao.selectEmpByDeptNo(1001);
        logger.info(beanList.toString());
    }

    @Test
    void selectDeptByDeptNo() {
        DeptBean deptBean = selectDao.selectDeptByDeptNo(1002);
        logger.info(deptBean.toString());
    }

    @Test
    void selectEmpById(){
        EmpBean empBean = selectDao.selectEmpById(3);
        logger.info(empBean.getName());
//        logger.info(empBean.getDeptBean().getDeptName());
    }
}
