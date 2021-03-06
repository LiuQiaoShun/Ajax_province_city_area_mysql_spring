package online.qsx.model;

import java.io.Serializable;

public class Area implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_area.id
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_area.areaID
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private Integer areaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_area.area
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private String area;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_area.father
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private Integer father;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bs_area
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_area.id
     *
     * @return the value of bs_area.id
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_area.id
     *
     * @param id the value for bs_area.id
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_area.areaID
     *
     * @return the value of bs_area.areaID
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_area.areaID
     *
     * @param areaid the value for bs_area.areaID
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_area.area
     *
     * @return the value of bs_area.area
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_area.area
     *
     * @param area the value for bs_area.area
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_area.father
     *
     * @return the value of bs_area.father
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public Integer getFather() {
        return father;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_area.father
     *
     * @param father the value for bs_area.father
     *
     * @mbggenerated Thu Apr 19 22:13:52 CST 2018
     */
    public void setFather(Integer father) {
        this.father = father;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_area
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
        sb.append(", areaid=").append(areaid);
        sb.append(", area=").append(area);
        sb.append(", father=").append(father);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}