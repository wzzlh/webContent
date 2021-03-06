package top.slipkinem.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.slipkinem.admin.mapper.TableDataMapper;
import top.slipkinem.admin.po.TableData;
import top.slipkinem.admin.po.TableDataExample;
import top.slipkinem.admin.service.TableService;
import top.slipkinem.common.beans.PageBean;

import java.util.List;

import static top.slipkinem.common.utils.CheckUtil.check;
import static top.slipkinem.common.utils.CheckUtil.notNull;

/**
 * Created by slipkinem on 2017/4/5.
 */

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TableDataMapper tabledataMapper;

    @Override
    public PageBean<TableData> getTableData(Integer PageNum, Integer PageSize) {
        notNull(PageNum, "param.is.null");
        notNull(PageSize, "param.is.null");

        PageHelper.startPage(PageNum, PageSize);
        List<TableData> list = tabledataMapper.selectByExample(new TableDataExample());
        PageInfo<TableData> page = new PageInfo<>(list);
        return new PageBean<>(page);
    }

    @Override
    public Boolean deleteTable(Integer id) {
        notNull(id, "param.is.null");
        check(id < Integer.MAX_VALUE, "id.error");

        return tabledataMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public Boolean updateTable(TableData tableData) {
        return tabledataMapper.updateByPrimaryKey(tableData) > 0;
    }

    @Override
    public Integer addTable(TableData tableData) {
        return tabledataMapper.insertSelective(tableData);
    }
}
