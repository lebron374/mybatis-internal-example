package cn.edu.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

import javax.annotation.Resource;

import cn.edu.example.entity.ImcUser;

/**
 * @author virgil.Wang
 * @date 2020/4/28 14:01
 */
public class MybatisHelloWorld {

    public static void main(String[] args) {

        String resouce = "configuration.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resouce);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession = sqlSessionFactory.openSession();
            try {
                ImcUser imcUser = (ImcUser)sqlSession.selectOne("cn.edu.example.mapper.UserMapper.getById", 1);
                System.out.println(imcUser.getUserNick());
            } finally {
                sqlSession.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
