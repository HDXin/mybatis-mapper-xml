package top.atstudy.mybatis.mapper.xml;

public class GoodsDTO {

    private Long goodsId;
    private String title;
    private String tags;
    private String goodsCode;
    private String goodsType;
    private Long storeId;
    private String storeName;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "GoodsDTO{" +
                "goodsId=" + goodsId +
                ", title='" + title + '\'' +
                ", tags='" + tags + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                '}';
    }
}
