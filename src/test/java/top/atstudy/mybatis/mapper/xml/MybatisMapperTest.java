package top.atstudy.mybatis.mapper.xml;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisMapperTest {


    /**
     * 获取 SqlSession 对象
     * @return
     */
    public SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            sqlSession = sqlSessionFactory.openSession();
            System.out.println(" ===>> sqlSession: " + sqlSession.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

    /**
     * 关闭 sqlSession
     * @param sqlSession
     */
    public void closeSqlSession(SqlSession sqlSession){
        if(sqlSession != null){
            sqlSession.close();
        }
    }

    @Test
    public void testCreate(){
        //1.获取 SqlSession 对象
        SqlSession sqlSession = getSqlSession();

        //2.
        GoodsDTO goodsDTO = new GoodsDTO();
        goodsDTO.setStoreId(12L);
        goodsDTO.setStoreName("自营店");
        goodsDTO.setTitle("袜子");
        goodsDTO.setTags("促销处理中");
        goodsDTO.setGoodsCode("123ABC");
        goodsDTO.setGoodsType("IMAGE");

        GoodsDTOMapper goodsDTOMapper = sqlSession.getMapper(GoodsDTOMapper.class);
        int rows = goodsDTOMapper.create(goodsDTO);

        System.out.println(" ===>> create by dto, rows: " + rows);
        System.out.println(" ===>> create by dto, goodsDTO: " + goodsDTO.toString());

        //3.关闭session
        sqlSession.commit();
        closeSqlSession(sqlSession);
    }


    /**
     * 根据 ID 获取
     */
    @Test
    public void testGetById(){
        //1.获取 SqlSession 对象
        SqlSession sqlSession = getSqlSession();

        //2.
        GoodsDTOMapper goodsDTOMapper = sqlSession.getMapper(GoodsDTOMapper.class);
        GoodsDTO goodsDTO = goodsDTOMapper.getById(11L);
        System.out.println(" goods: " + goodsDTO.toString());

        //3.关闭 sqlSession
        closeSqlSession(sqlSession);
    }


}
