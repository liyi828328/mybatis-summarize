package perseverance.li.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import perseverance.li.mybatis.bean.EmpBean;

import java.util.List;

/**
 * ---------------------------------------------------------------
 * Author: LiYi
 * Email: yi.li@yulore.com
 * Create: 2020-09-03 10:09
 * ---------------------------------------------------------------
 * Describe:
 * <p>
 * mybatis insert update delete
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 2020-09-03 10:09 : Create by LiYi
 * ---------------------------------------------------------------
 */
@Component
@Mapper
public interface MybatisCUDDao {

    /**
     * 插入emp数据
     *
     * @param empBean
     * @return
     */
    int insertSingleEmp(EmpBean empBean);

    /**
     * 批量插入emp数据
     *
     * @param empBeanList
     * @return
     */
    int insertListEmp(List<EmpBean> empBeanList);

    /**
     * 删除
     *
     * @param empId
     * @return
     */
    int deleteEmp(Integer empId);

    /**
     * 更新
     *
     * @param emp
     * @return
     */
    int updateEmp(EmpBean emp);
}
