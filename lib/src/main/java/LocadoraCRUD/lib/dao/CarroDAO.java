package LocadoraCRUD.lib.dao;

import LocadoraCRUD.lib.ConexaoBanco;
import LocadoraCRUD.lib.entity.Carro;
import LocadoraCRUD.lib.entity.Fabricante;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO implements BasicCrudDAO<Carro> {

    public Carro select(Integer id) {
        String query = String.format("""
                       SELECT * FROM carros WHERE id = %d;
                       
                       """, id);

        try (Statement stmt = ConexaoBanco.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.setId(rs.getInt("id"));
                fabricante.setNome(rs.getString("nome"));

                return carro;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        return null;
    }

    public List<Fabricante> select() {
        List<Fabricante> listaFabricante = new ArrayList<>();
        String query = """
                       SELECT * FROM fabricante;
                       
                       """;

        try (Statement stmt = ConexaoBanco.getConn().createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Fabricante fabricante = new Fabricante();
                fabricante.setId(rs.getInt("id"));
                fabricante.setNome(rs.getString("nome"));

                listaFabricante.add(fabricante);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
        return listaFabricante;
    }

    @Override
    public int insert(Fabricante entidade) {
        String query = String.format("""
                       INSERT INTO fabricante (id, nome) VALUES(%d, '%s') 
                       """, entidade.getId(), entidade.getId());

        try (Statement stmt = ConexaoBanco.getConn().createStatement();) {
            return stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int update(Fabricante fabricante) {
        String query = String.format("""
                                     UPDATE fabricante 
                                     SET 
                                        nome = '%s'
                                     WHERE 
                                        id= %d;  
                                    """, fabricante.getNome(), fabricante.getId());

        try (Statement stmt = ConexaoBanco.getConn().createStatement();) {
            return stmt.executeUpdate(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public int delete(int id) {
        String query = String.format("""
                                     DELETE FROM fabricante 
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
