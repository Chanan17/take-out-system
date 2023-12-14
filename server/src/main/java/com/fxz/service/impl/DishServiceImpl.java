package com.fxz.service.impl;

import com.fxz.dto.DishDTO;
import com.fxz.dto.DishPageQueryDTO;
import com.fxz.entity.Dish;
import com.fxz.entity.DishFlavor;
import com.fxz.mapper.DishFlavorMapper;
import com.fxz.mapper.DishMapper;
import com.fxz.result.PageResult;
import com.fxz.service.DishService;
import com.fxz.vo.DishVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: take-out-system
 * @package: com.fxz.service
 * @className: DishServiceImpl
 * @author: fxz
 * @description: TODO
 * @date: 2023/12/14 23:09
 */
@Service
@Slf4j
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;
    @Autowired
    private DishFlavorMapper dishFlavorMapper;

    @Override
    public void saveWithFlavor(DishDTO dishDTO) {
        Dish dish = new Dish();

        BeanUtils.copyProperties(dishDTO, dish);

        //向菜品表插入1条数据
        dishMapper.insert(dish);

        //获取insert语句生成的主键值
        Long dishId = dish.getId();

        List<DishFlavor> flavors = dishDTO.getFlavors();
        if (flavors != null && flavors.size() > 0) {
            flavors.forEach(dishFlavor -> {
                dishFlavor.setDishId(dishId);
            });
            //向口味表插入n条数据
            dishFlavorMapper.insertBatch(flavors);
        }
    }

    @Override
    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO) {
        return null;
    }

    @Override
    public void deleteBatch(List<Long> ids) {

    }

    @Override
    public DishVO getByIdWithFlavor(Long id) {
        return null;
    }

    @Override
    public void updateWithFlavor(DishDTO dishDTO) {

    }

    @Override
    public void startOrStop(Integer status, Long id) {

    }

    @Override
    public List<Dish> list(Long categoryId) {
        return null;
    }

    @Override
    public List<DishVO> listWithFlavor(Dish dish) {
        return null;
    }
}
