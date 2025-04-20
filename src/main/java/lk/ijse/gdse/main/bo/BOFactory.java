package lk.ijse.gdse.main.bo;

import lk.ijse.gdse.main.bo.custom.Impl.SignUpBOImpl;
import lk.ijse.gdse.main.bo.custom.SignUpBO;

public class BOFactory {
    private static BOFactory boFactory;

    public BOFactory() {}

    public enum type{
        SIGNUP

    }

    public static BOFactory getInstance(){
        if(boFactory==null){
            boFactory=new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(type  type){
        switch (type){
            case SIGNUP:
                return new SignUpBOImpl();
                default: return null;
        }
    }
}
