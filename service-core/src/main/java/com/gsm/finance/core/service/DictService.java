package com.gsm.finance.core.service;

import com.gsm.finance.core.dto.ExcelDictDTO;
import com.gsm.finance.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author gsm
 * @since 2023-09-18
 */
public interface DictService extends IService<Dict> {
    void importData(InputStream inputStream);
    List<ExcelDictDTO> listDictData();
    List<Dict> listByParentId(Long parentId);
}
