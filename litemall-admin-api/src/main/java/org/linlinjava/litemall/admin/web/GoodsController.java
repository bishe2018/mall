package org.linlinjava.litemall.admin.web;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.admin.annotation.LoginAdmin;
import org.linlinjava.litemall.db.domain.LitemallGoods;
import org.linlinjava.litemall.db.service.LitemallGoodsService;
import org.linlinjava.litemall.db.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/goods")
public class GoodsController {
    private final Log logger = LogFactory.getLog(GoodsController.class);

    @Autowired
    private LitemallGoodsService goodsService;

    @GetMapping("/list")
    public Object list(@LoginAdmin Integer adminId,
                       String goodsSn, String name,
                       @RequestParam(value = "page", defaultValue = "1") Integer page,
                       @RequestParam(value = "limit", defaultValue = "10") Integer limit,
                       String sort, String order) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        List<LitemallGoods> goodsList = goodsService.querySelective(goodsSn, name, page, limit, sort, order);
        int total = goodsService.countSelective(goodsSn, name, page, limit, sort, order);
        Map<String, Object> data = new HashMap<>();
        data.put("total", total);
        data.put("items", goodsList);

        return ResponseUtil.ok(data);
    }

    @PostMapping("/create")
    public Object create(@LoginAdmin Integer adminId, @RequestBody Map goods, LitemallGoods goodsEntity) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }
        goodsEntity.setId(goods.get("id")!=null?Integer.valueOf(goods.get("id").toString()):0);
        goodsEntity.setGoodsSn(goods.get("goodsSn")!=null?goods.get("goodsSn").toString():"");
        goodsEntity.setName(goods.get("name")!=null?goods.get("name").toString():"");
        goodsEntity.setCategoryId(goods.get("categoryId")!=null?Integer.valueOf(goods.get("categoryId").toString()):0);
        goodsEntity.setBrandId(goods.get("brandId")!=null?Integer.valueOf(goods.get("brandId").toString()):0);
        goodsEntity.setKeywords(goods.get("keywords")!=null?goods.get("keywords").toString():"");
        goodsEntity.setGoodsBrief(goods.get("goodsBrif") != null ? goods.get("goodsBrif").toString() : "");
        goodsEntity.setIsOnSale(goods.get("isOnSale")!=null ? Boolean.valueOf(goods.get("isOnSale").toString()):false);
        goodsEntity.setSortOrder(goods.get("sortOrder")!=null?Short.valueOf(goods.get("sortOrder").toString()):0);
        goodsEntity.setCounterPrice(goods.get("counterPrice")!=null?BigDecimal.valueOf(Integer.valueOf(goods.
                get("counterPrice").toString())):null);
        goodsEntity.setIsNew(goods.get("isNew")!=null?Boolean.valueOf(goods.get("isNew").toString()):false);
        goodsEntity.setPrimaryPicUrl(goods.get("primaryPicUrl")!=null?goods.get("primaryPicUrl").toString():"");
        goodsEntity.setListPicUrl(goods.get("listPicUrl")!=null?goods.get("listPicUrl").toString():"");
        goodsEntity.setIsHot(goods.get("isHot")!=null?Boolean.valueOf(goods.get("isHot").toString()):false);
        goodsEntity.setGoodsUnit(goods.get("goodsUnit")!=null?goods.get("goodsUnit").toString():"");
        goodsEntity.setRetailPrice(goods.get("retailPrice")!=null?BigDecimal.valueOf(Integer.valueOf(goods.get("retailPrice")
                .toString())):null);
        goodsEntity.setGallery(goods.get("gallery")!=null?goods.get("gallery").toString().split(","):null);
//        if(gallery1!=null){
//            String[] array = gallery1.split(",");
//            goods.setGallery(array);
//        }
        goodsService.add(goodsEntity);
        return ResponseUtil.ok(goods);
    }

    @GetMapping("/read")
    public Object read(@LoginAdmin Integer adminId, Integer id) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }

        if (id == null) {
            return ResponseUtil.badArgument();
        }

        LitemallGoods goods = goodsService.findById(id);
        return ResponseUtil.ok(goods);
    }

    @PostMapping("/update")
    public Object update(@LoginAdmin Integer adminId, @RequestBody Map goods, LitemallGoods goodsEntity) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }
        goodsEntity.setId(Integer.valueOf(goods.get("id").toString()));
        goodsEntity.setGoodsSn(goods.get("goodsSn")!=null?goods.get("goodsSn").toString():"");
        goodsEntity.setName(goods.get("name")!=null?goods.get("name").toString():"");
        goodsEntity.setCategoryId(goods.get("categoryId")!=null?Integer.valueOf(goods.get("categoryId").toString()):0);
        goodsEntity.setBrandId(goods.get("brandId")!=null?Integer.valueOf(goods.get("brandId").toString()):0);
        goodsEntity.setKeywords(goods.get("keywords")!=null?goods.get("keywords").toString():"");
        goodsEntity.setGoodsBrief(goods.get("goodsBrif") != null ? goods.get("goodsBrif").toString() : "");
        goodsEntity.setIsOnSale(goods.get("isOnSale")!=null ? Boolean.valueOf(goods.get("isOnSale").toString()):false);
        goodsEntity.setSortOrder(goods.get("sortOrder")!=null?Short.valueOf(goods.get("sortOrder").toString()):0);
        goodsEntity.setCounterPrice(goods.get("counterPrice")!=null?BigDecimal.valueOf(Integer.valueOf(goods.
                get("counterPrice").toString())):null);
        goodsEntity.setIsNew(goods.get("isNew")!=null?Boolean.valueOf(goods.get("isNew").toString()):false);
        goodsEntity.setPrimaryPicUrl(goods.get("primaryPicUrl")!=null?goods.get("primaryPicUrl").toString():"");
        goodsEntity.setListPicUrl(goods.get("listPicUrl")!=null?goods.get("listPicUrl").toString():"");
        goodsEntity.setIsHot(goods.get("isHot")!=null?Boolean.valueOf(goods.get("isHot").toString()):false);
        goodsEntity.setGoodsUnit(goods.get("goodsUnit")!=null?goods.get("goodsUnit").toString():"");
        goodsEntity.setRetailPrice(goods.get("retailPrice")!=null?BigDecimal.valueOf(Integer.valueOf(goods.get("retailPrice")
                .toString())):null);
        goodsEntity.setGallery(goods.get("gallery")!=null?goods.get("gallery").toString().split(","):null);
//        if(gallery1!=null){
//            String[] array = gallery1.split(",");
//            goods.setGallery(array);
//        }
        goodsService.updateById(goodsEntity);
        return ResponseUtil.ok(goods);
    }

    @PostMapping("/delete")
    public Object delete(@LoginAdmin Integer adminId, @RequestBody LitemallGoods goods) {
        if (adminId == null) {
            return ResponseUtil.unlogin();
        }
        goodsService.deleteById(goods.getId());
        return ResponseUtil.ok();
    }

}
