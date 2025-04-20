package lk.ijse.gdse.main.dao;


import lk.ijse.gdse.main.dao.custom.impl.UserDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {}



    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }
    public enum type{
        SIGNUP

    }

    public SuperDAO getDAO(DAOFactory.type type){
        switch (type){
            case SIGNUP:
                return new UserDAOImpl();
            default: return null;
        }
    }
}
