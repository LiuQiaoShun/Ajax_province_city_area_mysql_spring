package online.qsx.model;

import java.io.Serializable;

public class Province implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_province.id
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_province.provinceID
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private Long provinceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_province.province
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bs_province
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_province.id
     *
     * @return the value of bs_province.id
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_province.id
     *
     * @param id the value for bs_province.id
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_province.provinceID
     *
     * @return the value of bs_province.provinceID
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public Long getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_province.provinceID
     *
     * @param provinceid the value for bs_province.provinceID
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_province.province
     *
     * @return the value of bs_province.province
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_province.province
     *
     * @param province the value for bs_province.province
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_province
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", provinceid=").append(provinceid);
        sb.append(", province=").append(province);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}