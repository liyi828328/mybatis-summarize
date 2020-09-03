package perseverance.li.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import perseverance.li.mybatis.bean.DeptBean;
import perseverance.li.mybatis.bean.EmpBean;

import java.util.List;

/**
 * ---------------------------------------------------------------
 * Author: LiYi
 * Email: yi.li@yulore.com
 * Create: 2020-09-03 10:10
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 2020-09-03 10:10 : Create by LiYi
 * ---------------------------------------------------------------
 */
@Component
@Mapper
public interface MybatisSelectDao {

    /**
     * 查询全部使用join方式
     *
     * @return
     */
    List<EmpBean> selectAllEmp();

    /**
     * 根据id查询emp
     *
     * @param empId
     * @return
     */
    EmpBean selectEmpById(Integer empId);

    /**
     * 查询全部使用单条sql方式
     *
     * @return
     */
    List<EmpBean> selectAllEmp2();

    /**
     * 查询全部使用join方式
     *
     * @return
     */
    List<DeptBean> selectAllDept();

    /**
     * 查询全部使用单条sql方式
     *
     * @return
     */
    List<DeptBean> selectAllDept2();

    /**
     * 根据dept_no查询emp
     *
     * @param deptNo
     * @return
     */
    List<EmpBean> selectEmpByDeptNo(Integer deptNo);

    /**
     * 根据dept_no查询dept
     *
     * @param deptNo
     * @return
     */
    DeptBean selectDeptByDeptNo(Integer deptNo);
}
