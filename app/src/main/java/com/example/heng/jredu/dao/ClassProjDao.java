package com.example.heng.jredu.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.heng.jredu.entity.ClassProj;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "classProj".
*/
public class ClassProjDao extends AbstractDao<ClassProj, Long> {

    public static final String TABLENAME = "classProj";

    /**
     * Properties of entity ClassProj.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ProjId = new Property(1, String.class, "projId", false, "PROJ_ID");
        public final static Property RgdtDate = new Property(2, String.class, "rgdtDate", false, "RGDT_DATE");
        public final static Property EndDate = new Property(3, String.class, "endDate", false, "END_DATE");
        public final static Property Remark = new Property(4, String.class, "remark", false, "REMARK");
        public final static Property PhotoUri = new Property(5, String.class, "photoUri", false, "PHOTO_URI");
        public final static Property VedioCt = new Property(6, String.class, "vedioCt", false, "VEDIO_CT");
    };


    public ClassProjDao(DaoConfig config) {
        super(config);
    }
    
    public ClassProjDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"classProj\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PROJ_ID\" TEXT," + // 1: projId
                "\"RGDT_DATE\" TEXT," + // 2: rgdtDate
                "\"END_DATE\" TEXT," + // 3: endDate
                "\"REMARK\" TEXT," + // 4: remark
                "\"PHOTO_URI\" TEXT," + // 5: photoUri
                "\"VEDIO_CT\" TEXT);"); // 6: vedioCt
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"classProj\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ClassProj entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String projId = entity.getProjId();
        if (projId != null) {
            stmt.bindString(2, projId);
        }
 
        String rgdtDate = entity.getRgdtDate();
        if (rgdtDate != null) {
            stmt.bindString(3, rgdtDate);
        }
 
        String endDate = entity.getEndDate();
        if (endDate != null) {
            stmt.bindString(4, endDate);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(5, remark);
        }
 
        String photoUri = entity.getPhotoUri();
        if (photoUri != null) {
            stmt.bindString(6, photoUri);
        }
 
        String vedioCt = entity.getVedioCt();
        if (vedioCt != null) {
            stmt.bindString(7, vedioCt);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ClassProj readEntity(Cursor cursor, int offset) {
        ClassProj entity = new ClassProj( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // projId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // rgdtDate
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // endDate
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // remark
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // photoUri
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // vedioCt
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ClassProj entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setProjId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setRgdtDate(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEndDate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRemark(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPhotoUri(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setVedioCt(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ClassProj entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ClassProj entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
