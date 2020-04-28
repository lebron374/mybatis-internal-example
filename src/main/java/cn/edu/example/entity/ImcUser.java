package cn.edu.example.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author virgil.Wang
 * @date 2020/4/28 14:09
 */
@Data
public class ImcUser {

    private Integer userId;
    private String userNick;
    private String userPwd;
    private String sex;
    private String province;
    private String city;
    private String position;
    private String mem;
    private Integer expCnt;
    private Integer score;
    private Integer followCnt;
    private Integer fansCnt;
    private Integer isTeacher;
    private Date regTime;
    private Integer userStatus;

}
