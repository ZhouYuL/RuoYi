package com.ruoyi.common.core.domain.entity;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * @Author: ZhouYuLong
 * @date: Created in 16:01 2021/1/23
 * @Description
 */
public class SysExam  extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 考试ID */
    @Excel(name = "考试序号", cellType = Excel.ColumnType.NUMERIC, prompt = "用户编号")
    private Long examId;

    /** 学期 */
    @Excel(name = "学期")
    private String examSemester;

    /** 课程名 */
    @Excel(name = "课程名")
    private String examProject;

    /** 学号 */
    @Excel(name = "用户邮箱")
    private String studentId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String studentName;

    /** 性别 */
    @Excel(name = "性别", readConverterExp = "0=男,1=女,2=未知")
    private String studentSex;

    /** 是否缺考 */
    @Excel(name = "是否缺考")
    private String isMiss;

    /** 成绩 */
    @Excel(name = "成绩")
    private String record;

    /** 考试时间 */
    @Excel(name = "考试时间")
    private String examTime;

    /** 是否不及格 */
    @Excel(name = "是否不及格")
    private String isFail;

}
