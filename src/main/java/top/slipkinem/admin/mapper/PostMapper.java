package top.slipkinem.admin.mapper;

import top.slipkinem.admin.po.Post;
import top.slipkinem.admin.po.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    long countByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int deleteByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int deleteByPrimaryKey(Integer postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    List<Post> selectByExampleWithBLOBs(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    List<Post> selectByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    Post selectByPrimaryKey(Integer postId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_post
     *
     * @mbg.generated Thu May 25 10:08:55 CST 2017
     */
    int updateByPrimaryKey(Post record);
}