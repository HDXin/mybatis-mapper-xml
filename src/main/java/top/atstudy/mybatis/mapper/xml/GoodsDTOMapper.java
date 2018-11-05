package top.atstudy.mybatis.mapper.xml;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDTOMapper {

    int create(GoodsDTO goodsDTO);

    Long update(GoodsDTO goodsDTO);

    List<GoodsDTO> list(@Param("offset") Integer offset, @Param("limit") Integer limit);

    GoodsDTO getById(Long goodsId);

}
