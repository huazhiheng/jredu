package com.example.heng.jredu.dao;

import android.database.sqlite.SQLiteDatabase;

import com.example.heng.jredu.entity.Vedio;
import com.example.heng.jredu.entity.ClassProj;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;



// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig vedioDaoConfig;
    private final DaoConfig classProjDaoConfig;

    private final VedioDao vedioDao;
    private final ClassProjDao classProjDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        vedioDaoConfig = daoConfigMap.get(VedioDao.class).clone();
        vedioDaoConfig.initIdentityScope(type);

        classProjDaoConfig = daoConfigMap.get(ClassProjDao.class).clone();
        classProjDaoConfig.initIdentityScope(type);

        vedioDao = new VedioDao(vedioDaoConfig, this);
        classProjDao = new ClassProjDao(classProjDaoConfig, this);

        registerDao(Vedio.class, vedioDao);
        registerDao(ClassProj.class, classProjDao);
    }
    
    public void clear() {
        vedioDaoConfig.getIdentityScope().clear();
        classProjDaoConfig.getIdentityScope().clear();
    }

    public VedioDao getVedioDao() {
        return vedioDao;
    }

    public ClassProjDao getClassProjDao() {
        return classProjDao;
    }

}
