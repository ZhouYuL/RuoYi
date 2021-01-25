package com.ruoyi;

import com.ruoyi.exam.TestExam;
import com.ruoyi.group.TestGroup;
import com.ruoyi.project.TestProject;

/**
 * @Author: ZhouYuLong
 * @date: Created in 16:39 2021/1/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new TestExam().helloTest());
        System.out.println(new TestGroup().helloTest());
        System.out.println(new TestProject().helloTest());
    }
}
