package cn.edu.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

import javax.annotation.Resource;

import cn.edu.example.entity.ImcUser;
import cn.edu.example.mapper.UserMapper;

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
                UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
                // ImcUser imcUser = userMapper.getById(1);
                // System.out.println(imcUser.getUserNick());
                int rowEffects = userMapper.updateSexById("1", 1);
                System.out.println(rowEffects);
            } finally {
                sqlSession.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
