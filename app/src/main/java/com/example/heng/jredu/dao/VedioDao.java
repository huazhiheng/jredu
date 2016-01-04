package com.example.heng.jredu.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import com.example.heng.jredu.entity.Vedio;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "vedio".
*/
public class VedioDao extends AbstractDao<Vedio, Long> {

    public static final String TABLENAME = "vedio";

    /**
     * Properties of entity Vedio.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Vedioid = new Property(1, String.class, "vedioid", false, "VEDIOID");
        public final static Property VedioName = new Property(2, String.class, "vedioName", false, "VEDIO_NAME");
        public final static Property VUri = new Property(3, String.class, "VUri", false, "VURI");
        public final static Property ProjId = new Property(4, String.class, "projId", false, "PROJ_ID");
        public final static Property Instruction = new Property(5, String.class, "instruction", false, "INSTRUCTION");
        public final static Property Author = new Property(6, String.class, "author", false, "AUTHOR");
        public final static Property PubDate = new Property(7, String.class, "pubDate", false, "PUB_DATE");
        public final static Property VPickUri = new Property(8, String.class, "VPickUri", false, "VPICK_URI");
        public final static Property Flag = new Property(9, String.class, "flag", false, "FLAG");
    };


    public VedioDao(DaoConfig config) {
        super(config);
    }
    
    public VedioDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"vedio\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"VEDIOID\" TEXT," + // 1: vedioid
                "\"VEDIO_NAME\" TEXT," + // 2: vedioName
                "\"VURI\" TEXT," + // 3: VUri
                "\"PROJ_ID\" TEXT," + // 4: projId
                "\"INSTRUCTION\" TEXT," + // 5: instruction
                "\"AUTHOR\" TEXT," + // 6: author
                "\"PUB_DATE\" TEXT," + // 7: pubDate
                "\"VPICK_URI\" TEXT," + // 8: VPickUri
                "\"FLAG\" TEXT);"); // 9: flag
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"vedio\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Vedio entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String vedioid = entity.getVedioid();
        if (vedioid != null) {
            stmt.bindString(2, vedioid);
        }
 
        String vedioName = entity.getVedioName();
        if (vedioName != null) {
            stmt.bindString(3, vedioName);
        }
 
        String VUri = entity.getVUri();
        if (VUri != null) {
            stmt.bindString(4, VUri);
        }
 
        String projId = entity.getProjId();
        if (projId != null) {
            stmt.bindString(5, projId);
        }
 
        String instruction = entity.getInstruction();
        if (instruction != null) {
            stmt.bindString(6, instruction);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(7, author);
        }
 
        String pubDate = entity.getPubDate();
        if (pubDate != null) {
            stmt.bindString(8, pubDate);
        }
 
        String VPickUri = entity.getVPickUri();
        if (VPickUri != null) {
            stmt.bindString(9, VPickUri);
        }
 
        String flag = entity.getFlag();
        if (flag != null) {
            stmt.bindString(10, flag);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Vedio readEntity(Cursor cursor, int offset) {

        Vedio entity = new Vedio( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // vedioid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // vedioName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // VUri
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // projId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // instruction
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // author
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // pubDate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // VPickUri
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // flag
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Vedio entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVedioid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setVedioName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setVUri(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setProjId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setInstruction(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAuthor(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPubDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setVPickUri(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setFlag(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Vedio entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Vedio entity) {
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
