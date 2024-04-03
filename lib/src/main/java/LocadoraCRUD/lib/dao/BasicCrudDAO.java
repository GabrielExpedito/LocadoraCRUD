package LocadoraCRUD.lib.dao;

import LocadoraCRUD.lib.ConexaoBanco;
import LocadoraCRUD.lib.entity.Fabricante;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public interface BasicCrudDAO<ENTITY> {

    public ENTITY select(Integer id);

    public List<ENTITY> select();

    public int insert(ENTITY entidade);

    public int update(ENTITY entidade);

    public int delete(int id);

}
