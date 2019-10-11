package com.example.projet_stories_master;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class PHPMyAdminHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="gamebook";
    private static final String TABLE_TALK="Repliques";

    private static final String KEY_ID="id_repliques", KEY_TEXT="texte_repliques",
            KEY_STATUS="statut_id_statut", KEY_CHAPTER ="id_chap_rep";

    public PHPMyAdminHandler(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }

    Repliques getRepliques(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_TALK, new String[]{KEY_ID,KEY_TEXT,KEY_STATUS,KEY_CHAPTER}, KEY_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null,null);
        if (cursor != null) {
            cursor.moveToFirst();
        }

        Repliques rep = new Repliques(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                Integer.parseInt(cursor.getString(2)),Integer.parseInt(cursor.getString(3)));

        return rep;
    }

    List<Repliques> getListRepliques(){
        List<Repliques> listRep = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + TABLE_TALK;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()){
            do {
                Repliques rep = new Repliques(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                        Integer.parseInt(cursor.getString(2)),Integer.parseInt(cursor.getString(3)));
                listRep.add(rep);
            } while (cursor.moveToNext());
        }
        return listRep;
    }
}
