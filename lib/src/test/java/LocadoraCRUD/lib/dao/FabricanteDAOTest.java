package LocadoraCRUD.lib.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FabricanteDAOTest {

    FabricanteDAO dao = new FabricanteDAO();

    @Test
    public void select() {
        Assertions.assertDoesNotThrow((() -> dao.select()));
    }

    @Test

    public void testSelect() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}