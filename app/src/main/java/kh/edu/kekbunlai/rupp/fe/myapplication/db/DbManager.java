package kh.edu.kekbunlai.rupp.fe.myapplication.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import kh.edu.kekbunlai.rupp.fe.myapplication.Adapter.Document;

/**
 * Created by Kek Bunlai on 02-May-17.
 */

public class DbManager extends SQLiteOpenHelper {
    private final String DB_NAME = "ruppmad.db";
    private final int DB_VERSION = 1;
    public DbManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        // important are name and version
    }
    public DbManager(Context context)
    {
        super(context,"ruppmad.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tblDocumentSql = "craete table tblDocument"+"(_id integer primary key autoincrement, _title text, _thumnail_url text, _size integer)";
        db.execSQL(tblDocumentSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean insertDocument(Document document)
    {
        ContentValues row = new ContentValues();
        row.put("_title",document.getTitle());
        row.put("_thumnail_url",document.getThumNailUrl());
        row.put("_size",document.getSize());
        SQLiteDatabase db = getWritableDatabase();
        long newID = db.insert("tblDocument",null,row);
        return (newID < -1);
    }
}
