package perseverance.li.mybatis.bean;

import java.util.List;

/**
 * ---------------------------------------------------------------
 * Author: LiYi
 * Email: yi.li@yulore.com
 * Create: 2020-09-03 11:28
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 2020-09-03 11:28 : Create by LiYi
 * ---------------------------------------------------------------
 */
public class DeptBean {

    private Integer deptId;
    private Integer deptNo;
    private String deptName;
    private List<EmpBean> empBeanList;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<EmpBean> getEmpBeanList() {
        return empBeanList;
    }

    public void setEmpBeanList(List<EmpBean> empBeanList) {
        this.empBeanList = empBeanList;
    }

    @Override
    public String toString() {
        return "DeptBean{" +
                "deptId=" + deptId +
                ", deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                ", empBeanList=" + empBeanList +
                '}';
    }
}
