package dao;

import dao.IDao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        return Math.random()*40;
    }
}
