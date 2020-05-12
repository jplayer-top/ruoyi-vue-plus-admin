package com.ruoyi.project.cstest.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.io.Serializable;
import java.util.Date;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 测试对象 chkj_test
 * 
 * @author Lion Li
 * @date 2020-05-12
 */
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Accessors(chain = true)
@TableName("chkj_test")
public class CsTest implements Serializable {

private static final long serialVersionUID=1L;


    /** 主键 */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /** key键 */
    @Excel(name = "key键")
    private String testKey;

    /** 值 */
    @Excel(name = "值")
    private String value;

    /** 版本 */
    private Integer version;

    /** 创建时间 */
    @Excel(name = "创建时间" , width = 30, dateFormat = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 删除状态 */
    private Integer deleted;
}
