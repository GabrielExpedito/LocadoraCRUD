package LocadoraCRUD.lib.dao;

import LocadoraCRUD.lib.ConexaoBanco;
import LocadoraCRUD.lib.entity.Fabricante;
import LocadoraCRUD.lib.entity.Modelo;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModeloDAO implements BasicCrudDAO<Modelo> {

    @Override
    public Modelo select(Integer id) {
        String query = String.format("""
                       SELECT * FROM modelo WHERE id = %d;
                       
                       """, id);

        try (Statement stmt = ConexaoBanco.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setNome(rs.getString("nome"));
                modelo.setIdfabricante(rs.getInt("idfabricante"));

                return modelo;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        return null;
    }

    @Override
    public List<Modelo> select() {
        List<Modelo> listaEntidade = new ArrayList<>();
        String query = """
                       SELECT * FROM modelo;
                       
                       """;

        try (Statement stmt = ConexaoBanco.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setNome(rs.getString("nome"));
                modelo.setIdfabricante(rs.getInt("idfabricante"));

                listaEntidade.add(modelo);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        return listaEntidade;
    }

    @Override
    public int insert(Modelo modelo) {
        String query = String.format("""
                       INSERT INTO modelo (id, nome, idfabricante) VALUES(%d, '%s', %d) 
                       """, modelo.getId(), modelo.getNome(), modelo.getIdfabricante());

        try (Statement stmt = ConexaoBanco.getConn().createStatement();) {
            return stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Modelo modelo) {
        String query = String.format("""
                                     UPDATE modelo 
                                     SET 
                                        nome = '%s'
                                     WHERE 
                                        id= %d;
                                        idfabricante = %d
                                    """, modelo.getNome(), modelo.getId(), modelo.getIdfabricante());

        try (Statement stmt = ConexaoBanco.getConn().createStatement();) {
            return stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int delete(int id) {
        String query = String.format("""
                                     DELETE FROM modelo 
                                     WHERE 
                                        id= %d;  
                                    """, id);

        try (Statement stmt = ConexaoBanco.getConn().createStatement();) {
            return stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
